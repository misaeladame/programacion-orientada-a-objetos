/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_02_13_aplicacionarregloencapsulado;

import java.util.Random;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aa523
 */
public class JFramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JFramePrincipal
     */
    public JFramePrincipal() {
        initComponents();
        
        jTableDatos.setShowGrid(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDatos = new javax.swing.JTable();
        jSpinDatos = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jButAleatorios = new javax.swing.JButton();
        jButCalcular = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabSuma = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabPromedio = new javax.swing.JLabel();
        jLabMayor = new javax.swing.JLabel();
        jLabMediana = new javax.swing.JLabel();
        jLabMenor = new javax.swing.JLabel();
        jLabRango = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButOrdenar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dato", "Ordenados"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableDatos);

        jSpinDatos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinDatosStateChanged(evt);
            }
        });

        jLabel1.setText("Numero de datos");

        jButAleatorios.setText("Aleatorios");
        jButAleatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAleatoriosActionPerformed(evt);
            }
        });

        jButCalcular.setText("Calcular");
        jButCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButCalcularActionPerformed(evt);
            }
        });

        jLabel2.setText("Suma");

        jLabSuma.setBackground(new java.awt.Color(255, 102, 102));
        jLabSuma.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabSuma.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabSuma.setOpaque(true);

        jLabel4.setText("Promedio");

        jLabel5.setText("Menor");

        jLabel6.setText("Mayor");

        jLabel7.setText("Rango");

        jLabPromedio.setBackground(new java.awt.Color(255, 102, 102));
        jLabPromedio.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabPromedio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabPromedio.setOpaque(true);

        jLabMayor.setBackground(new java.awt.Color(255, 102, 102));
        jLabMayor.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabMayor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabMayor.setOpaque(true);

        jLabMediana.setBackground(new java.awt.Color(255, 102, 102));
        jLabMediana.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabMediana.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabMediana.setOpaque(true);

        jLabMenor.setBackground(new java.awt.Color(255, 102, 102));
        jLabMenor.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabMenor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabMenor.setOpaque(true);

        jLabRango.setBackground(new java.awt.Color(255, 102, 102));
        jLabRango.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabRango.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabRango.setOpaque(true);

        jLabel13.setText("Mediana");

        jButOrdenar.setText("Ordenar");
        jButOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButOrdenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addComponent(jSpinDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButAleatorios)
                        .addGap(18, 18, 18)
                        .addComponent(jButCalcular)
                        .addGap(18, 18, 18)
                        .addComponent(jButOrdenar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel13))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabMayor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabMediana, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabRango, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButAleatorios)
                    .addComponent(jButCalcular)
                    .addComponent(jButOrdenar))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabMayor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabMenor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addComponent(jLabRango, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabMediana, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(0, 71, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButAleatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAleatoriosActionPerformed
        // TODO add your handling code here:
        Random azar = new Random();
        
        for(int r=0; r<jTableDatos.getRowCount(); r++)
            jTableDatos.setValueAt(azar.nextInt(1000), r, 0);
    }//GEN-LAST:event_jButAleatoriosActionPerformed

    private void jButCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButCalcularActionPerformed
        // TODO add your handling code here:
        Arreglo uno = new Arreglo(jTableDatos.getRowCount());
        for(int r=0; r<uno.getTamaño(); r++)
            uno.setValor(Double.parseDouble(jTableDatos.getValueAt(r, 0)+""), r);
        
        jLabSuma.setText(uno.suma()+"");
        jLabPromedio.setText(uno.promedio()+"");
        jLabMayor.setText(uno.mayor()+"");
        jLabMenor.setText(uno.menor()+"");
        jLabRango.setText(uno.rango()+"");
        jLabMediana.setText(uno.mediana()+"");
        
        
    }//GEN-LAST:event_jButCalcularActionPerformed

    private void jSpinDatosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinDatosStateChanged
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) jTableDatos.getModel();
        modelo.setRowCount(Integer.parseInt(jSpinDatos.getValue()+""));
    }//GEN-LAST:event_jSpinDatosStateChanged

    private void jButOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButOrdenarActionPerformed
        // TODO add your handling code here:
         Arreglo uno = new Arreglo(jTableDatos.getRowCount());
        for(int r=0; r<uno.getTamaño(); r++)
            uno.setValor(Double.parseDouble(jTableDatos.getValueAt(r, 0)+""), r);
        
        double [] x = uno.arregloOrdenado();
        
        for(int r=0; r<x.length; r++)
            jTableDatos.setValueAt(x[r], r, 1);
        
    }//GEN-LAST:event_jButOrdenarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButAleatorios;
    private javax.swing.JButton jButCalcular;
    private javax.swing.JButton jButOrdenar;
    private javax.swing.JLabel jLabMayor;
    private javax.swing.JLabel jLabMediana;
    private javax.swing.JLabel jLabMenor;
    private javax.swing.JLabel jLabPromedio;
    private javax.swing.JLabel jLabRango;
    private javax.swing.JLabel jLabSuma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinDatos;
    private javax.swing.JTable jTableDatos;
    // End of variables declaration//GEN-END:variables
}