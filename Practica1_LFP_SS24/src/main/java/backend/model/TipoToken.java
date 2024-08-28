/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package backend.model;

/**
 *
 * @author Carlos Cotom
 */
public enum TipoToken {
    
    IDENTIFICADOR("#FFD300"),//LISTO
    SUMA("#FF33FF"),//LISTO
    RESTA("#C19A6B"),//LISTO
    EXPONENTE("#FCD0B4"),//LISTO
    DIVISION("#B4D941"),//LISTO
    MODULO("#D9AB41"),//LISTO
    MULTIPLICACION("#D80073"),//LISTO
    IGUAL("#6A00FF"),//LISTO
    DIFERENTE("#3F2212"),//LISTO
    MAYOR_QUE("#D9D441"),//LISTO
    MENOR_QUE("#D94A41"),//LISTO
    MAYOR_IGUAL_QUE("#E3C800"),//LISTO
    MENOR_IGUAL_QUE("#F0A30A"),//LISTO
    AND("#414ED9"),//LISTO
    OR("#41D95D"),//LISTO
    NOT("#A741D9"),//LISTO
    ASIGNACION_SIMPLE("#41D9D4"),//LISTO
    ASIGNACION_COPMPUESTA("#FFFFFF"),//LISTO
    PALABRA_RESERVADA("#60A917"),
    ENTERO("#1BA1E2"),//LISTO
    DECIMAL("#FFFF88"),//LISTO
    CADENA("#E51400"),//LISTO
    BOOLEANO("#FA6800"),//LISTO
    CARACTER("#0050EF"),//LISTO
    SQUARE_COMPLETO(""),//LISTO
    SQUARE_SIMPLE(""),//LISTO
    COMENTARIO("#B3B3B3"),//LISTO
    PARENTESIS("#9AD8DB"),//LISTO
    LLAVE("DBD29A"),//LISTO
    CORCHETE("DBA49A"),//LISTO
    COMA("#B79ADB"),//LISTO
    PUNTO("#9ADBA6"),//LISTO
    ERROR("");
    
    private String color;
    private String colorEspecial;

    TipoToken(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColorEspecial() {
        return colorEspecial;
    }

    public void setColorEspecial(String colorEspecial) {
        this.colorEspecial = colorEspecial;
    }        
    
}
