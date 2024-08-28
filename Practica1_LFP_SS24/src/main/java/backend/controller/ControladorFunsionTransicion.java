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

    private final Estado[][] matrizEstados;
    private final Estado ESTADO_INICIAL = Estado.S0;

    public ControladorFunsionTransicion() {
        matrizEstados = new Estado[Estado.values().length - 2][Alfabeto.values().length];

        this.matrizEstados[Estado.S0.ordinal()][Alfabeto.LETRA.ordinal()] = Estado.S1;
        this.matrizEstados[Estado.S0.ordinal()][Alfabeto.NUMERO.ordinal()] = Estado.S2;
        this.matrizEstados[Estado.S0.ordinal()][Alfabeto.SUBRAYADO.ordinal()] = Estado.SE;
        this.matrizEstados[Estado.S0.ordinal()][Alfabeto.SIMBOLO_ARITMETICO.ordinal()] = Estado.S11;
        this.matrizEstados[Estado.S0.ordinal()][Alfabeto.EXPONENTE.ordinal()] = Estado.S10;
        this.matrizEstados[Estado.S0.ordinal()][Alfabeto.IGUAL.ordinal()] = Estado.S13;
        this.matrizEstados[Estado.S0.ordinal()][Alfabeto.MAYOR_QUE.ordinal()] = Estado.S18;
        this.matrizEstados[Estado.S0.ordinal()][Alfabeto.MENOR_QUE.ordinal()] = Estado.S15;
        this.matrizEstados[Estado.S0.ordinal()][Alfabeto.PUNTO.ordinal()] = Estado.S23;
        this.matrizEstados[Estado.S0.ordinal()][Alfabeto.COMA.ordinal()] = Estado.S24;
        this.matrizEstados[Estado.S0.ordinal()][Alfabeto.COMILLA_DOBLE.ordinal()] = Estado.S4;
        this.matrizEstados[Estado.S0.ordinal()][Alfabeto.COMILLA_SIMPLE.ordinal()] = Estado.S6;
        this.matrizEstados[Estado.S0.ordinal()][Alfabeto.PARENTESIS.ordinal()] = Estado.S20;
        this.matrizEstados[Estado.S0.ordinal()][Alfabeto.LLAVES.ordinal()] = Estado.S21;
        this.matrizEstados[Estado.S0.ordinal()][Alfabeto.CORCHETES.ordinal()] = Estado.S22;
        this.matrizEstados[Estado.S0.ordinal()][Alfabeto.NUMERAL.ordinal()] = Estado.SE;
        this.matrizEstados[Estado.S0.ordinal()][Alfabeto.SIMBOLO_VARIO.ordinal()] = Estado.SE;
        this.matrizEstados[Estado.S0.ordinal()][Alfabeto.NUEVA_LINEA.ordinal()] = Estado.S0;
        this.matrizEstados[Estado.S0.ordinal()][Alfabeto.ESPACIO.ordinal()] = Estado.S0;

        this.matrizEstados[Estado.S1.ordinal()][Alfabeto.LETRA.ordinal()] = Estado.S1;
        this.matrizEstados[Estado.S1.ordinal()][Alfabeto.NUMERO.ordinal()] = Estado.S1;
        this.matrizEstados[Estado.S1.ordinal()][Alfabeto.SUBRAYADO.ordinal()] = Estado.S1;
        this.matrizEstados[Estado.S1.ordinal()][Alfabeto.PUNTO.ordinal()] = Estado.S25;
        this.matrizEstados[Estado.S1.ordinal()][Alfabeto.NUEVA_LINEA.ordinal()] = Estado.SF;
        this.matrizEstados[Estado.S1.ordinal()][Alfabeto.ESPACIO.ordinal()] = Estado.SF;

        this.matrizEstados[Estado.S2.ordinal()][Alfabeto.NUMERO.ordinal()] = Estado.S2;
        this.matrizEstados[Estado.S2.ordinal()][Alfabeto.PUNTO.ordinal()] = Estado.S3;
        this.matrizEstados[Estado.S2.ordinal()][Alfabeto.NUEVA_LINEA.ordinal()] = Estado.SF;
        this.matrizEstados[Estado.S2.ordinal()][Alfabeto.ESPACIO.ordinal()] = Estado.SF;

        this.matrizEstados[Estado.S3.ordinal()][Alfabeto.NUMERO.ordinal()] = Estado.S3;
        this.matrizEstados[Estado.S3.ordinal()][Alfabeto.NUEVA_LINEA.ordinal()] = Estado.SF;
        this.matrizEstados[Estado.S3.ordinal()][Alfabeto.ESPACIO.ordinal()] = Estado.SF;

        this.matrizEstados[Estado.S4.ordinal()][Alfabeto.LETRA.ordinal()] = Estado.S4;
        this.matrizEstados[Estado.S4.ordinal()][Alfabeto.NUMERO.ordinal()] = Estado.S4;
        this.matrizEstados[Estado.S4.ordinal()][Alfabeto.SUBRAYADO.ordinal()] = Estado.S4;
        this.matrizEstados[Estado.S4.ordinal()][Alfabeto.SIMBOLO_ARITMETICO.ordinal()] = Estado.S4;
        this.matrizEstados[Estado.S4.ordinal()][Alfabeto.EXPONENTE.ordinal()] = Estado.S4;
        this.matrizEstados[Estado.S4.ordinal()][Alfabeto.IGUAL.ordinal()] = Estado.S4;
        this.matrizEstados[Estado.S4.ordinal()][Alfabeto.MAYOR_QUE.ordinal()] = Estado.S4;
        this.matrizEstados[Estado.S4.ordinal()][Alfabeto.MENOR_QUE.ordinal()] = Estado.S4;
        this.matrizEstados[Estado.S4.ordinal()][Alfabeto.PUNTO.ordinal()] = Estado.S4;
        this.matrizEstados[Estado.S4.ordinal()][Alfabeto.COMA.ordinal()] = Estado.S4;
        this.matrizEstados[Estado.S4.ordinal()][Alfabeto.COMILLA_DOBLE.ordinal()] = Estado.S5;
        this.matrizEstados[Estado.S4.ordinal()][Alfabeto.COMILLA_SIMPLE.ordinal()] = Estado.S4;
        this.matrizEstados[Estado.S4.ordinal()][Alfabeto.PARENTESIS.ordinal()] = Estado.S4;
        this.matrizEstados[Estado.S4.ordinal()][Alfabeto.LLAVES.ordinal()] = Estado.S4;
        this.matrizEstados[Estado.S4.ordinal()][Alfabeto.CORCHETES.ordinal()] = Estado.S4;
        this.matrizEstados[Estado.S4.ordinal()][Alfabeto.NUMERAL.ordinal()] = Estado.S4;
        this.matrizEstados[Estado.S4.ordinal()][Alfabeto.SIMBOLO_VARIO.ordinal()] = Estado.S4;
        this.matrizEstados[Estado.S4.ordinal()][Alfabeto.NUEVA_LINEA.ordinal()] = Estado.SE;
        this.matrizEstados[Estado.S4.ordinal()][Alfabeto.ESPACIO.ordinal()] = Estado.SE;

        this.matrizEstados[Estado.S5.ordinal()][Alfabeto.NUEVA_LINEA.ordinal()] = Estado.SF;
        this.matrizEstados[Estado.S5.ordinal()][Alfabeto.ESPACIO.ordinal()] = Estado.SF;

        this.matrizEstados[Estado.S6.ordinal()][Alfabeto.LETRA.ordinal()] = Estado.S7;
        this.matrizEstados[Estado.S6.ordinal()][Alfabeto.NUMERO.ordinal()] = Estado.S7;
        this.matrizEstados[Estado.S6.ordinal()][Alfabeto.SUBRAYADO.ordinal()] = Estado.S7;
        this.matrizEstados[Estado.S6.ordinal()][Alfabeto.SIMBOLO_ARITMETICO.ordinal()] = Estado.S7;
        this.matrizEstados[Estado.S6.ordinal()][Alfabeto.EXPONENTE.ordinal()] = Estado.S7;
        this.matrizEstados[Estado.S6.ordinal()][Alfabeto.IGUAL.ordinal()] = Estado.S7;
        this.matrizEstados[Estado.S6.ordinal()][Alfabeto.MAYOR_QUE.ordinal()] = Estado.S7;
        this.matrizEstados[Estado.S6.ordinal()][Alfabeto.MENOR_QUE.ordinal()] = Estado.S7;
        this.matrizEstados[Estado.S6.ordinal()][Alfabeto.PUNTO.ordinal()] = Estado.S7;
        this.matrizEstados[Estado.S6.ordinal()][Alfabeto.COMA.ordinal()] = Estado.S7;
        this.matrizEstados[Estado.S6.ordinal()][Alfabeto.COMILLA_DOBLE.ordinal()] = Estado.S7;
        this.matrizEstados[Estado.S6.ordinal()][Alfabeto.COMILLA_SIMPLE.ordinal()] = Estado.S7;
        this.matrizEstados[Estado.S6.ordinal()][Alfabeto.PARENTESIS.ordinal()] = Estado.S7;
        this.matrizEstados[Estado.S6.ordinal()][Alfabeto.LLAVES.ordinal()] = Estado.S7;
        this.matrizEstados[Estado.S6.ordinal()][Alfabeto.CORCHETES.ordinal()] = Estado.S7;
        this.matrizEstados[Estado.S6.ordinal()][Alfabeto.NUMERAL.ordinal()] = Estado.S7;
        this.matrizEstados[Estado.S6.ordinal()][Alfabeto.SIMBOLO_VARIO.ordinal()] = Estado.S7;
        this.matrizEstados[Estado.S6.ordinal()][Alfabeto.NUEVA_LINEA.ordinal()] = Estado.SE;
        this.matrizEstados[Estado.S6.ordinal()][Alfabeto.ESPACIO.ordinal()] = Estado.SE;

        this.matrizEstados[Estado.S7.ordinal()][Alfabeto.LETRA.ordinal()] = Estado.S9;
        this.matrizEstados[Estado.S7.ordinal()][Alfabeto.NUMERO.ordinal()] = Estado.S9;
        this.matrizEstados[Estado.S7.ordinal()][Alfabeto.SUBRAYADO.ordinal()] = Estado.S9;
        this.matrizEstados[Estado.S7.ordinal()][Alfabeto.SIMBOLO_ARITMETICO.ordinal()] = Estado.S9;
        this.matrizEstados[Estado.S7.ordinal()][Alfabeto.EXPONENTE.ordinal()] = Estado.S9;
        this.matrizEstados[Estado.S7.ordinal()][Alfabeto.IGUAL.ordinal()] = Estado.S9;
        this.matrizEstados[Estado.S7.ordinal()][Alfabeto.MAYOR_QUE.ordinal()] = Estado.S9;
        this.matrizEstados[Estado.S7.ordinal()][Alfabeto.MENOR_QUE.ordinal()] = Estado.S9;
        this.matrizEstados[Estado.S7.ordinal()][Alfabeto.PUNTO.ordinal()] = Estado.S9;
        this.matrizEstados[Estado.S7.ordinal()][Alfabeto.COMA.ordinal()] = Estado.S9;
        this.matrizEstados[Estado.S7.ordinal()][Alfabeto.COMILLA_DOBLE.ordinal()] = Estado.S9;
        this.matrizEstados[Estado.S7.ordinal()][Alfabeto.COMILLA_SIMPLE.ordinal()] = Estado.S8;
        this.matrizEstados[Estado.S7.ordinal()][Alfabeto.PARENTESIS.ordinal()] = Estado.S9;
        this.matrizEstados[Estado.S7.ordinal()][Alfabeto.LLAVES.ordinal()] = Estado.S9;
        this.matrizEstados[Estado.S7.ordinal()][Alfabeto.CORCHETES.ordinal()] = Estado.S9;
        this.matrizEstados[Estado.S7.ordinal()][Alfabeto.NUMERAL.ordinal()] = Estado.S9;
        this.matrizEstados[Estado.S7.ordinal()][Alfabeto.SIMBOLO_VARIO.ordinal()] = Estado.S9;
        this.matrizEstados[Estado.S7.ordinal()][Alfabeto.NUEVA_LINEA.ordinal()] = Estado.SE;
        this.matrizEstados[Estado.S7.ordinal()][Alfabeto.ESPACIO.ordinal()] = Estado.SE;

        this.matrizEstados[Estado.S8.ordinal()][Alfabeto.NUEVA_LINEA.ordinal()] = Estado.SF;
        this.matrizEstados[Estado.S8.ordinal()][Alfabeto.ESPACIO.ordinal()] = Estado.SF;

        this.matrizEstados[Estado.S9.ordinal()][Alfabeto.LETRA.ordinal()] = Estado.S9;
        this.matrizEstados[Estado.S9.ordinal()][Alfabeto.NUMERO.ordinal()] = Estado.S9;
        this.matrizEstados[Estado.S9.ordinal()][Alfabeto.SUBRAYADO.ordinal()] = Estado.S9;
        this.matrizEstados[Estado.S9.ordinal()][Alfabeto.SIMBOLO_ARITMETICO.ordinal()] = Estado.S9;
        this.matrizEstados[Estado.S9.ordinal()][Alfabeto.EXPONENTE.ordinal()] = Estado.S9;
        this.matrizEstados[Estado.S9.ordinal()][Alfabeto.IGUAL.ordinal()] = Estado.S9;
        this.matrizEstados[Estado.S9.ordinal()][Alfabeto.MAYOR_QUE.ordinal()] = Estado.S9;
        this.matrizEstados[Estado.S9.ordinal()][Alfabeto.MENOR_QUE.ordinal()] = Estado.S9;
        this.matrizEstados[Estado.S9.ordinal()][Alfabeto.PUNTO.ordinal()] = Estado.S9;
        this.matrizEstados[Estado.S9.ordinal()][Alfabeto.COMA.ordinal()] = Estado.S9;
        this.matrizEstados[Estado.S9.ordinal()][Alfabeto.COMILLA_DOBLE.ordinal()] = Estado.S9;
        this.matrizEstados[Estado.S9.ordinal()][Alfabeto.COMILLA_SIMPLE.ordinal()] = Estado.S9;
        this.matrizEstados[Estado.S9.ordinal()][Alfabeto.PARENTESIS.ordinal()] = Estado.S9;
        this.matrizEstados[Estado.S9.ordinal()][Alfabeto.LLAVES.ordinal()] = Estado.S9;
        this.matrizEstados[Estado.S9.ordinal()][Alfabeto.CORCHETES.ordinal()] = Estado.S9;
        this.matrizEstados[Estado.S9.ordinal()][Alfabeto.NUMERAL.ordinal()] = Estado.S9;
        this.matrizEstados[Estado.S9.ordinal()][Alfabeto.SIMBOLO_VARIO.ordinal()] = Estado.S9;
        this.matrizEstados[Estado.S9.ordinal()][Alfabeto.NUEVA_LINEA.ordinal()] = Estado.SF;
        this.matrizEstados[Estado.S9.ordinal()][Alfabeto.ESPACIO.ordinal()] = Estado.SF;

        this.matrizEstados[Estado.S10.ordinal()][Alfabeto.NUEVA_LINEA.ordinal()] = Estado.SF;
        this.matrizEstados[Estado.S10.ordinal()][Alfabeto.ESPACIO.ordinal()] = Estado.SF;

        this.matrizEstados[Estado.S11.ordinal()][Alfabeto.IGUAL.ordinal()] = Estado.S12;
        this.matrizEstados[Estado.S11.ordinal()][Alfabeto.NUEVA_LINEA.ordinal()] = Estado.SF;
        this.matrizEstados[Estado.S11.ordinal()][Alfabeto.ESPACIO.ordinal()] = Estado.SF;

        this.matrizEstados[Estado.S12.ordinal()][Alfabeto.NUEVA_LINEA.ordinal()] = Estado.SF;
        this.matrizEstados[Estado.S12.ordinal()][Alfabeto.ESPACIO.ordinal()] = Estado.SF;

        this.matrizEstados[Estado.S13.ordinal()][Alfabeto.IGUAL.ordinal()] = Estado.S14;
        this.matrizEstados[Estado.S13.ordinal()][Alfabeto.NUEVA_LINEA.ordinal()] = Estado.SF;
        this.matrizEstados[Estado.S13.ordinal()][Alfabeto.ESPACIO.ordinal()] = Estado.SF;

        this.matrizEstados[Estado.S14.ordinal()][Alfabeto.NUEVA_LINEA.ordinal()] = Estado.SF;
        this.matrizEstados[Estado.S14.ordinal()][Alfabeto.ESPACIO.ordinal()] = Estado.SF;

        this.matrizEstados[Estado.S15.ordinal()][Alfabeto.IGUAL.ordinal()] = Estado.S17;
        this.matrizEstados[Estado.S15.ordinal()][Alfabeto.MAYOR_QUE.ordinal()] = Estado.S16;
        this.matrizEstados[Estado.S15.ordinal()][Alfabeto.NUEVA_LINEA.ordinal()] = Estado.SF;
        this.matrizEstados[Estado.S15.ordinal()][Alfabeto.ESPACIO.ordinal()] = Estado.SF;

        this.matrizEstados[Estado.S16.ordinal()][Alfabeto.NUEVA_LINEA.ordinal()] = Estado.SF;
        this.matrizEstados[Estado.S16.ordinal()][Alfabeto.ESPACIO.ordinal()] = Estado.SF;

        this.matrizEstados[Estado.S17.ordinal()][Alfabeto.NUEVA_LINEA.ordinal()] = Estado.SF;
        this.matrizEstados[Estado.S17.ordinal()][Alfabeto.ESPACIO.ordinal()] = Estado.SF;

        this.matrizEstados[Estado.S18.ordinal()][Alfabeto.IGUAL.ordinal()] = Estado.S19;
        this.matrizEstados[Estado.S18.ordinal()][Alfabeto.NUEVA_LINEA.ordinal()] = Estado.SF;
        this.matrizEstados[Estado.S18.ordinal()][Alfabeto.ESPACIO.ordinal()] = Estado.SF;

        this.matrizEstados[Estado.S19.ordinal()][Alfabeto.NUEVA_LINEA.ordinal()] = Estado.SF;
        this.matrizEstados[Estado.S19.ordinal()][Alfabeto.ESPACIO.ordinal()] = Estado.SF;

        this.matrizEstados[Estado.S20.ordinal()][Alfabeto.NUEVA_LINEA.ordinal()] = Estado.SF;
        this.matrizEstados[Estado.S20.ordinal()][Alfabeto.ESPACIO.ordinal()] = Estado.SF;

        this.matrizEstados[Estado.S21.ordinal()][Alfabeto.NUEVA_LINEA.ordinal()] = Estado.SF;
        this.matrizEstados[Estado.S21.ordinal()][Alfabeto.ESPACIO.ordinal()] = Estado.SF;

        this.matrizEstados[Estado.S22.ordinal()][Alfabeto.NUEVA_LINEA.ordinal()] = Estado.SF;
        this.matrizEstados[Estado.S22.ordinal()][Alfabeto.ESPACIO.ordinal()] = Estado.SF;

        this.matrizEstados[Estado.S23.ordinal()][Alfabeto.NUEVA_LINEA.ordinal()] = Estado.SF;
        this.matrizEstados[Estado.S23.ordinal()][Alfabeto.ESPACIO.ordinal()] = Estado.SF;

        this.matrizEstados[Estado.S24.ordinal()][Alfabeto.NUEVA_LINEA.ordinal()] = Estado.SF;
        this.matrizEstados[Estado.S24.ordinal()][Alfabeto.ESPACIO.ordinal()] = Estado.SF;

        this.matrizEstados[Estado.S25.ordinal()][Alfabeto.LETRA.ordinal()] = Estado.S25;
        this.matrizEstados[Estado.S25.ordinal()][Alfabeto.PARENTESIS.ordinal()] = Estado.S26;
        this.matrizEstados[Estado.S25.ordinal()][Alfabeto.NUEVA_LINEA.ordinal()] = Estado.SF;
        this.matrizEstados[Estado.S25.ordinal()][Alfabeto.ESPACIO.ordinal()] = Estado.SF;

        this.matrizEstados[Estado.S26.ordinal()][Alfabeto.NUMERAL.ordinal()] = Estado.S27;

        this.matrizEstados[Estado.S27.ordinal()][Alfabeto.LETRA.ordinal()] = Estado.S27;
        this.matrizEstados[Estado.S27.ordinal()][Alfabeto.NUMERO.ordinal()] = Estado.S27;
        this.matrizEstados[Estado.S27.ordinal()][Alfabeto.COMA.ordinal()] = Estado.S29;
        this.matrizEstados[Estado.S27.ordinal()][Alfabeto.PARENTESIS.ordinal()] = Estado.S28;

        this.matrizEstados[Estado.S28.ordinal()][Alfabeto.NUEVA_LINEA.ordinal()] = Estado.SF;
        this.matrizEstados[Estado.S28.ordinal()][Alfabeto.ESPACIO.ordinal()] = Estado.SF;

        this.matrizEstados[Estado.S29.ordinal()][Alfabeto.NUMERO.ordinal()] = Estado.S30;

        this.matrizEstados[Estado.S30.ordinal()][Alfabeto.COMA.ordinal()] = Estado.S31;

        this.matrizEstados[Estado.S31.ordinal()][Alfabeto.NUMERO.ordinal()] = Estado.S32;

        this.matrizEstados[Estado.S32.ordinal()][Alfabeto.PARENTESIS.ordinal()] = Estado.S33;

        this.matrizEstados[Estado.S33.ordinal()][Alfabeto.NUEVA_LINEA.ordinal()] = Estado.SF;
        this.matrizEstados[Estado.S33.ordinal()][Alfabeto.ESPACIO.ordinal()] = Estado.SF;

        for (int i = 0; i < this.matrizEstados.length; i++) {
            for (int j = 0; j < this.matrizEstados[0].length; j++) {
                if (this.matrizEstados[i][j] == null) {
                    this.matrizEstados[i][j] = Estado.SE;
                }
            }
        }

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
