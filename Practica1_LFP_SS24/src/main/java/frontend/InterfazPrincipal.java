/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frontend;

import backend.model.AnalizadorLexico;
import backend.model.TipoToken;
import backend.model.Token;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos Cotom
 */
public class InterfazPrincipal extends javax.swing.JFrame {

    private int filasCuadricula;
    private int columnasCuadricula;
    private final DefaultTableModel modeloTabla;
    private ArrayList<Token> tokens;
    private AnalizadorLexico analizador;

    /**
     * Creates new form InterfazPrincipal
     */
    public InterfazPrincipal() {
        this.modeloTabla = new DefaultTableModel();
        initComponents();
        this.btnEjecutar.setEnabled(false);
        this.analizador = new AnalizadorLexico();
        this.tokens = new ArrayList<>();
        iniciarTablero();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        dlgDimension = new javax.swing.JDialog();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnEstablecerDialog = new javax.swing.JButton();
        txtFilas = new javax.swing.JTextField();
        txtColumnas = new javax.swing.JTextField();
        dlgReporte = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblReporte = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaCodigo = new javax.swing.JTextArea();
        pnlImagen = new javax.swing.JPanel();
        btnEjecutar = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();
        btnEstablecerDimension = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();

        dlgDimension.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dlgDimension.setTitle("Dimension Cuadricula");
        dlgDimension.setMinimumSize(new java.awt.Dimension(250, 200));

        jLabel3.setText("Filas:");

        jLabel4.setText("Columnas:");

        btnEstablecerDialog.setText("Establecer");
        btnEstablecerDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstablecerDialogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dlgDimensionLayout = new javax.swing.GroupLayout(dlgDimension.getContentPane());
        dlgDimension.getContentPane().setLayout(dlgDimensionLayout);
        dlgDimensionLayout.setHorizontalGroup(
            dlgDimensionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgDimensionLayout.createSequentialGroup()
                .addGroup(dlgDimensionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgDimensionLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(dlgDimensionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(dlgDimensionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFilas)
                            .addComponent(txtColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(dlgDimensionLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnEstablecerDialog)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        dlgDimensionLayout.setVerticalGroup(
            dlgDimensionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgDimensionLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(dlgDimensionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFilas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(dlgDimensionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnEstablecerDialog)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        dlgReporte.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        dlgReporte.setTitle("Reporte de Tokens");
        dlgReporte.setMinimumSize(new java.awt.Dimension(900, 300));

        tblReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Token", "Lexema", "Linea", "Columna", "Fila", "Col", "Color"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblReporte);
        if (tblReporte.getColumnModel().getColumnCount() > 0) {
            tblReporte.getColumnModel().getColumn(2).setPreferredWidth(20);
            tblReporte.getColumnModel().getColumn(3).setPreferredWidth(20);
            tblReporte.getColumnModel().getColumn(4).setPreferredWidth(20);
            tblReporte.getColumnModel().getColumn(5).setPreferredWidth(20);
        }

        javax.swing.GroupLayout dlgReporteLayout = new javax.swing.GroupLayout(dlgReporte.getContentPane());
        dlgReporte.getContentPane().setLayout(dlgReporteLayout);
        dlgReporteLayout.setHorizontalGroup(
            dlgReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgReporteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                .addContainerGap())
        );
        dlgReporteLayout.setVerticalGroup(
            dlgReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgReporteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Visual Basic");
        setResizable(false);

        txaCodigo.setColumns(20);
        txaCodigo.setRows(5);
        jScrollPane1.setViewportView(txaCodigo);

        pnlImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pnlImagen.setLayout(new java.awt.GridLayout(1, 0));

        btnEjecutar.setText("Ejecutar");
        btnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEjecutarActionPerformed(evt);
            }
        });

        btnCargar.setText("Cargar Archivo");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        btnEstablecerDimension.setText("Establecer Dimension");
        btnEstablecerDimension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstablecerDimensionActionPerformed(evt);
            }
        });

        btnExportar.setText("Exportar Imagen");
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        btnReporte.setText("Reporte");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCargar)
                        .addGap(116, 116, 116)
                        .addComponent(btnEjecutar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReporte))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnExportar)
                        .addGap(121, 121, 121)
                        .addComponent(btnEstablecerDimension))
                    .addComponent(pnlImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargar)
                    .addComponent(btnEjecutar)
                    .addComponent(btnEstablecerDimension)
                    .addComponent(btnExportar)
                    .addComponent(btnReporte))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //---------------------------------------- METODOS DE EVENTO ----------------------------------------//
    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.txt", "txt");
        jFileChooser1.setFileFilter(filtro);
        jFileChooser1.setFileSelectionMode(JFileChooser.FILES_ONLY);
        jFileChooser1.setVisible(true);
        int resultado = jFileChooser1.showOpenDialog(this);
        if (resultado == JFileChooser.APPROVE_OPTION) {
            try (BufferedReader reader = new BufferedReader(new FileReader(jFileChooser1.getSelectedFile()))) {
                this.txaCodigo.read(reader, null);
            } catch (IOException e) {
                System.out.println("Error al imprimir el codigo");
            }
        }
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnEstablecerDimensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstablecerDimensionActionPerformed
        this.dlgDimension.setLocationRelativeTo(this);
        this.dlgDimension.setVisible(true);
    }//GEN-LAST:event_btnEstablecerDimensionActionPerformed

    private void btnEstablecerDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstablecerDialogActionPerformed
        try {
            int filas = Integer.parseInt(this.txtFilas.getText());
            int columnas = Integer.parseInt(this.txtColumnas.getText());
            if ((filas > 0) && (columnas > 0)) {
                this.filasCuadricula = filas;
                this.columnasCuadricula = columnas;
                this.dlgDimension.dispose();
                this.crearCuadricula();
            } else {
                JOptionPane.showMessageDialog(this.dlgDimension, "Debe ingresar valores Enteros Positivos", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this.dlgDimension, "Debe Ingresar Numeros Enteros Positivos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEstablecerDialogActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        vaciarTabla();
        llenarTabla();
        this.dlgReporte.setVisible(true);
        this.dlgReporte.setLocationRelativeTo(this);
    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        try {
            BufferedImage imagen = new BufferedImage(this.pnlImagen.getWidth(), this.pnlImagen.getHeight(), BufferedImage.TYPE_INT_RGB);
            Graphics2D imagen2D = imagen.createGraphics();
            this.pnlImagen.paint(imagen2D);
            imagen2D.dispose();
            String nombreBase = "imagen";
            String extensionImagen = ".png";
            File file = new File(nombreBase + extensionImagen);
            int version = 1;
            while (file.exists()) {
                nombreBase = nombreBase + " " + version;
                file = new File(nombreBase + extensionImagen);
                version++;
            }
            ImageIO.write(imagen, "png", file);
            JOptionPane.showMessageDialog(this, "Imagen Exportada Exitosamente como " + nombreBase + extensionImagen);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al Exportar la Imagen", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnExportarActionPerformed

    private void btnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEjecutarActionPerformed
        if (!this.tokens.isEmpty()) {
            this.tokens.clear();
        }
        this.analizador.leerArchivo(this.txaCodigo.getText());
        try {
            while (!analizador.isFinArchivo()) {
                Token token = analizador.getToken();
                this.tokens.add(token);
                System.out.println(token);
            }
        } catch (IOException ex) {
            System.out.println("----------------ERROR---------------------");
        }
        crearCuadricula();
        if (!this.tokens.isEmpty()) {
            pintarCuadricula();
        }
        System.out.println();
    }//GEN-LAST:event_btnEjecutarActionPerformed

    //---------------------------------------- METODOS PROPIOS ----------------------------------------//
    /**
     * Metodo que establece el Layout que tendra el Panel para el Lienzo de la
     * Imagen
     */
    private void crearCuadricula() {
        this.pnlImagen.removeAll();
        this.pnlImagen.setLayout(new GridLayout(this.filasCuadricula, this.columnasCuadricula, 1, 1));
        int anchoCasilla = this.pnlImagen.getWidth() / this.columnasCuadricula;
        int altoCasilla = this.pnlImagen.getHeight() / this.filasCuadricula;
        for (int i = 0; i < (this.filasCuadricula * this.columnasCuadricula); i++) {
            JLabel casilla = new JLabel();
            casilla.setPreferredSize(new Dimension(anchoCasilla, altoCasilla));
            casilla.setBorder(BorderFactory.createLineBorder(Color.black));
            this.pnlImagen.add(casilla);
        }
        this.pnlImagen.revalidate();
        this.pnlImagen.repaint();
        this.btnEjecutar.setEnabled(true);
    }

    /**
     * Metodo que Imprime el Color en el Panel segun el Color correspondiente a
     * cada Token analizado
     */
    private void pintarCuadricula() {
        int tokensValidos = 0;
        for (int i = 0; i < this.tokens.size(); i++) {
            if (this.tokens.get(i).getTipoToken() != TipoToken.ERROR) {
                tokensValidos++;
            }
        }
        if ((this.filasCuadricula * this.columnasCuadricula) < tokensValidos) {
            JOptionPane.showMessageDialog(this, "Se necesita mas cuadricula para poder Pintar la Imagen", "Error!!!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        crearCuadricula();
        int filaActual = 1;
        int columnaActual = 1;
        int indiceToken = 0;
        for (int i = 0; i < (this.filasCuadricula * this.columnasCuadricula); i++) {
            if ((columnaActual - 1) == this.columnasCuadricula) {
                columnaActual = 1;
                filaActual++;
            }
            if (i == tokensValidos) {
                break;
            }
            if (this.tokens.get(indiceToken).getTipoToken() == TipoToken.ERROR) {
                indiceToken++;
                i--;
                continue;
            }
            if (this.tokens.get(indiceToken).getTipoToken() == TipoToken.SQUARE_SIMPLE) {
                String contenido = new String(this.tokens.get(indiceToken).getLexema().getBytes());
                String color = evaluarSquareSimple(contenido);
                this.tokens.get(indiceToken).getTipoToken().setColor(color);
            }
            try {
                JLabel casilla = (JLabel) this.pnlImagen.getComponent(i);
                try {
                    casilla.setBackground(Color.decode(this.tokens.get(indiceToken).getTipoToken().getColor()));                    
                } catch (NumberFormatException e) {
                    tokensValidos--;
                    indiceToken++;
                    i--;
                    System.out.println("Color No valido en el Square.Color");
                    continue;
                }
                casilla.setBorder(null);
                casilla.setOpaque(true);
                this.tokens.get(indiceToken).setFilaImagen(filaActual);
                this.tokens.get(indiceToken).setColumnaImagen(columnaActual);
                CasillaLabel label = new CasillaLabel(casilla);
                label.setToken(this.tokens.get(indiceToken));
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e);
            }
            columnaActual++;
            indiceToken++;
        }
        this.pnlImagen.revalidate();
        this.pnlImagen.repaint();
    }

    private String evaluarSquareSimple(String contenido) {
        char charActual;
        StringBuilder color = new StringBuilder();
        int posicionContenido = -1;       
        do {
            posicionContenido++;
            charActual = contenido.charAt(posicionContenido);            
            if (charActual == '#' || charActual == ')') {
                for (int i = 0; i < 7; i++) {
                    color.append(charActual);
                    posicionContenido++;
                    if (posicionContenido >= contenido.length()) {
                        break;
                    }
                    charActual = contenido.charAt(posicionContenido);
                }
                break;
            }
        } while (posicionContenido < contenido.length());
        return color.toString();
    }
    
    /**
     * Metodo que le da a la Tabla de Reporte en la interfaz el modelo adecuado
     * para su visualizacion
     */
    private void iniciarTablero() {
        this.tblReporte.setModel(modeloTabla);
        this.modeloTabla.addColumn("Token");
        this.modeloTabla.addColumn("Lexema");
        this.modeloTabla.addColumn("Linea");
        this.modeloTabla.addColumn("Columna");
        this.modeloTabla.addColumn("Fila");
        this.modeloTabla.addColumn("Col");
        this.modeloTabla.addColumn("Color");
    }

    /**
     * Metodo que muestra en la Tabla de Reporte en la interfaz los datos de
     * cada Token que esta se encontro en el analisis
     *
     * @param datos son los datos de cada token registrados
     */
    private void llenarTabla() {
        this.tblReporte.setModel(modeloTabla);
        Object[] fila;
        for (int i = 0; i < this.tokens.size(); i++) {
            fila = new Object[7];
            fila[0] = this.tokens.get(i).getTipoToken();
            fila[1] = this.tokens.get(i).getLexema();
            fila[2] = this.tokens.get(i).getLinea();
            fila[3] = this.tokens.get(i).getColumna();
            fila[4] = this.tokens.get(i).getFilaImagen();
            fila[5] = this.tokens.get(i).getColumnaImagen();
            fila[6] = this.tokens.get(i).getTipoToken().getColor();
            this.modeloTabla.addRow(fila);
        }
    }

    /**
     * Metodo que limpia la Tabla de Reporte en la Interfaz para no tener
     * problemas de colapsos
     */
    private void vaciarTabla() {
        this.tblReporte.removeAll();
        int filasTabla = this.modeloTabla.getRowCount();
        if (filasTabla != 0) {
            for (int i = 0; i < filasTabla; i++) {
                this.modeloTabla.removeRow(0);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JButton btnEstablecerDialog;
    private javax.swing.JButton btnEstablecerDimension;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnReporte;
    private javax.swing.JDialog dlgDimension;
    private javax.swing.JDialog dlgReporte;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pnlImagen;
    private javax.swing.JTable tblReporte;
    private javax.swing.JTextArea txaCodigo;
    private javax.swing.JTextField txtColumnas;
    private javax.swing.JTextField txtFilas;
    // End of variables declaration//GEN-END:variables
}
