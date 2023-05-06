
package Formularios.Secuenciacion.Sec_P01_Evaluar_Y;
import Modelos.Secuenciacion.Sec_P01_Evaluar_Y.Calcular_Y_Clase_Base;
import Modelos.Secuenciacion.Sec_P01_Evaluar_Y.Calcular_Y_Interface;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class P01_Evaluar_Y_FRM extends javax.swing.JInternalFrame {

   public static DecimalFormat Decf = new DecimalFormat("$#,##0.00");
    
    public P01_Evaluar_Y_FRM() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private void Iniciar_Formulario() {
        txt_a.setText(null);
        txt_b.setText(null);
        txt_x.setText(null);
        area_y.setText(null);

    }

    private void Ejecutar_Algoritmo() {
        //Declarando Variables de Lectura
        double a, b, x, y;

        //Entrada
        // nombreEmp = txt_nombreEmp.getText();
        try {
            a = Double.parseDouble(txt_a.getText());

        } catch (NumberFormatException e) {

            txt_a.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Error de Java en la Base: Introduce un valor positivo");
            return;
        }

        try {
            b = Double.parseDouble(txt_b.getText());

        } catch (NumberFormatException e) {

            txt_b.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Error en la Altura: Introduce un valor positivo");
            return;
        }
        try {
            x = Double.parseDouble(txt_x.getText());
            if (x <= 0) {

                JOptionPane.showMessageDialog(rootPane, "PARA X INTRODUZCA UN VALOR MENOR O MAYOR A 0");
                txt_x.requestFocus();
                return;
            }
        } catch (NumberFormatException e) {

            txt_x.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Error de Java en la Base: Introduce un valor numerico");
            return;
        }

        //Construyendo el objeto, manipulando el contructor
        Calcular_Y_Interface Obj_Calcular_Y = new Calcular_Y_Clase_Base(a, b, x);

        //Proceso
        Obj_Calcular_Y.setY();

        //Salida
        area_y.setText(null);
        area_y.append("======>Valor De Y<=====\n");
        area_y.append("Y.:" + Decf.format(Obj_Calcular_Y.getY()));

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_a = new javax.swing.JLabel();
        txt_a = new javax.swing.JTextField();
        lbl_b = new javax.swing.JLabel();
        txt_b = new javax.swing.JTextField();
        lbl_x = new javax.swing.JLabel();
        txt_x = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btn_imprimir = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area_y = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel1.setText("CALCULAR 'Y'");

        lbl_a.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbl_a.setText("INTRODUCE EL VALOR DE 'A':");

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

        lbl_b.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbl_b.setText("INTRODUCE EL VALOR DE 'B':");

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

        lbl_x.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lbl_x.setText("INTRODUCE EL VALOR DE 'X':");

        txt_x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_xActionPerformed(evt);
            }
        });
        txt_x.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_xKeyTyped(evt);
            }
        });

        jLabel3.setText("jLabel3");

        btn_imprimir.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
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

        btn_limpiar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
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

        btn_cerrar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
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

        area_y.setEditable(false);
        area_y.setColumns(20);
        area_y.setRows(5);
        jScrollPane1.setViewportView(area_y);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_a)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_a))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_b)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_b))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_x)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_x, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_imprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(jLabel2))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_a)
                    .addComponent(txt_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_b)
                    .addComponent(txt_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_x)
                    .addComponent(txt_x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        txt_x.requestFocus();
    }//GEN-LAST:event_txt_bActionPerformed

    private void txt_bKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bKeyTyped
        if (evt.getKeyChar() < '0') {
            evt.consume();
        }
        if (evt.getKeyChar() > '9')
        evt.consume();
    }//GEN-LAST:event_txt_bKeyTyped

    private void txt_xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_xActionPerformed
        btn_imprimir.requestFocus();
    }//GEN-LAST:event_txt_xActionPerformed

    private void txt_xKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_xKeyTyped
        if (evt.getKeyChar() < '0') {
            evt.consume();
        }
        if (evt.getKeyChar() > '9')
        evt.consume();
    }//GEN-LAST:event_txt_xKeyTyped

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
        txt_a.requestFocus();
    }//GEN-LAST:event_btn_limpiarKeyPressed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void btn_cerrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_cerrarKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            System.exit(0);
        }

    }//GEN-LAST:event_btn_cerrarKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area_y;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_imprimir;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_a;
    private javax.swing.JLabel lbl_b;
    private javax.swing.JLabel lbl_x;
    private javax.swing.JTextField txt_a;
    private javax.swing.JTextField txt_b;
    private javax.swing.JTextField txt_x;
    // End of variables declaration//GEN-END:variables
}