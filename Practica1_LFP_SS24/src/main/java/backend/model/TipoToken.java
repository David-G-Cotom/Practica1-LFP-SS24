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
    
    IDENTIFICADOR("#FFD300"),
    SUMA("#FF33FF"),
    RESTA("#C19A6B"),
    EXPONENTE("#FCD0B4"),
    DIVISION("#B4D941"),
    MODULO("#D9AB41"),
    MULTIPLICACION("#D80073"),
    IGUAL("#6A00FF"),
    DIFERENTE("#3F2212"),
    MAYOR_QUE("#D9D441"),
    MENOR_QUE("#D94A41"),
    MAYOR_IGUAL_QUE("#E3C800"),
    MENOR_IGUAL_QUE("#F0A30A"),
    AND("#414ED9"),
    OR("#41D95D"),
    NOT("#A741D9"),
    ASIGNACION_SIMPLE("#41D9D4"),
    ASIGNACION_COPMPUESTA("#FFFFFF"),
    PALABRA_RESERVADA("#60A917"),
    ENTERO("#1BA1E2"),
    DECIMAL("#FFFF88"),
    CADENA("#E51400"),
    BOOLEANO("#FA6800"),
    CARACTER("#0050EF"),
    SQUARE_COMPLETO(""),
    SQUARE_SIMPLE(""),
    COMENTARIO("#B3B3B3"),
    PARENTESIS("#9AD8DB"),
    LLAVE("#DBD29A"),
    CORCHETE("#DBA49A"),
    COMA("#B79ADB"),
    PUNTO("#9ADBA6"),
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
