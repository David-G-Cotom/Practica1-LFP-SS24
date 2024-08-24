/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend.model;

/**
 *
 * @author Carlos Cotom
 */
public class Token {

    private TipoToken tipoToken;
    private int linea;
    private int columna;
    private String lexema;
    
    public Token(TipoToken tipoToken, int linea, int columna, String lexema) {
        this.tipoToken = tipoToken;
        this.linea = linea;
        this.columna = columna;
        this.lexema = lexema;
    }

    public TipoToken getTipoToken() {
        return tipoToken;
    }

    public void setTipoToken(TipoToken tipoToken) {
        this.tipoToken = tipoToken;
    }

    public int getLinea() {
        return linea;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }   

    @Override
    public String toString() {
        return "Token{" + "tipoToken=" + tipoToken + ", linea=" + linea + ", columna=" + columna + ", lexema=" + lexema + '}';
    }    
    
}
