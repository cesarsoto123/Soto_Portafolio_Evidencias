/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Formularios.Secuenciacion.Sec_P03_Evaluar_Z;

import Modelos.Secuenciacion.Sec_P03_Evaluar_Z.Calcular_Z_Clase_Base;
import Modelos.Secuenciacion.Sec_P03_Evaluar_Z.Calcular_Z_Interface;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author cesar
 */
public class P03_Evaluar_Z_FRM extends javax.swing.JInternalFrame {

    public static DecimalFormat Decf = new DecimalFormat("#,##0.00");

    /**
     * Creates new form P03_Evaluar_Z_FRM
     */
    public P03_Evaluar_Z_FRM() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_a = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_b = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_c = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btn_imprimir = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area_z = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("Calcular 'Z'");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel4.setText("INGRESE EL VALOR DE A");

        txt_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_aActionPerformed(evt);
            }
        });
        txt_a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_aKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel5.setText("INGRESE EL VALOR DE B");

        txt_b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bActionPerformed(evt);
            }
        });
        txt_b.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_bKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel6.setText("INGRESE EL VALOR DE C");

        txt_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cActionPerformed(evt);
            }
        });
        txt_c.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel7.setText("EL VALOR DE Z:.");

        btn_imprimir.setText("IMPRIMIR");
        btn_imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imprimirActionPerformed(evt);
            }
        });
        btn_imprimir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_imprimirKeyPressed(evt);
            }
        });

        btn_limpiar.setText("LIMPIAR");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });
        btn_limpiar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_limpiarKeyPressed(evt);
            }
        });

        btn_cerrar.setText("CERRAR");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });
        btn_cerrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_cerrarKeyPressed(evt);
            }
        });

        area_z.setEditable(false);
        area_z.setBackground(new java.awt.Color(153, 153, 153));
        area_z.setColumns(20);
        area_z.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        area_z.setForeground(new java.awt.Color(0, 0, 0));
        area_z.setRows(5);
        jScrollPane1.setViewportView(area_z);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(115, 115, 115)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_a, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_b, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_c, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3)))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txt_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btn_imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(135, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel7)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1)
                                .addContainerGap())))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_aActionPerformed
        txt_b.requestFocus();
    }//GEN-LAST:event_txt_aActionPerformed

    private void txt_aKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_aKeyTyped
        if (evt.getKeyChar() < '0') {
            evt.consume();
        }
        if (evt.getKeyChar() > '9')
            evt.consume();
    }//GEN-LAST:event_txt_aKeyTyped

    private void txt_bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bActionPerformed
        txt_c.requestFocus();
    }//GEN-LAST:event_txt_bActionPerformed

    private void txt_bKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bKeyTyped
        if (evt.getKeyChar() < '0') {
            evt.consume();
        }
        if (evt.getKeyChar() > '9')
            evt.consume();
    }//GEN-LAST:event_txt_bKeyTyped

    private void txt_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cActionPerformed
        btn_imprimir.requestFocus();
    }//GEN-LAST:event_txt_cActionPerformed

    private void txt_cKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cKeyTyped
        if (evt.getKeyChar() < '0') {
            evt.consume();
        }
        if (evt.getKeyChar() > '9')
            evt.consume();
    }//GEN-LAST:event_txt_cKeyTyped

    private void btn_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimirActionPerformed

        Ejecutar_Algoritmo();
    }//GEN-LAST:event_btn_imprimirActionPerformed

    private void btn_imprimirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_imprimirKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            Ejecutar_Algoritmo();
        }

        btn_limpiar.requestFocus();
    }//GEN-LAST:event_btn_imprimirKeyPressed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        Iniciar_Formulario();
    }//GEN-LAST:event_btn_limpiarActionPerformed

    private void btn_limpiarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_limpiarKeyPressed
        Iniciar_Formulario();
        txt_a.requestFocus();
    }//GEN-LAST:event_btn_limpiarKeyPressed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btn_cerrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_cerrarKeyPressed
        System.exit(0);
    }//GEN-LAST:event_btn_cerrarKeyPressed
    private void Iniciar_Formulario() {
        txt_a.setText(null);
        txt_b.setText(null);
        txt_c.setText(null);
        area_z.setText(null);

    }

    private void Ejecutar_Algoritmo() {
        //Declarando Variables de Lectura
        double a, b, c, z;

        //Entrada
        // nombreEmp = txt_nombreEmp.getText();
        try {
            a = Double.parseDouble(txt_a.getText());

        } catch (NumberFormatException e) {

            txt_a.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Error de Java en el Valor 'A': Introduce un valor positivo");
            return;
        }

        try {
            b = Double.parseDouble(txt_b.getText());

        } catch (NumberFormatException e) {

            txt_b.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Error en el valor de 'B': Introduce un valor positivo");
            return;
        }
        try {
            c = Double.parseDouble(txt_c.getText());

        } catch (NumberFormatException e) {

            txt_c.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Error de Java en el valor de 'C': Introduce un valor numerico");
            return;
        }

        //Construyendo el objeto, manipulando el contructor
        Calcular_Z_Interface Obj_Calcular_Z = new Calcular_Z_Clase_Base(a, b, c);

        //Proceso
        Obj_Calcular_Z.setZ();

        //Salida
        area_z.setText(null);
        area_z.setText(Decf.format(Obj_Calcular_Z.getZ()));

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area_z;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_imprimir;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_a;
    private javax.swing.JTextField txt_b;
    private javax.swing.JTextField txt_c;
    // End of variables declaration//GEN-END:variables
}
