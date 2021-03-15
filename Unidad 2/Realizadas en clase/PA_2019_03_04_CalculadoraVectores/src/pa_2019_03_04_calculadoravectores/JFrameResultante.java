/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_03_04_calculadoravectores;

import java.util.Random;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aa524
 */
public class JFrameResultante extends javax.swing.JFrame {

    /**
     * Creates new form JFrameResultante
     */
    public JFrameResultante() {
        initComponents();
        
        jTableVectores.setShowGrid(true);
        jTableResultante.setShowGrid(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSpinVectores = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVectores = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableResultante = new javax.swing.JTable();
        jButResultante = new javax.swing.JButton();
        jButAleatorios = new javax.swing.JButton();
        jButEjemplo = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Número de vectores");

        jSpinVectores.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinVectoresStateChanged(evt);
            }
        });

        jTableVectores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Magnitud", "Arreglo", "Coordenada X", "Coordenada Y"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableVectores);
        if (jTableVectores.getColumnModel().getColumnCount() > 0) {
            jTableVectores.getColumnModel().getColumn(0).setResizable(false);
            jTableVectores.getColumnModel().getColumn(1).setResizable(false);
            jTableVectores.getColumnModel().getColumn(2).setResizable(false);
            jTableVectores.getColumnModel().getColumn(3).setResizable(false);
        }

        jTableResultante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Magnitud", "Arreglo", "Coordenada X", "Coordenada Y"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableResultante);
        if (jTableResultante.getColumnModel().getColumnCount() > 0) {
            jTableResultante.getColumnModel().getColumn(0).setResizable(false);
            jTableResultante.getColumnModel().getColumn(1).setResizable(false);
            jTableResultante.getColumnModel().getColumn(2).setResizable(false);
            jTableResultante.getColumnModel().getColumn(3).setResizable(false);
        }

        jButResultante.setText("Resultante");
        jButResultante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButResultanteActionPerformed(evt);
            }
        });

        jButAleatorios.setText("Aleatorios");
        jButAleatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAleatoriosActionPerformed(evt);
            }
        });

        jButEjemplo.setText("Ejemplo");
        jButEjemplo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButEjemploActionPerformed(evt);
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
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(jSpinVectores, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButResultante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButAleatorios)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButEjemplo))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jSpinVectores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButResultante)
                    .addComponent(jButAleatorios)
                    .addComponent(jButEjemplo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSpinVectoresStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinVectoresStateChanged
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel)jTableVectores.getModel();
        
        modelo.setRowCount(Integer.parseInt(jSpinVectores.getValue()+""));
    }//GEN-LAST:event_jSpinVectoresStateChanged

    private void jButAleatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAleatoriosActionPerformed
        // TODO add your handling code here:
        Random azar = new Random();
        
        for(int r=0; r<jTableVectores.getRowCount(); r++) 
        {
            for(int c=0; c<jTableVectores.getColumnCount(); c++)
            {
                jTableVectores.setValueAt(null, r, c);
            }
            
            if(azar.nextBoolean()) 
            {
                jTableVectores.setValueAt(azar.nextInt(500), r, 0); // magnitud
                jTableVectores.setValueAt(azar.nextInt(361), r, 1); // angulo
            }
            else
            {
                jTableVectores.setValueAt(azar.nextInt(500), r, 2); // x
                jTableVectores.setValueAt(azar.nextInt(500), r, 3); // y    
            }
        }
    }//GEN-LAST:event_jButAleatoriosActionPerformed

    private void jButResultanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButResultanteActionPerformed
        // TODO add your handling code here:
        Vector renglon = new Vector();
        Vector resultante = new Vector();
        
        for(int r=0; r<jTableVectores.getRowCount(); r++) 
        {
            if(jTableVectores.getValueAt(r, 0) == null) 
            {
                // el usuario capturó x, y
                renglon.setXY(Double.parseDouble(jTableVectores.getValueAt(r, 2)+""), 
                              Double.parseDouble(jTableVectores.getValueAt(r, 3)+""));
                
                jTableVectores.setValueAt(renglon.getMagnitud(), r, 0);
                jTableVectores.setValueAt(renglon.getAngulo(), r, 1);
            }
            else 
            {
                // el usuario capturó magnitud y ángulo
                renglon.setMagnitud(Double.parseDouble(jTableVectores.getValueAt(r, 0)+""));
                renglon.setAngulo(Double.parseDouble(jTableVectores.getValueAt(r, 1)+""));
                
                jTableVectores.setValueAt(renglon.getX(), r, 2);
                jTableVectores.setValueAt(renglon.getY(), r, 3);
            }
            
            resultante = resultante.suma(renglon);
        }
        
        jTableResultante.setValueAt(resultante.getMagnitud(), 0, 0);
        jTableResultante.setValueAt(resultante.getAngulo(), 0, 1);
        jTableResultante.setValueAt(resultante.getX(), 0, 2);
        jTableResultante.setValueAt(resultante.getY(), 0, 3);
    }//GEN-LAST:event_jButResultanteActionPerformed

    private void jButEjemploActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButEjemploActionPerformed
        // TODO add your handling code here:
        jTableVectores.setValueAt(85, 0, 0);
        jTableVectores.setValueAt(20, 0, 1);
        jTableVectores.setValueAt(37.62, 1, 2);
        jTableVectores.setValueAt(103.36, 1, 3);
    }//GEN-LAST:event_jButEjemploActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameResultante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameResultante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameResultante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameResultante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameResultante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButAleatorios;
    private javax.swing.JButton jButEjemplo;
    private javax.swing.JButton jButResultante;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinVectores;
    private javax.swing.JTable jTableResultante;
    private javax.swing.JTable jTableVectores;
    // End of variables declaration//GEN-END:variables
}
