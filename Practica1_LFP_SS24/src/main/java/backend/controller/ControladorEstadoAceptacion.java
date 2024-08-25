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
        this.mapaEstadoAceptacion.put(Estado.S1, TipoToken.ID);
        this.mapaEstadoAceptacion.put(Estado.S2, TipoToken.NUMBER);
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
