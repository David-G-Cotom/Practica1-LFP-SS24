/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.model;

import backend.controller.ControladorAlfabeto;
import backend.controller.ControladorEstadoAceptacion;
import backend.controller.ControladorFunsionTransicion;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Carlos Cotom
 */
public class AnalizadorLexico {
    
    private ControladorFunsionTransicion funsionTransicion;
    private int linea;
    private int columna;
    private int posicionContenido;
    private String contenido;
    private boolean isArchivoLeido;
    private ControladorAlfabeto alfabetoControler;
    private StringBuilder palabraTemporal;
    private ControladorEstadoAceptacion estadoAceptacion;

    public AnalizadorLexico() {
        this.funsionTransicion = new ControladorFunsionTransicion();
        this.isArchivoLeido = false;
        this.alfabetoControler = new ControladorAlfabeto();
        this.palabraTemporal = new StringBuilder();
        this.estadoAceptacion = new ControladorEstadoAceptacion();
    }
    
    public boolean leerArchivo(String path) {
        try {
            this.contenido = new String(Files.readAllBytes(Paths.get(path)));
        } catch (IOException ex) {
            return false;
        }
        this.isArchivoLeido = true;
        this.linea = 0;
        this.columna = 0;
        this.posicionContenido = 0;
        return true;
    }
    
    public boolean isFinArchivo() throws IOException {
        if (!isArchivoLeido) {
            throw new IOException();
        }
        this.ignorarEspaciosBlanco();
        return this.posicionContenido >= this.contenido.length();
    }
    
    private void ignorarEspaciosBlanco() {
        while (this.posicionContenido < this.contenido.length()) {
            if (this.alfabetoControler.isNuevaLinea(this.contenido.charAt(this.posicionContenido))) {
                this.posicionContenido++;
                this.linea++;
                this.columna = 0;
                continue;
            }
            if (this.alfabetoControler.isEspacioBlanco(this.contenido.charAt(this.posicionContenido))) {
                this.posicionContenido++;
                this.columna++;
                continue;
            }
            break;
        }
    }
    
    public Token getToken() throws IOException {
        if (!isArchivoLeido) {
            throw new IOException();
        }
        this.ignorarEspaciosBlanco();
        this.palabraTemporal = new StringBuilder();
        Estado estadoActual = this.funsionTransicion.getESTADO_INICIAL();
        char charActual;
        Estado estadoTemporal = estadoActual;
        Alfabeto alfabetoSimbolo;
        int lineaInicial = this.linea;
        int columnaInicial = this.columna;
        do {
            estadoActual = estadoTemporal;
            charActual = contenido.charAt(this.posicionContenido);
            alfabetoSimbolo = this.alfabetoControler.getAlfabeto(charActual);
            estadoTemporal = this.funsionTransicion.produccion(estadoActual, alfabetoSimbolo);
            if (estadoTemporal.equals(Estado.SF)) {
                break;
            }
            this.columna++;
            this.posicionContenido++;
            this.palabraTemporal.append(charActual);
            if (alfabetoSimbolo == Alfabeto.NUEVA_LINEA) {
                this.linea++;
            }
            if (estadoTemporal.equals(Estado.SE)) {
                break;
            }
        } while (this.posicionContenido < this.contenido.length());
        if (estadoTemporal.equals(Estado.SE)) {
            estadoActual = estadoTemporal;
        }
        return new Token(this.estadoAceptacion.getTipoToken(estadoActual), lineaInicial, columnaInicial, this.palabraTemporal.toString());
    }
    
}
