package Formularios.Secuenciacion.Sec_P00_Cheques;

import Modelos.Secuenciacion.Sec_P00_Cheques.Empleado_Clase_Base;
import Modelos.Secuenciacion.Sec_P00_Cheques.Empleado_Interface;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class P00_Cheques_FRM extends javax.swing.JInternalFrame {

    public static DecimalFormat Decf = new DecimalFormat("$#,##0.00");

    public P00_Cheques_FRM() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lbl_Imprimir_Cheque = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area_cheque = new javax.swing.JTextArea();
        lbl_nombre = new javax.swing.JLabel();
        lbl_horastrab = new javax.swing.JLabel();
        lbl_cuaota_hora = new javax.swing.JLabel();
        btn_imrpimir = new javax.swing.JButton();
        btn_iniciar = new javax.swing.JButton();
        btn_cerrar = new javax.swing.JButton();
        txt_nombreEmp = new javax.swing.JTextField();
        txt_hora_trab = new javax.swing.JTextField();
        txt_cuotaHora = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setText("jLabel2");

        lbl_Imprimir_Cheque.setFont(new java.awt.Font("sansserif", 0, 36)); // NOI18N
        lbl_Imprimir_Cheque.setText("Impresión de Cheque");

        area_cheque.setEditable(false);
        area_cheque.setColumns(20);
        area_cheque.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        area_cheque.setRows(5);
        jScrollPane1.setViewportView(area_cheque);

        lbl_nombre.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lbl_nombre.setText("Nombre.:");

        lbl_horastrab.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lbl_horastrab.setText("Horas Trabajadas.:");

        lbl_cuaota_hora.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lbl_cuaota_hora.setText("Pago por hora.:");

        btn_imrpimir.setText("Imprimir");
        btn_imrpimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imrpimirActionPerformed(evt);
            }
        });
        btn_imrpimir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_imrpimirKeyPressed(evt);
            }
        });

        btn_iniciar.setText("Iniciar");
        btn_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciarActionPerformed(evt);
            }
        });
        btn_iniciar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_iniciarKeyPressed(evt);
            }
        });

        btn_cerrar.setText("Cerrar");
        btn_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cerrarActionPerformed(evt);
            }
        });

        txt_nombreEmp.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_nombreEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreEmpActionPerformed(evt);
            }
        });

        txt_hora_trab.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_hora_trab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hora_trabActionPerformed(evt);
            }
        });
        txt_hora_trab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_hora_trabKeyTyped(evt);
            }
        });

        txt_cuotaHora.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_cuotaHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cuotaHoraActionPerformed(evt);
            }
        });
        txt_cuotaHora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cuotaHoraKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lbl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 354, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_Imprimir_Cheque, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_imrpimir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(btn_iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(btn_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_horastrab, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_cuaota_hora))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_hora_trab, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                    .addComponent(txt_cuotaHora))))
                        .addGap(0, 29, Short.MAX_VALUE))
                    .addComponent(txt_nombreEmp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 114, Short.MAX_VALUE)
                        .addComponent(lbl_nombre))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_Imprimir_Cheque)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txt_nombreEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_horastrab)
                            .addComponent(txt_hora_trab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_cuaota_hora)
                            .addComponent(txt_cuotaHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(111, 111, 111)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_imrpimir)
                            .addComponent(btn_iniciar)
                            .addComponent(btn_cerrar))
                        .addGap(0, 75, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_imrpimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imrpimirActionPerformed
        Ejecutar_Algoritmo();
        btn_iniciar.requestFocus();
    }//GEN-LAST:event_btn_imrpimirActionPerformed

    private void btn_imrpimirKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_imrpimirKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            Ejecutar_Algoritmo();
        }
        btn_iniciar.requestFocus();
    }//GEN-LAST:event_btn_imrpimirKeyPressed

    private void btn_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciarActionPerformed
        Iniciar_Formulario();
    }//GEN-LAST:event_btn_iniciarActionPerformed

    private void btn_iniciarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_iniciarKeyPressed
        Iniciar_Formulario();
    }//GEN-LAST:event_btn_iniciarKeyPressed

    private void btn_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cerrarActionPerformed
       dispose();
    }//GEN-LAST:event_btn_cerrarActionPerformed

    private void txt_nombreEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreEmpActionPerformed
        txt_hora_trab.requestFocus();
    }//GEN-LAST:event_txt_nombreEmpActionPerformed

    private void txt_hora_trabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hora_trabActionPerformed
        txt_cuotaHora.requestFocus();
    }//GEN-LAST:event_txt_hora_trabActionPerformed

    private void txt_hora_trabKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_hora_trabKeyTyped

        if (evt.getKeyChar() < '0') {
            evt.consume();
        }
        if (evt.getKeyChar() > '9')
            evt.consume();
    }//GEN-LAST:event_txt_hora_trabKeyTyped

    private void txt_cuotaHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cuotaHoraActionPerformed
        btn_imrpimir.requestFocus();
    }//GEN-LAST:event_txt_cuotaHoraActionPerformed

    private void txt_cuotaHoraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cuotaHoraKeyTyped

        if (evt.getKeyChar() == '.') {
            return;
        }
        if (evt.getKeyChar() < '0') {
            evt.consume();
        }
        if (evt.getKeyChar() > '9')
            evt.consume();
    }//GEN-LAST:event_txt_cuotaHoraKeyTyped
    private void Ejecutar_Algoritmo() {
        //Declarando Variables de Lectura
        String nombreEmp;
        int horasTrab;
        double cuotaHora;

        //Entrada
        nombreEmp = txt_nombreEmp.getText();
        try {
            horasTrab = Integer.parseInt(txt_hora_trab.getText());
            if (horasTrab <= 0) {
                txt_hora_trab.requestFocus();
                JOptionPane.showMessageDialog(rootPane, "Error Introduce un valor positivo");
                return;
            }
        } catch (NumberFormatException e) {

            txt_hora_trab.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Error de Java en la Base: Introduce un valor positivo");
            return;
        }

        try {
            cuotaHora = Double.parseDouble(txt_cuotaHora.getText());
            if (cuotaHora <= 0) {
                txt_cuotaHora.requestFocus();
                JOptionPane.showMessageDialog(rootPane, "Error Introduce un valor positivo");
                return;
            }
        } catch (NumberFormatException e) {

            txt_cuotaHora.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Error en la Altura: Introduce un valor positivo");
            return;
        }

        //Construyendo el objeto, manipulando el contructor
        Empleado_Interface Obj_Empleado = new Empleado_Clase_Base(nombreEmp, horasTrab, cuotaHora);

        //Proceso
        Obj_Empleado.setSueldo();

        //Salida
        area_cheque.setText(null);
        area_cheque.append("======>Cheque<=====\n");
        area_cheque.append("Nombre.:" + Obj_Empleado.getNombreEmp() + "\n");
        area_cheque.append("Importe.:" + Decf.format(Obj_Empleado.getSueldo()));

    }

    private void Iniciar_Formulario() {
        txt_cuotaHora.setText(null);
        txt_hora_trab.setText(null);
        txt_nombreEmp.setText(null);
        area_cheque.setText(null);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area_cheque;
    private javax.swing.JButton btn_cerrar;
    private javax.swing.JButton btn_imrpimir;
    private javax.swing.JButton btn_iniciar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Imprimir_Cheque;
    private javax.swing.JLabel lbl_cuaota_hora;
    private javax.swing.JLabel lbl_horastrab;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JTextField txt_cuotaHora;
    private javax.swing.JTextField txt_hora_trab;
    private javax.swing.JTextField txt_nombreEmp;
    // End of variables declaration//GEN-END:variables
}
