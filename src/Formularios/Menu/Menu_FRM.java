package Formularios.Menu;

import Formularios.Secuenciacion.Sec_P00_Cheques.*;
import Formularios.Secuenciacion.Sec_P01_Evaluar_Y.*;
import Formularios.Secuenciacion.Sec_P02_Menor_Mayor.*;
import java.awt.Component;
import java.awt.Dimension;

public class Menu_FRM extends javax.swing.JFrame {

    public Menu_FRM() {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mbar_Archivo = new javax.swing.JMenu();
        jm_item_cerrar = new javax.swing.JMenuItem();
        mbar_Secuenciacion = new javax.swing.JMenu();
        jm_Item_Cheques = new javax.swing.JMenu();
        jm_Item_App_Sec_00 = new javax.swing.JMenuItem();
        jm_item_Modelo_Sec_00 = new javax.swing.JMenuItem();
        jm_Item_Ayuda_Sec_00 = new javax.swing.JMenuItem();
        jm_Item_Evaluar_Y = new javax.swing.JMenu();
        jm_Item_App_Sec_01 = new javax.swing.JMenuItem();
        jm_Item_Modelo_Sec_01 = new javax.swing.JMenuItem();
        jm_Item_Ayuda_Sec_01 = new javax.swing.JMenuItem();
        jm_item_Menor_Mayor = new javax.swing.JMenu();
        jm_Item_App_Sec_02 = new javax.swing.JMenuItem();
        jm_Item_Modelo_Sec_02 = new javax.swing.JMenuItem();
        jm_Item_Ayuda_Sec_02 = new javax.swing.JMenuItem();
        jm_item_Evaluar_Z = new javax.swing.JMenu();
        jm_Item_App_Sec_03 = new javax.swing.JMenuItem();
        jm_Item_Modelo_Sec_03 = new javax.swing.JMenuItem();
        jm_Item_Ayuda_Sec_03 = new javax.swing.JMenuItem();
        jm_item_MMPR = new javax.swing.JMenu();
        jm_Item_App_Sec_04 = new javax.swing.JMenuItem();
        jm_Item_Modelo_Sec_04 = new javax.swing.JMenuItem();
        jm_Item_Ayuda_Sec_04 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jm_Item_App_Sec_05 = new javax.swing.JMenuItem();
        jm_Item_Modelo_Sec_05 = new javax.swing.JMenuItem();
        jm_Item_Ayuda_Sec_05 = new javax.swing.JMenuItem();
        mbar_Vector = new javax.swing.JMenu();
        jm_Item_Vector_Mayor_Menor = new javax.swing.JMenu();
        jm_Item_App_Vectores_06 = new javax.swing.JMenuItem();
        jm_Item_Modelo_Vectores_06 = new javax.swing.JMenuItem();
        jm_Item_Ayuda_Vectores_06 = new javax.swing.JMenuItem();
        jm_Item_Vector_Intercambio = new javax.swing.JMenu();
        jm_Item_App_Vectores_07 = new javax.swing.JMenuItem();
        jm_Item_Modelo_Vectores_07 = new javax.swing.JMenuItem();
        jm_Item_Ayuda_Vectores_07 = new javax.swing.JMenuItem();
        jm_Item_Vector_Ordenamiento = new javax.swing.JMenu();
        jm_Item_App_Vectores_08 = new javax.swing.JMenuItem();
        jm_Item_Modelo_Vectores_08 = new javax.swing.JMenuItem();
        jm_Item_Ayuda_Vectores_08 = new javax.swing.JMenuItem();
        jm_Item_Temperaturas_Ambientales = new javax.swing.JMenu();
        jm_Item_App_Vectores_09 = new javax.swing.JMenuItem();
        jm_Item_Modelo_Vectores_09 = new javax.swing.JMenuItem();
        jm_Item_Ayuda_Vectores_09 = new javax.swing.JMenuItem();
        mbar_Matriz = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jm_Item_App_Matrices_010 = new javax.swing.JMenuItem();
        jm_Item_Modelo_Matrices_010 = new javax.swing.JMenuItem();
        jm_Item_Ayuda_Matrices_010 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jm_Item_App_Matrices_011 = new javax.swing.JMenuItem();
        jm_Item_Modelo_Matrices_011 = new javax.swing.JMenuItem();
        jm_Item_Ayuda_Matrices_011 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jm_Item_App_Matrices_012 = new javax.swing.JMenuItem();
        jm_Item_Modelo_Matrices_012 = new javax.swing.JMenuItem();
        jm_Item_Ayuda_Matrices_012 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jm_Item_App_Matrices_013 = new javax.swing.JMenuItem();
        jm_Item_Modelo_Matrices_013 = new javax.swing.JMenuItem();
        jm_Item_Ayuda_Matrices_013 = new javax.swing.JMenuItem();
        mbar_Herencia = new javax.swing.JMenu();
        mbar_Polimorfismo = new javax.swing.JMenu();
        mbar_Ayuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Portafolio de programacion orientada a objetos");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 586, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );

        mbar_Archivo.setText("Archivo");
        mbar_Archivo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        jm_item_cerrar.setText("Cerrar");
        jm_item_cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_item_cerrarActionPerformed(evt);
            }
        });
        mbar_Archivo.add(jm_item_cerrar);

        jMenuBar1.add(mbar_Archivo);

        mbar_Secuenciacion.setText("Secuenciacion");
        mbar_Secuenciacion.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jm_Item_Cheques.setText("Cheques de empleados");
        jm_Item_Cheques.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jm_Item_App_Sec_00.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jm_Item_App_Sec_00.setText("Aplicacion");
        jm_Item_App_Sec_00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_Item_App_Sec_00ActionPerformed(evt);
            }
        });
        jm_Item_Cheques.add(jm_Item_App_Sec_00);

        jm_item_Modelo_Sec_00.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jm_item_Modelo_Sec_00.setText("Modelo");
        jm_item_Modelo_Sec_00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_item_Modelo_Sec_00ActionPerformed(evt);
            }
        });
        jm_Item_Cheques.add(jm_item_Modelo_Sec_00);

        jm_Item_Ayuda_Sec_00.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jm_Item_Ayuda_Sec_00.setText("Ayuda");
        jm_Item_Ayuda_Sec_00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_Item_Ayuda_Sec_00ActionPerformed(evt);
            }
        });
        jm_Item_Cheques.add(jm_Item_Ayuda_Sec_00);

        mbar_Secuenciacion.add(jm_Item_Cheques);

        jm_Item_Evaluar_Y.setText("Evaluar Y");

        jm_Item_App_Sec_01.setText("Apliacion");
        jm_Item_App_Sec_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_Item_App_Sec_01ActionPerformed(evt);
            }
        });
        jm_Item_Evaluar_Y.add(jm_Item_App_Sec_01);

        jm_Item_Modelo_Sec_01.setText("Modelo");
        jm_Item_Modelo_Sec_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_Item_Modelo_Sec_01ActionPerformed(evt);
            }
        });
        jm_Item_Evaluar_Y.add(jm_Item_Modelo_Sec_01);

        jm_Item_Ayuda_Sec_01.setText("Ayuda");
        jm_Item_Ayuda_Sec_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_Item_Ayuda_Sec_01ActionPerformed(evt);
            }
        });
        jm_Item_Evaluar_Y.add(jm_Item_Ayuda_Sec_01);

        mbar_Secuenciacion.add(jm_Item_Evaluar_Y);

        jm_item_Menor_Mayor.setText("Menor-Mayor");

        jm_Item_App_Sec_02.setText("Aplicacion");
        jm_Item_App_Sec_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_Item_App_Sec_02ActionPerformed(evt);
            }
        });
        jm_item_Menor_Mayor.add(jm_Item_App_Sec_02);

        jm_Item_Modelo_Sec_02.setText("Modelo");
        jm_Item_Modelo_Sec_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_Item_Modelo_Sec_02ActionPerformed(evt);
            }
        });
        jm_item_Menor_Mayor.add(jm_Item_Modelo_Sec_02);

        jm_Item_Ayuda_Sec_02.setText("Ayuda");
        jm_Item_Ayuda_Sec_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_Item_Ayuda_Sec_02ActionPerformed(evt);
            }
        });
        jm_item_Menor_Mayor.add(jm_Item_Ayuda_Sec_02);

        mbar_Secuenciacion.add(jm_item_Menor_Mayor);

        jm_item_Evaluar_Z.setText("Evaluar Z");

        jm_Item_App_Sec_03.setText("Aplicacion");
        jm_item_Evaluar_Z.add(jm_Item_App_Sec_03);

        jm_Item_Modelo_Sec_03.setText("Modelo");
        jm_item_Evaluar_Z.add(jm_Item_Modelo_Sec_03);

        jm_Item_Ayuda_Sec_03.setText("Ayuda");
        jm_item_Evaluar_Z.add(jm_Item_Ayuda_Sec_03);

        mbar_Secuenciacion.add(jm_item_Evaluar_Z);

        jm_item_MMPR.setText("Tabla de  importes");

        jm_Item_App_Sec_04.setText("Aplicacion");
        jm_item_MMPR.add(jm_Item_App_Sec_04);

        jm_Item_Modelo_Sec_04.setText("Modelo");
        jm_item_MMPR.add(jm_Item_Modelo_Sec_04);

        jm_Item_Ayuda_Sec_04.setText("Ayuda");
        jm_item_MMPR.add(jm_Item_Ayuda_Sec_04);

        mbar_Secuenciacion.add(jm_item_MMPR);

        jMenu5.setText("MMPR");

        jm_Item_App_Sec_05.setText("Aplicacion");
        jMenu5.add(jm_Item_App_Sec_05);

        jm_Item_Modelo_Sec_05.setText("Modelo");
        jMenu5.add(jm_Item_Modelo_Sec_05);

        jm_Item_Ayuda_Sec_05.setText("Ayuda");
        jMenu5.add(jm_Item_Ayuda_Sec_05);

        mbar_Secuenciacion.add(jMenu5);

        jMenuBar1.add(mbar_Secuenciacion);

        mbar_Vector.setText("Vectores");
        mbar_Vector.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jm_Item_Vector_Mayor_Menor.setText("Vector Mayor Menor");

        jm_Item_App_Vectores_06.setText("Apliacion");
        jm_Item_Vector_Mayor_Menor.add(jm_Item_App_Vectores_06);

        jm_Item_Modelo_Vectores_06.setText("Modelo");
        jm_Item_Vector_Mayor_Menor.add(jm_Item_Modelo_Vectores_06);

        jm_Item_Ayuda_Vectores_06.setText("Ayuda");
        jm_Item_Vector_Mayor_Menor.add(jm_Item_Ayuda_Vectores_06);

        mbar_Vector.add(jm_Item_Vector_Mayor_Menor);

        jm_Item_Vector_Intercambio.setText("Vector Intercambio");

        jm_Item_App_Vectores_07.setText("Aplicacion");
        jm_Item_Vector_Intercambio.add(jm_Item_App_Vectores_07);

        jm_Item_Modelo_Vectores_07.setText("Modelo");
        jm_Item_Vector_Intercambio.add(jm_Item_Modelo_Vectores_07);

        jm_Item_Ayuda_Vectores_07.setText("Ayuda");
        jm_Item_Vector_Intercambio.add(jm_Item_Ayuda_Vectores_07);

        mbar_Vector.add(jm_Item_Vector_Intercambio);

        jm_Item_Vector_Ordenamiento.setText("Vector Ordenamiento");

        jm_Item_App_Vectores_08.setText("Aplicacion");
        jm_Item_Vector_Ordenamiento.add(jm_Item_App_Vectores_08);

        jm_Item_Modelo_Vectores_08.setText("Modelo");
        jm_Item_Vector_Ordenamiento.add(jm_Item_Modelo_Vectores_08);

        jm_Item_Ayuda_Vectores_08.setText("Ayuda");
        jm_Item_Vector_Ordenamiento.add(jm_Item_Ayuda_Vectores_08);

        mbar_Vector.add(jm_Item_Vector_Ordenamiento);

        jm_Item_Temperaturas_Ambientales.setText("Temperaturas Ambientales");

        jm_Item_App_Vectores_09.setText("Aplicacion");
        jm_Item_Temperaturas_Ambientales.add(jm_Item_App_Vectores_09);

        jm_Item_Modelo_Vectores_09.setText("Modelo");
        jm_Item_Temperaturas_Ambientales.add(jm_Item_Modelo_Vectores_09);

        jm_Item_Ayuda_Vectores_09.setText("Ayuda");
        jm_Item_Temperaturas_Ambientales.add(jm_Item_Ayuda_Vectores_09);

        mbar_Vector.add(jm_Item_Temperaturas_Ambientales);

        jMenuBar1.add(mbar_Vector);

        mbar_Matriz.setText("Matrices");
        mbar_Matriz.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jMenu1.setText("Mayor Diagonal");

        jm_Item_App_Matrices_010.setText("Aplicacion");
        jMenu1.add(jm_Item_App_Matrices_010);

        jm_Item_Modelo_Matrices_010.setText("Modelo");
        jMenu1.add(jm_Item_Modelo_Matrices_010);

        jm_Item_Ayuda_Matrices_010.setText("Ayuda");
        jMenu1.add(jm_Item_Ayuda_Matrices_010);

        mbar_Matriz.add(jMenu1);

        jMenu2.setText("Interambio de Columnas");

        jm_Item_App_Matrices_011.setText("Aplicacion");
        jMenu2.add(jm_Item_App_Matrices_011);

        jm_Item_Modelo_Matrices_011.setText("Modelo");
        jMenu2.add(jm_Item_Modelo_Matrices_011);

        jm_Item_Ayuda_Matrices_011.setText("Ayuda");
        jMenu2.add(jm_Item_Ayuda_Matrices_011);

        mbar_Matriz.add(jMenu2);

        jMenu3.setText("Suma Columnas");

        jm_Item_App_Matrices_012.setText("Aplicacion");
        jMenu3.add(jm_Item_App_Matrices_012);

        jm_Item_Modelo_Matrices_012.setText("Modelo");
        jMenu3.add(jm_Item_Modelo_Matrices_012);

        jm_Item_Ayuda_Matrices_012.setText("Ayuda");
        jMenu3.add(jm_Item_Ayuda_Matrices_012);

        mbar_Matriz.add(jMenu3);

        jMenu4.setText("Suma Resta Renglones");

        jm_Item_App_Matrices_013.setText("Aplicacion");
        jMenu4.add(jm_Item_App_Matrices_013);

        jm_Item_Modelo_Matrices_013.setText("Modelo");
        jMenu4.add(jm_Item_Modelo_Matrices_013);

        jm_Item_Ayuda_Matrices_013.setText("Ayuda");
        jMenu4.add(jm_Item_Ayuda_Matrices_013);

        mbar_Matriz.add(jMenu4);

        jMenuBar1.add(mbar_Matriz);

        mbar_Herencia.setText("Herencia");
        mbar_Herencia.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuBar1.add(mbar_Herencia);

        mbar_Polimorfismo.setText("Polimorfismo");
        jMenuBar1.add(mbar_Polimorfismo);

        mbar_Ayuda.setText("Ayuda");
        jMenuBar1.add(mbar_Ayuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jm_item_cerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_item_cerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jm_item_cerrarActionPerformed

    private void jm_Item_App_Sec_00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_Item_App_Sec_00ActionPerformed
        P00_Cheques_FRM Formulario = new P00_Cheques_FRM();
        Iniciar_Ventana(Formulario);
    }//GEN-LAST:event_jm_Item_App_Sec_00ActionPerformed

    private void jm_Item_App_Sec_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_Item_App_Sec_01ActionPerformed
        P01_Evaluar_Y_FRM Formulario=new P01_Evaluar_Y_FRM();
        Iniciar_Ventana(Formulario);
    }//GEN-LAST:event_jm_Item_App_Sec_01ActionPerformed

    private void jm_item_Modelo_Sec_00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_item_Modelo_Sec_00ActionPerformed
        P00_Modelo_FRM Modelo = new P00_Modelo_FRM();
        Iniciar_Ventana(Modelo);
    }//GEN-LAST:event_jm_item_Modelo_Sec_00ActionPerformed

    private void jm_Item_Modelo_Sec_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_Item_Modelo_Sec_01ActionPerformed
        P01_Modelo_FRM Modelo= new P01_Modelo_FRM();
        Iniciar_Ventana(Modelo);
    }//GEN-LAST:event_jm_Item_Modelo_Sec_01ActionPerformed

    private void jm_Item_Ayuda_Sec_00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_Item_Ayuda_Sec_00ActionPerformed
        P00_Ayuda_FRM Ayuda =new P00_Ayuda_FRM();
        Iniciar_Ventana(Ayuda);
    }//GEN-LAST:event_jm_Item_Ayuda_Sec_00ActionPerformed

    private void jm_Item_App_Sec_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_Item_App_Sec_02ActionPerformed
       P02_Menor_Mayor_FRM Formulario =new P02_Menor_Mayor_FRM();
        Iniciar_Ventana(Formulario);
    }//GEN-LAST:event_jm_Item_App_Sec_02ActionPerformed

    private void jm_Item_Modelo_Sec_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_Item_Modelo_Sec_02ActionPerformed
        P02_Modelo_FRM Modelo =new P02_Modelo_FRM();
        Iniciar_Ventana(Modelo);
    }//GEN-LAST:event_jm_Item_Modelo_Sec_02ActionPerformed

    private void jm_Item_Ayuda_Sec_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_Item_Ayuda_Sec_02ActionPerformed
        P02_Ayuda_FRM Ayuda = new P02_Ayuda_FRM();
        Iniciar_Ventana(Ayuda);
    }//GEN-LAST:event_jm_Item_Ayuda_Sec_02ActionPerformed

    private void jm_Item_Ayuda_Sec_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_Item_Ayuda_Sec_01ActionPerformed
        P01_Ayuda_FRM Ayuda=new P01_Ayuda_FRM();
        Iniciar_Ventana(Ayuda);
    }//GEN-LAST:event_jm_Item_Ayuda_Sec_01ActionPerformed

    private void Iniciar_Ventana(Component Objeto_FRM) {
        jDesktopPane1.add(Objeto_FRM);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = Objeto_FRM.getSize();
        Objeto_FRM.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
        Objeto_FRM.setVisible(true);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu_FRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_FRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_FRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_FRM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_FRM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jm_Item_App_Matrices_010;
    private javax.swing.JMenuItem jm_Item_App_Matrices_011;
    private javax.swing.JMenuItem jm_Item_App_Matrices_012;
    private javax.swing.JMenuItem jm_Item_App_Matrices_013;
    private javax.swing.JMenuItem jm_Item_App_Sec_00;
    private javax.swing.JMenuItem jm_Item_App_Sec_01;
    private javax.swing.JMenuItem jm_Item_App_Sec_02;
    private javax.swing.JMenuItem jm_Item_App_Sec_03;
    private javax.swing.JMenuItem jm_Item_App_Sec_04;
    private javax.swing.JMenuItem jm_Item_App_Sec_05;
    private javax.swing.JMenuItem jm_Item_App_Vectores_06;
    private javax.swing.JMenuItem jm_Item_App_Vectores_07;
    private javax.swing.JMenuItem jm_Item_App_Vectores_08;
    private javax.swing.JMenuItem jm_Item_App_Vectores_09;
    private javax.swing.JMenuItem jm_Item_Ayuda_Matrices_010;
    private javax.swing.JMenuItem jm_Item_Ayuda_Matrices_011;
    private javax.swing.JMenuItem jm_Item_Ayuda_Matrices_012;
    private javax.swing.JMenuItem jm_Item_Ayuda_Matrices_013;
    private javax.swing.JMenuItem jm_Item_Ayuda_Sec_00;
    private javax.swing.JMenuItem jm_Item_Ayuda_Sec_01;
    private javax.swing.JMenuItem jm_Item_Ayuda_Sec_02;
    private javax.swing.JMenuItem jm_Item_Ayuda_Sec_03;
    private javax.swing.JMenuItem jm_Item_Ayuda_Sec_04;
    private javax.swing.JMenuItem jm_Item_Ayuda_Sec_05;
    private javax.swing.JMenuItem jm_Item_Ayuda_Vectores_06;
    private javax.swing.JMenuItem jm_Item_Ayuda_Vectores_07;
    private javax.swing.JMenuItem jm_Item_Ayuda_Vectores_08;
    private javax.swing.JMenuItem jm_Item_Ayuda_Vectores_09;
    private javax.swing.JMenu jm_Item_Cheques;
    private javax.swing.JMenu jm_Item_Evaluar_Y;
    private javax.swing.JMenuItem jm_Item_Modelo_Matrices_010;
    private javax.swing.JMenuItem jm_Item_Modelo_Matrices_011;
    private javax.swing.JMenuItem jm_Item_Modelo_Matrices_012;
    private javax.swing.JMenuItem jm_Item_Modelo_Matrices_013;
    private javax.swing.JMenuItem jm_Item_Modelo_Sec_01;
    private javax.swing.JMenuItem jm_Item_Modelo_Sec_02;
    private javax.swing.JMenuItem jm_Item_Modelo_Sec_03;
    private javax.swing.JMenuItem jm_Item_Modelo_Sec_04;
    private javax.swing.JMenuItem jm_Item_Modelo_Sec_05;
    private javax.swing.JMenuItem jm_Item_Modelo_Vectores_06;
    private javax.swing.JMenuItem jm_Item_Modelo_Vectores_07;
    private javax.swing.JMenuItem jm_Item_Modelo_Vectores_08;
    private javax.swing.JMenuItem jm_Item_Modelo_Vectores_09;
    private javax.swing.JMenu jm_Item_Temperaturas_Ambientales;
    private javax.swing.JMenu jm_Item_Vector_Intercambio;
    private javax.swing.JMenu jm_Item_Vector_Mayor_Menor;
    private javax.swing.JMenu jm_Item_Vector_Ordenamiento;
    private javax.swing.JMenu jm_item_Evaluar_Z;
    private javax.swing.JMenu jm_item_MMPR;
    private javax.swing.JMenu jm_item_Menor_Mayor;
    private javax.swing.JMenuItem jm_item_Modelo_Sec_00;
    private javax.swing.JMenuItem jm_item_cerrar;
    private javax.swing.JMenu mbar_Archivo;
    private javax.swing.JMenu mbar_Ayuda;
    private javax.swing.JMenu mbar_Herencia;
    private javax.swing.JMenu mbar_Matriz;
    private javax.swing.JMenu mbar_Polimorfismo;
    private javax.swing.JMenu mbar_Secuenciacion;
    private javax.swing.JMenu mbar_Vector;
    // End of variables declaration//GEN-END:variables
}
