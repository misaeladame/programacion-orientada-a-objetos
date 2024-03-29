/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_03_14_aplicacionhorario;

import Utilerias.JTable.ColorCeldas;
import java.awt.Color;
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.table.DefaultTableModel;

      

/**
 *
 * @author terry
 */
public class JFrameTarjetaAsistencia extends javax.swing.JFrame {

    /**
     * Creates new form JFrameTarjetaAsistencia
     */
    
    DefaultTableModel modelo;
    
    public JFrameTarjetaAsistencia() {
        initComponents();
        
        modelo = (DefaultTableModel)jTableEmpleados.getModel();
        jTableEmpleados.setShowGrid(true);
        
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
        jTableEmpleados = new javax.swing.JTable();
        jSpinEmpleados = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jButAleatorio = new javax.swing.JButton();
        jButCalcular = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabTotal = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButArregloEncapsulado = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButArregloParalelo = new javax.swing.JButton();
        jButColor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Empleado", "Horas", "Minutos", "Segundos", "Horas", "Minutos", "Segundos", "Tiempo trabajado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableEmpleados);
        if (jTableEmpleados.getColumnModel().getColumnCount() > 0) {
            jTableEmpleados.getColumnModel().getColumn(0).setResizable(false);
            jTableEmpleados.getColumnModel().getColumn(0).setPreferredWidth(250);
            jTableEmpleados.getColumnModel().getColumn(1).setResizable(false);
            jTableEmpleados.getColumnModel().getColumn(2).setResizable(false);
            jTableEmpleados.getColumnModel().getColumn(3).setResizable(false);
            jTableEmpleados.getColumnModel().getColumn(4).setResizable(false);
            jTableEmpleados.getColumnModel().getColumn(5).setResizable(false);
            jTableEmpleados.getColumnModel().getColumn(6).setResizable(false);
            jTableEmpleados.getColumnModel().getColumn(7).setResizable(false);
            jTableEmpleados.getColumnModel().getColumn(7).setPreferredWidth(250);
        }

        jSpinEmpleados.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinEmpleadosStateChanged(evt);
            }
        });

        jLabel1.setText("Empleados");

        jButAleatorio.setText("Aleatorio");
        jButAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAleatorioActionPerformed(evt);
            }
        });

        jButCalcular.setText("Calcular");
        jButCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButCalcularActionPerformed(evt);
            }
        });

        jLabel2.setText("Total:");

        jLabTotal.setBackground(new java.awt.Color(255, 255, 51));
        jLabTotal.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabTotal.setOpaque(true);

        jButton1.setText("Arreglo en el Frame");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButArregloEncapsulado.setText("Arreglo encapsulado");
        jButArregloEncapsulado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButArregloEncapsuladoActionPerformed(evt);
            }
        });

        jLabel3.setText("E N T R A D A");

        jLabel4.setText("S A L I D A");

        jButArregloParalelo.setText("Arreglo paralelo");
        jButArregloParalelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButArregloParaleloActionPerformed(evt);
            }
        });

        jButColor.setText("Color");
        jButColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButColorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSpinEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(jButAleatorio)
                        .addGap(29, 29, 29)
                        .addComponent(jButCalcular)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(36, 36, 36)
                                .addComponent(jButColor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButArregloParalelo)
                                    .addComponent(jButArregloEncapsulado))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButAleatorio)
                        .addComponent(jButCalcular))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jSpinEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jButton1)
                        .addComponent(jButColor))
                    .addComponent(jLabTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButArregloEncapsulado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButArregloParalelo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSpinEmpleadosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinEmpleadosStateChanged
        // TODO add your handling code here:
        modelo.setRowCount((int)jSpinEmpleados.getValue());
    }//GEN-LAST:event_jSpinEmpleadosStateChanged

    private void jButAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAleatorioActionPerformed
        // TODO add your handling code here:
        Random azar = new Random();
        
        for(int r=0; r<modelo.getRowCount(); r++) 
        {
            jTableEmpleados.setValueAt(Nombre.nextNombreCompleto(), r, 0);
            
            // hora de entrada
            jTableEmpleados.setValueAt(7+azar.nextInt(3), r, 1); // horas
            jTableEmpleados.setValueAt(azar.nextInt(60), r, 2); // minutos
            jTableEmpleados.setValueAt(azar.nextInt(60), r, 3); // segundos
            
            // hora de salida
            jTableEmpleados.setValueAt(15+azar.nextInt(4), r, 4); // horas
            jTableEmpleados.setValueAt(azar.nextInt(60), r, 5); // minutos
            jTableEmpleados.setValueAt(azar.nextInt(60), r, 6); // segundos
            
            
        }
    }//GEN-LAST:event_jButAleatorioActionPerformed

    private void jButCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButCalcularActionPerformed
        // TODO add your handling code here:
        
        Horario entrada = new Horario(), salida = new Horario();
        Horario totalTiempo = new Horario();
        
        for(int r=0; r<modelo.getRowCount(); r++) 
        {
            entrada.setHoras(Integer.parseInt(jTableEmpleados.getValueAt(r, 1)+""));
            entrada.setMinutos(Integer.parseInt(jTableEmpleados.getValueAt(r, 2)+""));
            entrada.setSegundos(Integer.parseInt(jTableEmpleados.getValueAt(r, 3)+""));
            
            salida.setHoras(Integer.parseInt(jTableEmpleados.getValueAt(r, 4)+""));
            salida.setMinutos(Integer.parseInt(jTableEmpleados.getValueAt(r, 5)+""));
            salida.setSegundos(Integer.parseInt(jTableEmpleados.getValueAt(r, 6)+""));
            
            Empleado x = new Empleado(modelo.getValueAt(r, 0)+"", entrada, salida);
            
            jTableEmpleados.setValueAt(x.tiempoTrabajado(), r, 7);
            
            totalTiempo = totalTiempo.suma(x.tiempoTrabajado());
        
        }
        
        jLabTotal.setText(totalTiempo.toString()); 
        
    }//GEN-LAST:event_jButCalcularActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Empleado [] asistencia = new Empleado[modelo.getRowCount()];
        
        Horario ent = new Horario();
        Horario sal = new Horario();
        
        for(int r= 0; r<asistencia.length; r++) 
        {
            ent.setHoras(Integer.parseInt(modelo.getValueAt(r, 1)+""));
            ent.setMinutos(Integer.parseInt(modelo.getValueAt(r, 2)+""));
            ent.setSegundos(Integer.parseInt(modelo.getValueAt(r, 3)+""));
            
            sal.setHoras(Integer.parseInt(modelo.getValueAt(r, 4)+""));
            sal.setMinutos(Integer.parseInt(modelo.getValueAt(r, 5)+""));
            sal.setSegundos(Integer.parseInt(modelo.getValueAt(r, 6)+""));
            
            asistencia[r] = new Empleado(modelo.getValueAt(r, 0)+"", ent, sal);
            
        }
        
        // ordenamiento
        for(int i=0; i<asistencia.length-1; i++)
            for(int j=i+1; j<asistencia.length; j++)
                if(asistencia[i].tiempoTrabajado().segundosTotales() > 
                   asistencia[j].tiempoTrabajado().segundosTotales())
                {
                    Empleado aux = asistencia[i];
                    asistencia[i] = asistencia[j];
                    asistencia[j] = aux;
                }
        
        // mostramos el arreglo ya ordenado en el JTable 
        for(int r=0; r<modelo.getRowCount(); r++) 
        {
            modelo.setValueAt(asistencia[r].getNombre(), r, 0);
            
            modelo.setValueAt(asistencia[r].getEntrada().getHoras(), r, 1);
            modelo.setValueAt(asistencia[r].getEntrada().getMinutos(), r, 2);
            modelo.setValueAt(asistencia[r].getEntrada().getSegundos(), r, 3);
            
            modelo.setValueAt(asistencia[r].getSalida().getHoras(), r, 4);
            modelo.setValueAt(asistencia[r].getSalida().getMinutos(), r, 5);
            modelo.setValueAt(asistencia[r].getSalida().getSegundos(), r, 6);
            
            modelo.setValueAt(asistencia[r].tiempoTrabajado(), r, 7);
           
            
        }
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButArregloEncapsuladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButArregloEncapsuladoActionPerformed
        // TODO add your handling code here:
        DecimalFormat d = new DecimalFormat("#0.0000");
        Empresa soriana = new Empresa(modelo.getRowCount());
        
        for(int r=0; r<modelo.getRowCount(); r++) 
        {
            Horario ent = new Horario((int)modelo.getValueAt(r, 1),
                                     (int)modelo.getValueAt(r, 2),
                                     (int)modelo.getValueAt(r, 3));
           
            
            Horario sal = new Horario((int)modelo.getValueAt(r, 4),
                                     (int)modelo.getValueAt(r, 5),
                                     (int)modelo.getValueAt(r, 6));         
                                     
            Empleado x = new Empleado(modelo.getValueAt(r, 0)+"", ent, sal);
            
            soriana.setEmpleado(x, r);
                                     
        }
        
        soriana.ordenar();
        
        for(int r=0; r<modelo.getRowCount(); r++) 
        {
            modelo.setValueAt(soriana.getEmpleado(r).getNombre(), r, 0);
            
            modelo.setValueAt(soriana.getEmpleado(r).getEntrada().getHoras(), r, 1);
            modelo.setValueAt(soriana.getEmpleado(r).getEntrada().getMinutos(), r, 2);
            modelo.setValueAt(soriana.getEmpleado(r).getEntrada().getSegundos(), r, 3);
            
            modelo.setValueAt(soriana.getEmpleado(r).getSalida().getHoras(), r, 4);
            modelo.setValueAt(soriana.getEmpleado(r).getSalida().getMinutos(), r, 5);
            modelo.setValueAt(soriana.getEmpleado(r).getSalida().getSegundos(), r, 6);
            
            modelo.setValueAt(soriana.getEmpleado(r).tiempoTrabajado(), r, 7);
        }
    }//GEN-LAST:event_jButArregloEncapsuladoActionPerformed

    private void jButArregloParaleloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButArregloParaleloActionPerformed
        // TODO add your handling code here:
        String [] nombres = new String[modelo.getRowCount()];
        Horario [] entradas = new Horario[nombres.length];
        Horario [] salidas = new Horario[nombres.length];
        Horario [] tiempos = new Horario[nombres.length];
        
        for(int r=0; r<modelo.getRowCount(); r++) 
        {
            Horario ent = new Horario((int)modelo.getValueAt(r, 1),
                                     (int)modelo.getValueAt(r, 2),
                                     (int)modelo.getValueAt(r, 3));
           
            
            Horario sal = new Horario((int)modelo.getValueAt(r, 4),
                                     (int)modelo.getValueAt(r, 5),
                                     (int)modelo.getValueAt(r, 6));      
            
            nombres[r] = modelo.getValueAt(r, 0)+"";
            entradas[r] = ent;
            salidas[r] = sal;
            tiempos[r] = sal.resta(ent);
                                     
        }
        
        for(int i=0; i<tiempos.length-1; i++)
            for(int j=i+1; j<tiempos.length; j++)
                if(tiempos[i].segundosTotales() > tiempos[j].segundosTotales()) 
                {
                    Horario aux = tiempos[i];
                    tiempos[i] = tiempos[j];
                    tiempos[j] = aux;
                    
                    aux = entradas[i];
                    entradas[i] = entradas[j];
                    entradas[j] = aux;
                    
                    aux = salidas[i];
                    salidas[i] = salidas[j];
                    salidas[j] = aux;
                    
                    String auxn = nombres[i];
                    nombres[i] = nombres[j];
                    nombres[j] = auxn;
                }
        
        for(int r=0; r<modelo.getRowCount(); r++) 
        {
            modelo.setValueAt(nombres[r], r, 0);
            
            modelo.setValueAt(entradas[r].getHoras(), r, 1);
            modelo.setValueAt(entradas[r].getMinutos(), r, 2);
            modelo.setValueAt(entradas[r].getSegundos(), r, 3);
            
            modelo.setValueAt(salidas[r].getHoras(), r, 4);
            modelo.setValueAt(salidas[r].getMinutos(), r, 5);
            modelo.setValueAt(salidas[r].getSegundos(), r, 6);
            
            modelo.setValueAt(tiempos[r], r, 7);
        }
        
        
    }//GEN-LAST:event_jButArregloParaleloActionPerformed

    private void jButColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButColorActionPerformed
        // TODO add your handling code here:
        ColorCeldas celdas = new ColorCeldas(jTableEmpleados);
        
        celdas.addCelda(0, 0, Color.yellow);
        celdas.addCelda(modelo.getRowCount()-1, modelo.getColumnCount()-1, Color.pink);
        
        celdas.repaint();
    }//GEN-LAST:event_jButColorActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameTarjetaAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameTarjetaAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameTarjetaAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameTarjetaAsistencia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameTarjetaAsistencia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButAleatorio;
    private javax.swing.JButton jButArregloEncapsulado;
    private javax.swing.JButton jButArregloParalelo;
    private javax.swing.JButton jButCalcular;
    private javax.swing.JButton jButColor;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinEmpleados;
    private javax.swing.JTable jTableEmpleados;
    // End of variables declaration//GEN-END:variables
}
