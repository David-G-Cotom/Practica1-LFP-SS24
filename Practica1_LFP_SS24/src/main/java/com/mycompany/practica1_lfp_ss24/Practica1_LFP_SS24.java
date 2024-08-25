/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica1_lfp_ss24;

import backend.model.AnalizadorLexico;
import java.io.IOException;

/**
 *
 * @author Carlos Cotom
 */
public class Practica1_LFP_SS24 {

    public static void main(String[] args) {
        AnalizadorLexico prueba = new AnalizadorLexico();
        if (prueba.leerArchivo("E:\\Documentos Carlos Cotom\\Desktop\\Prueba.txt")) {
            try {
                while (!prueba.isFinArchivo()) {
                    System.out.println(prueba.getToken());
                }
            } catch (IOException ex) {
                System.out.println("----------------ERROR---------------------");
            }
        }
    }
}
