/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.controller;

import backend.model.Alfabeto;
import backend.model.Estado;

/**
 *
 * @author Carlos Cotom
 */
public class ControladorFunsionTransicion {
    
    private Estado[][] matrizEstados;
    private final Estado ESTADO_INICIAL = Estado.S0;

    public ControladorFunsionTransicion() {
        matrizEstados = new Estado[Estado.values().length - 2][Alfabeto.values().length];
        this.matrizEstados[Estado.S0.ordinal()][Alfabeto.LETRA.ordinal()]= Estado.S1;
        this.matrizEstados[Estado.S0.ordinal()][Alfabeto.NUMERO.ordinal()]= Estado.S2;
        this.matrizEstados[Estado.S0.ordinal()][Alfabeto.ESPACIO.ordinal()]= Estado.S0;
        this.matrizEstados[Estado.S0.ordinal()][Alfabeto.ERROR.ordinal()]= Estado.SE;
        
        this.matrizEstados[Estado.S1.ordinal()][Alfabeto.LETRA.ordinal()]= Estado.S1;
        this.matrizEstados[Estado.S1.ordinal()][Alfabeto.NUMERO.ordinal()]= Estado.S1;
        this.matrizEstados[Estado.S1.ordinal()][Alfabeto.ESPACIO.ordinal()]= Estado.SF;
        this.matrizEstados[Estado.S1.ordinal()][Alfabeto.ERROR.ordinal()]= Estado.SE;
        
        this.matrizEstados[Estado.S2.ordinal()][Alfabeto.LETRA.ordinal()]= Estado.SE;
        this.matrizEstados[Estado.S2.ordinal()][Alfabeto.NUMERO.ordinal()]= Estado.S2;
        this.matrizEstados[Estado.S2.ordinal()][Alfabeto.ESPACIO.ordinal()]= Estado.SF;
        this.matrizEstados[Estado.S2.ordinal()][Alfabeto.ERROR.ordinal()]= Estado.SE;
    }        
    
    public Estado getESTADO_INICIAL() {
        return this.ESTADO_INICIAL;
    }
    
    public Estado produccion(Estado estadoActual, Alfabeto alfabeto) {
        if ((estadoActual != Estado.SF) && (estadoActual != Estado.SE)) {
            return this.matrizEstados[estadoActual.ordinal()][alfabeto.ordinal()];
        }
        return estadoActual;
    }
    
}
