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
