/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frontend;

import backend.model.Token;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Cotom
 */
public class CasillaLabel {

    private Token token;
    private final JLabel label;

    public CasillaLabel(JLabel label) {
        this.label = label;
        agregarListener();
    }

    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    /**
     * Este metodo le agrega un evento de escucha de una forma manual a la
     * casilla, para posteriormente mostrar el mensaje informativo sobre el
     * token que se encuentra en la casilla del lienzo
     */
    private void agregarListener() {
        this.label.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JOptionPane.showMessageDialog(null, token.getTipoToken()
                        + "\nLinea: " + token.getLinea() + ", Columna: " + token.getColumna()
                        + " --> Cuadro[" + token.getFilaImagen() + ", " + token.getColumnaImagen() + "]"
                        + "\n" + token.getLexema());
            }
        });
    }

}
