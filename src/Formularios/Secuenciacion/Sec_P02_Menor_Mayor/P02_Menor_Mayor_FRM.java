/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Formularios.Secuenciacion.Sec_P02_Menor_Mayor;

import Modelos.Secuenciacion.Sec_P02_Menor_Mayor.Menor_Mayor_Clase_Base;
import Modelos.Secuenciacion.Sec_P02_Menor_Mayor.Menor_Mayor_Interface;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author cesar
 */
public class P02_Menor_Mayor_FRM extends javax.swing.JInternalFrame {

    public static DecimalFormat Decf = new DecimalFormat("#,##0.00");

    /**
     * Creates new form P02_Menor_Mayor_FRM
     */
    public P02_Menor_Mayor_FRM() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbl_num1 = new javax.swing.JLabel();
        txt_num1 = new javax.swing.JTextField();
        lbl_num2 = new javax.swing.JLabel();
        txt_num2 = new javax.swing.JTextField();
        lbl_num3 = new javax.swing.JLabel();
        txt_num3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        area_resultado = new javax.swing.JTextArea();
        btn_imprimir = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(584, 467));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("Menor a Mayor");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel2.setText("de 3 Numeros");

        lbl_num1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbl_num1.setText("INGRESE EL PRIMER NUMERO");

        txt_num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_num1ActionPerformed(evt);
            }
        });
        txt_num1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_num1KeyTyped(evt);
            }
        });

        lbl_num2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbl_num2.setText("INGRESE EL SEGUNDO NUMERO");

        txt_num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_num2ActionPerformed(evt);
            }
        });
        txt_num2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_num2KeyTyped(evt);
            }
        });

        lbl_num3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbl_num3.setText("INGRESE EL TERCER NUMERO");

        txt_num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_num3ActionPerformed(evt);
            }
        });
        txt_num3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_num3KeyTyped(evt);
            }
        });

        area_resultado.setEditable(false);
        area_resultado.setColumns(20);
        area_resultado.setRows(5);
        jScrollPane1.setViewportView(area_resultado);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(77, 77, 77))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_num2)
                                    .addComponent(lbl_num1)
                                    .addComponent(lbl_num3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_imprimir)
                                .addGap(20, 20, 20)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_num2)
                            .addComponent(txt_num1)
                            .addComponent(txt_num3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addComponent(btn_cerrar)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_num1)
                    .addComponent(txt_num1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_num2)
                    .addComponent(txt_num2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_num3)
                    .addComponent(txt_num3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_limpiar)
                            .addComponent(btn_imprimir)
                            .addComponent(btn_cerrar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_num1ActionPerformed
        txt_num2.requestFocus();
    }//GEN-LAST:event_txt_num1ActionPerformed

    private void txt_num1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_num1KeyTyped
        if (evt.getKeyChar() < '0') {
            evt.consume();
        }
        if (evt.getKeyChar() > '9')
            evt.consume();
    }//GEN-LAST:event_txt_num1KeyTyped

    private void txt_num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_num2ActionPerformed
        txt_num3.requestFocus();
    }//GEN-LAST:event_txt_num2ActionPerformed

    private void txt_num2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_num2KeyTyped
        if (evt.getKeyChar() < '0') {
            evt.consume();
        }
        if (evt.getKeyChar() > '9')
            evt.consume();
    }//GEN-LAST:event_txt_num2KeyTyped

    private void txt_num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_num3ActionPerformed
        btn_imprimir.requestFocus();
    }//GEN-LAST:event_txt_num3ActionPerformed

    private void txt_num3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_num3KeyTyped
        if (evt.getKeyChar() < '0') {
            evt.consume();
        }
        if (evt.getKeyChar() > '9')
            evt.consume();
    }//GEN-LAST:event_txt_num3KeyTyped

    private void btn_imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imprimirActionPerformed
        Ejecutar_Algoritmo();
        btn_limpiar.requestFocus();
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
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            Iniciar_Formulario();
        }
        txt_num1.requestFocus();
    }//GEN-LAST:event_btn_limpiarKeyPressed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btn_cerrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_cerrarKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            System.exit(0);
        }

    }//GEN-LAST:event_btn_cerrarKeyPressed
    private void Iniciar_Formulario() {
        txt_num1.setText(null);
        txt_num2.setText(null);
        txt_num3.setText(null);
        area_resultado.setText(null);

    }

    private void Ejecutar_Algoritmo() {
        //Declarando Variables de Lectura
        double num1, num2, num3;

        //Entrada
        try {
            num1 = Double.parseDouble(txt_num1.getText());

        } catch (NumberFormatException e) {

            txt_num1.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Error de Java en la Base: Introduce un valor positivo");
            return;
        }

        try {
            num2 = Double.parseDouble(txt_num2.getText());

        } catch (NumberFormatException e) {

            txt_num2.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Error en la Altura: Introduce un valor positivo");
            return;
        }
        try {
            num3 = Double.parseDouble(txt_num3.getText());

        } catch (NumberFormatException e) {

            txt_num3.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Error de Java en la Base: Introduce un valor numerico");
            return;
        }

        //Construyendo el objeto, manipulando el contructor
        Menor_Mayor_Interface Obj_Menor_Mayor = new Menor_Mayor_Clase_Base(num1, num2, num3);

        //Proceso
        Obj_Menor_Mayor.setMayor();
        Obj_Menor_Mayor.setMenor();
        Obj_Menor_Mayor.setMedio();

        //Salida
        if (num1 != num2 && num1 != num3 && num2 != num3) {
            area_resultado.setText(null);
            area_resultado.append("Mayor: " + Obj_Menor_Mayor.getMayor() + "\n");
            area_resultado.append("Medio: " + Obj_Menor_Mayor.getMedio() + "\n");
            area_resultado.append("Menor " + Obj_Menor_Mayor.getMenor() + "\n");
        } else {
            casos_diversos(num1, num2, num3);
        }

    }

    private void casos_diversos(double num1, double num2, double num3) {
        if ((num1 == num2) && (num1 == num3)) {
            area_resultado.append("TODOS LOS NUMEROS SON IGUALES");
        } else {
            if ((num1 == num2) && num1 < num3) {
                area_resultado.append("MAYOR=..." + num3);
                area_resultado.append("\n");
                area_resultado.append("MENOR=..." + num1);
            } else {
                if ((num1 == num2) && num1 > num3) {
                    area_resultado.append("MENOR..." + num3);
                    area_resultado.append("\n");
                    area_resultado.append("MAYOR=..." + num1);
                }
            }
            if ((num1 == num3) && num1 < num2) {
                area_resultado.append("MAYOR=..." + num2);
                area_resultado.append("\n");
                area_resultado.append("MENOR=..." + num3);
            } else {
                if ((num1 == num3) && num1 > num2) {
                    area_resultado.append("MENOR=..." + num2);
                    area_resultado.append("\n");
                    area_resultado.append("MAYOR=..." + num3);
                }
            }
            if ((num3 == num2) && num3 < num1) {
                area_resultado.append("MAYOR=..." + num1);
                area_resultado.append("\n");
                area_resultado.append("MENOR=..." + num3);

            } else {
                if ((num3 == num2) && num3 > num1) {
                    area_resultado.append("MENOR=..." + num1);
                    area_resultado.append("\n");
                    area_resultado.append("MAYOR=..." + num3);
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area_resultado;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_imprimir;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_num1;
    private javax.swing.JLabel lbl_num2;
    private javax.swing.JLabel lbl_num3;
    private javax.swing.JTextField txt_num1;
    private javax.swing.JTextField txt_num2;
    private javax.swing.JTextField txt_num3;
    // End of variables declaration//GEN-END:variables
}