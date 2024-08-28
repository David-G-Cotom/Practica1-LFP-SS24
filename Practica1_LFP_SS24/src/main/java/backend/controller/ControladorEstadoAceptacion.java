/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.controller;

import backend.model.Estado;
import backend.model.TipoToken;
import java.util.HashMap;

/**
 *
 * @author Carlos Cotom
 */
public class ControladorEstadoAceptacion {

    private HashMap<Estado, TipoToken> mapaEstadoAceptacion;

    public ControladorEstadoAceptacion() {
        this.mapaEstadoAceptacion = new HashMap<>();
        
        this.mapaEstadoAceptacion.put(Estado.S1, TipoToken.IDENTIFICADOR);
        this.mapaEstadoAceptacion.put(Estado.S2, TipoToken.ENTERO);
        this.mapaEstadoAceptacion.put(Estado.S3, TipoToken.DECIMAL);
        this.mapaEstadoAceptacion.put(Estado.S5, TipoToken.CADENA);
        this.mapaEstadoAceptacion.put(Estado.S8, TipoToken.CARACTER);
        this.mapaEstadoAceptacion.put(Estado.S9, TipoToken.COMENTARIO);
        this.mapaEstadoAceptacion.put(Estado.S10, TipoToken.EXPONENTE);        
        this.mapaEstadoAceptacion.put(Estado.S12, TipoToken.ASIGNACION_COPMPUESTA);
        this.mapaEstadoAceptacion.put(Estado.S13, TipoToken.ASIGNACION_SIMPLE);
        this.mapaEstadoAceptacion.put(Estado.S14, TipoToken.IGUAL);
        this.mapaEstadoAceptacion.put(Estado.S15, TipoToken.MENOR_QUE);
        this.mapaEstadoAceptacion.put(Estado.S16, TipoToken.DIFERENTE);
        this.mapaEstadoAceptacion.put(Estado.S17, TipoToken.MENOR_IGUAL_QUE);
        this.mapaEstadoAceptacion.put(Estado.S18, TipoToken.MAYOR_QUE);
        this.mapaEstadoAceptacion.put(Estado.S19, TipoToken.MAYOR_IGUAL_QUE);
        this.mapaEstadoAceptacion.put(Estado.S20, TipoToken.PARENTESIS);
        this.mapaEstadoAceptacion.put(Estado.S21, TipoToken.LLAVE);
        this.mapaEstadoAceptacion.put(Estado.S22, TipoToken.CORCHETE);
        this.mapaEstadoAceptacion.put(Estado.S23, TipoToken.COMA);
        this.mapaEstadoAceptacion.put(Estado.S24, TipoToken.PUNTO);
        //this.mapaEstadoAceptacion.put(Estado.S25, TipoToken.PALABRA_RESERVADA);
        this.mapaEstadoAceptacion.put(Estado.S28, TipoToken.SQUARE_SIMPLE);
        this.mapaEstadoAceptacion.put(Estado.S33, TipoToken.SQUARE_COMPLETO);        
        this.mapaEstadoAceptacion.put(Estado.SE, TipoToken.ERROR);
    }    
    
    public TipoToken getTipoToken(Estado estadoActual) {
        TipoToken resultado = this.mapaEstadoAceptacion.get(estadoActual);
        if (resultado != null) {
            return this.mapaEstadoAceptacion.get(estadoActual);            
        }
        return TipoToken.ERROR;
    }
    
}
