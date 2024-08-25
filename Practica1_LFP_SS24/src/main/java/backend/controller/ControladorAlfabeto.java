/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.controller;

import backend.model.Alfabeto;

/**
 *
 * @author Carlos Cotom
 */
public class ControladorAlfabeto {
    
    public boolean isEspacioBlanco(char charAt) {
        return Character.isWhitespace(charAt);
    }
    
    public boolean isNuevaLinea(char charAt) {
        return (charAt == '\n');
    }
    
    public Alfabeto getAlfabeto(char charAt) {
        int valor = charAt;
        if (((valor >= 65) && (valor <= 90)) || ((valor >= 97) && (valor <= 122))) {
            return Alfabeto.LETRA;
        } else if ((valor >= 48) && (valor <= 57)) {
            return Alfabeto.NUMERO;        
        } else if ((valor == 32) || (charAt == ' ')) {
            return Alfabeto.ESPACIO;
        } else if ((charAt == '\n')) {
            return Alfabeto.NUEVA_LINEA;
        /*} else if (valor == 42 || valor == 43 || valor == 45 || valor == 47
                || valor == 60 || valor == 61 || valor == 62 || valor == 94) {
            return Alfabeto.SIMBOLO_MATEMATICO;        
        } else if (valor == 39 || valor == 40 || valor == 41 || valor == 44 || valor == 46
                || valor == 91 || valor == 93 || valor == 123 || valor == 125) {
            return Alfabeto.SIGNO_PUNTUACION;        
        } else if ((valor >= 35) && (valor <= 38)) {
            return Alfabeto.SIMBOLO_VARIO;*/
        } else {
            return Alfabeto.ERROR;            
        }   
    }
    
}
