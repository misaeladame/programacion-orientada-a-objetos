/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_03_27_aplicacionnominaempleados;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author alope
 */
public class JFrameMenu extends javax.swing.JFrame {

    /**
     * Creates new form JFrameMenu
     */
    
    private Empleado [] nomina;
    private int empleadosRegistrados;
    private File archivo = new File("datos.txt");
    
    public JFrameMenu() {
        initComponents();
        
        if(archivo.exists())
        {
            FileReader fr = null;
            BufferedReader br = null;
            
            try {
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);
                
                empleadosRegistrados = Integer.parseInt(br.readLine());
                
                nomina = new Empleado[empleadosRegistrados+10];
                
                String emp = br.readLine();
                int e = 0;
                
                while(emp != null)
                {
                    switch(emp)
                    {
                        case "E":
                            nomina[e] = new Empleado(Integer.parseInt(br.readLine()),
                                                     br.readLine());
                            break;

                        case "T":
                            nomina[e] = new Taller(Integer.parseInt(br.readLine()),
                                                   br.readLine(),
                                                   Integer.parseInt(br.readLine()),
                                                   Double.parseDouble(br.readLine()));
                            break;

                        case "A":
                            nomina[e] = new Administrativo(Integer.parseInt(br.readLine()),
                                                   br.readLine(),
                                                   Integer.parseInt(br.readLine()),
                                                   Double.parseDouble(br.readLine()));
                            break;

                        case "EJ":
                            nomina[e] = new Ejecutivo(Integer.parseInt(br.readLine()),
                                                   br.readLine(),
                                                   Integer.parseInt(br.readLine()),
                                                   Double.parseDouble(br.readLine()),
                                                   Double.parseDouble(br.readLine()));
                            break;

                        case "V":
                            nomina[e] = new Ventas(Integer.parseInt(br.readLine()),
                                                   br.readLine(),
                                                   Double.parseDouble(br.readLine()),
                                                   Double.parseDouble(br.readLine()));
                            break;
                    }
                    
                    e++;
                    emp = br.readLine();
                }
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(JFrameMenu.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(JFrameMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
            finally
            {
                try {
                    if(br != null)
                        br.close();
                    if (fr != null)
                        fr.close();
                } catch (IOException ex) {
                    Logger.getLogger(JFrameMenu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else
        {
            empleadosRegistrados = 0;
            nomina = new Empleado[10];
        }
    
        jLabEmpReg.setText(empleadosRegistrados+"");
    }
    
    public int getTamaño()
    {
        return nomina.length;
    }
    
    public void ampliarArreglo()
    {
        if((double)empleadosRegistrados / nomina.length >= .95)
        {
            Empleado [] copia = new Empleado[(int)(nomina.length * 1.1)];
            
            for(int i=0; i<empleadosRegistrados; i++)
                copia[i] = nomina[i];
            
            nomina = copia;
        }
    }
            
    public File getArchivo()
    {
        return archivo;
    }
    
    public int getEmpleadosRegistrados()
    {
        return empleadosRegistrados;
    }

    public Empleado getEmpleado(int posicion)
    {
        if (posicion >=0 && posicion <nomina.length)
            return nomina[posicion];
        else
            return new Empleado();
    }
    
    public void setEmpleado(Empleado emp, int posicion)
    {
        if (posicion >=0 && posicion <nomina.length)
            nomina[posicion] = emp;
    }
    
    public boolean agregarEmpleado(Empleado emp)
    {
        if (empleadosRegistrados == nomina.length)
            return false;
        
        nomina[empleadosRegistrados] = emp;
        empleadosRegistrados++;
        jLabEmpReg.setText(empleadosRegistrados+"");

        return true;
    }
    
    public JFrameMenu getMenu()
    {
        return this;
    }
    
    public JLabel getEtiqueta()
    {
        return jLabEmpReg;
    }
    
    public JButton[]  getBotones()
    {
        JButton [] bot = new JButton[4];
        
        bot[0] = jButRegistro;
        bot[1] = jButReporte;
        bot[2] = jButConsulta;
        bot[3] = jButSalida;
        
        return bot;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButConsulta = new javax.swing.JButton();
        jButReporte = new javax.swing.JButton();
        jButSalida = new javax.swing.JButton();
        jButRegistro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabEmpReg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jButConsulta.setBackground(new java.awt.Color(51, 255, 0));
        jButConsulta.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButConsulta.setText("Consulta");
        jButConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButConsultaActionPerformed(evt);
            }
        });

        jButReporte.setBackground(new java.awt.Color(0, 204, 255));
        jButReporte.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButReporte.setText("Reporte");
        jButReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButReporteActionPerformed(evt);
            }
        });

        jButSalida.setBackground(new java.awt.Color(255, 153, 255));
        jButSalida.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButSalida.setText("Salida");
        jButSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButSalidaActionPerformed(evt);
            }
        });

        jButRegistro.setBackground(new java.awt.Color(255, 255, 102));
        jButRegistro.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jButRegistro.setText("Registro");
        jButRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButRegistroActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Empleados registrados");

        jLabEmpReg.setBackground(new java.awt.Color(255, 255, 0));
        jLabEmpReg.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabEmpReg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabEmpReg.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jButSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(78, 78, 78))
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabEmpReg, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabEmpReg, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButRegistroActionPerformed
        // TODO add your handling code here:
            JFrameRegistro jfReg = new JFrameRegistro(this);
            jfReg.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_jButRegistroActionPerformed

    private void jButReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButReporteActionPerformed
        // TODO add your handling code here:
            JFrameReporte jfRep = new JFrameReporte(this);
            jfRep.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_jButReporteActionPerformed

    private void jButSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButSalidaActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButSalidaActionPerformed

    private void jButConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButConsultaActionPerformed
        // TODO add your handling code here:
            JFrameConsulta jfCon = new JFrameConsulta(this);
            jfCon.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_jButConsultaActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButConsulta;
    private javax.swing.JButton jButRegistro;
    private javax.swing.JButton jButReporte;
    private javax.swing.JButton jButSalida;
    private javax.swing.JLabel jLabEmpReg;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
