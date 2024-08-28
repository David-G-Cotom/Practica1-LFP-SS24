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
        } else if (charAt == '_') {
            return Alfabeto.SUBRAYADO;
        } else if (valor == '+' || valor == '-' || valor == '*' || valor == '/') {
            return Alfabeto.SIMBOLO_ARITMETICO;
        } else if (charAt == '^') {
            return Alfabeto.EXPONENTE;
        } else if (charAt == '=') {
            return Alfabeto.IGUAL;
        } else if (charAt == '<') {
            return Alfabeto.MENOR_QUE;
        } else if (charAt == '>') {
            return Alfabeto.MAYOR_QUE;
        } else if (charAt == '.') {
            return Alfabeto.PUNTO;
        } else if (charAt == ',') {
            return Alfabeto.COMA;
        } else if (charAt == '"') {
            return Alfabeto.COMILLA_DOBLE;
        } else if (charAt == '\'') {
            return Alfabeto.COMILLA_SIMPLE;
        } else if (charAt == '(' || charAt == ')') {
            return Alfabeto.PARENTESIS;
        } else if (charAt == '{' || charAt == '}') {
            return Alfabeto.LLAVES;
        } else if (charAt == '[' || charAt == ']') {
            return Alfabeto.CORCHETES;
        } else if (charAt == '#') {
            return Alfabeto.NUMERAL;
        } else if ((valor >= 33) && (valor <= 126)) {
            return Alfabeto.SIMBOLO_VARIO;
        } else if ((charAt == '\n')) {
            return Alfabeto.NUEVA_LINEA;
        } else if ((valor == 32) || (charAt == ' ')) {
            return Alfabeto.ESPACIO;
        } else {
            return Alfabeto.ERROR;            
        }   
    }
    
}
