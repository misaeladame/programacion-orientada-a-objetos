package pa_18131209_proyecto_04;

import java.awt.Component;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author José Misael Adame Sandoval 
 */
public class PA_18131209_Frame_04 extends javax.swing.JFrame {

    /**
     * Creates new form PA_18131209_Frame_04
     */
    
    // Se declara para poder obtener el modelo de la tabla y poder modificarlo
    DefaultTableModel modelo;
    Triangulo[] triangulos;
    JFileChooser jfch = new JFileChooser();
    
    public PA_18131209_Frame_04() {
        initComponents();
        
        // Se obtiene el modelo de la tabla
        modelo = (DefaultTableModel)jTableTriangulos.getModel();
        
        jTableTriangulos.setShowGrid(true);
     
        this.deshabilitar();
    }
    
    public void deshabilitar() 
    {
        jTableTriangulos.setEnabled(false);
        jButAleatorio.setEnabled(false);
        jButGrabar.setEnabled(false);
        jButMostrar.setEnabled(false);
        
        
    }
    
    public void habilitar() 
    {
        jTableTriangulos.setEnabled(true);
        jButAjustar.setEnabled(true);
        jTextNoTriangulos.setEnabled(true);
        jButAleatorio.setEnabled(true);
        jButGrabar.setEnabled(true);
        jButMostrar.setEnabled(true);
        
    }
    
    private void ajustar() 
    {
        jTableTriangulos.setEnabled(true);
        modelo.setRowCount(Integer.parseInt(jTextNoTriangulos.getText()));
        triangulos = new Triangulo[modelo.getRowCount()];
        for(int r = 0; r < modelo.getRowCount(); r++) 
        {
            jTableTriangulos.setValueAt(Romano.getNumeroEquivalente(r+1), r, 0);
            
        }
        jButAleatorio.setEnabled(true);
        jButGrabar.setEnabled(true);
        jButMostrar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButAjustar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanelDibujo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextNoTriangulos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTriangulos = new javax.swing.JTable();
        jButMostrar = new javax.swing.JButton();
        jButAleatorio = new javax.swing.JButton();
        jButGrabar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuNuevo = new javax.swing.JMenuItem();
        jMenuAbrir = new javax.swing.JMenuItem();
        jMenuGuardar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuIAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButAjustar.setText("Ajustar");
        jButAjustar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAjustarActionPerformed(evt);
            }
        });
        getContentPane().add(jButAjustar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 70, -1, -1));

        jLabel1.setText("No. De Triángulos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, -1, -1));

        javax.swing.GroupLayout jPanelDibujoLayout = new javax.swing.GroupLayout(jPanelDibujo);
        jPanelDibujo.setLayout(jPanelDibujoLayout);
        jPanelDibujoLayout.setHorizontalGroup(
            jPanelDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1321, Short.MAX_VALUE)
        );
        jPanelDibujoLayout.setVerticalGroup(
            jPanelDibujoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelDibujo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 1321, 320));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pa_18131209_proyecto_04/AsignacionProyecto.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, -1, -1));
        getContentPane().add(jTextNoTriangulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, 72, -1));

        jTableTriangulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador", "Base", "Altura", "X", "Y", "Color"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableTriangulos);
        if (jTableTriangulos.getColumnModel().getColumnCount() > 0) {
            jTableTriangulos.getColumnModel().getColumn(0).setResizable(false);
            jTableTriangulos.getColumnModel().getColumn(1).setResizable(false);
            jTableTriangulos.getColumnModel().getColumn(2).setResizable(false);
            jTableTriangulos.getColumnModel().getColumn(3).setResizable(false);
            jTableTriangulos.getColumnModel().getColumn(4).setResizable(false);
            jTableTriangulos.getColumnModel().getColumn(5).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 620, 94));

        jButMostrar.setText("Mostrar");
        jButMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 70, -1, -1));

        jButAleatorio.setText("Aleatorio");
        jButAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAleatorioActionPerformed(evt);
            }
        });
        getContentPane().add(jButAleatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, -1, -1));

        jButGrabar.setText("Grabar");
        jButGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButGrabarActionPerformed(evt);
            }
        });
        getContentPane().add(jButGrabar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 70, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pa_18131209_proyecto_04/Informacion.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, -1, -1));

        jMenu1.setText("Archivo");

        jMenuNuevo.setText("Nuevo");
        jMenuNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuNuevoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuNuevo);

        jMenuAbrir.setText("Abrir");
        jMenuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuAbrir);

        jMenuGuardar.setText("Guardar");
        jMenuGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGuardarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuGuardar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");

        jMenuIAcercaDe.setText("Acerca de...");
        jMenuIAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuIAcercaDeActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuIAcercaDe);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButAjustarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAjustarActionPerformed
        // TODO add your handling code here:
        this.repaint();
        jTableTriangulos.setEnabled(true);
        modelo.setRowCount(Integer.parseInt(jTextNoTriangulos.getText()));
        triangulos = new Triangulo[modelo.getRowCount()];
        for(int r = 0; r < modelo.getRowCount(); r++) 
        {
            jTableTriangulos.setValueAt(Romano.getNumeroEquivalente(r+1), r, 0);
            jTableTriangulos.setValueAt(null, r, 1); 
            jTableTriangulos.setValueAt(null, r, 2); 
            jTableTriangulos.setValueAt(null, r, 3); 
            jTableTriangulos.setValueAt(null, r, 4); 
            jTableTriangulos.setValueAt(null, r, 5);
        }
        jButAleatorio.setEnabled(true);
        jButGrabar.setEnabled(true);
        jButMostrar.setEnabled(false);
    }//GEN-LAST:event_jButAjustarActionPerformed

    private void jButMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButMostrarActionPerformed
        // TODO add your handling code here:
       
        Component componente = jPanelDibujo;
        for (int r = 0; r < modelo.getRowCount(); r++) 
            triangulos[r].dibujar(jTableTriangulos.getValueAt(r, 5)+"" ,componente);
            
        
    }//GEN-LAST:event_jButMostrarActionPerformed

    private void jButAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAleatorioActionPerformed
        // TODO add your handling code here:
        Random azar = new Random();
        
        for(int r=0; r<modelo.getRowCount(); r++)
        {
            jTableTriangulos.setValueAt(50+azar.nextInt(200), r, 1); 
            jTableTriangulos.setValueAt(50+azar.nextInt(200), r, 2); 
            jTableTriangulos.setValueAt(azar.nextInt(1000), r, 3); 
            jTableTriangulos.setValueAt(azar.nextInt(80), r, 4); 
            jTableTriangulos.setValueAt(Color.nextColor(), r, 5);
        }
        
        jButMostrar.setEnabled(false);
        
    }//GEN-LAST:event_jButAleatorioActionPerformed

    private void jButGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButGrabarActionPerformed
        // TODO add your handling code here:
        
        for(int i=0;i<modelo.getRowCount();i++)
        {
            triangulos[i]= new Triangulo((String)jTableTriangulos.getValueAt(i, 0),
                                         Integer.parseInt(jTableTriangulos.getValueAt(i, 1)+""),
                                         Integer.parseInt(jTableTriangulos.getValueAt(i, 2)+""),
                                         Integer.parseInt(jTableTriangulos.getValueAt(i, 3)+""),
                                         Integer.parseInt(jTableTriangulos.getValueAt(i, 4)+""));
        }                                       
        
        jButMostrar.setEnabled(true);
     
           
        
    }//GEN-LAST:event_jButGrabarActionPerformed

    private void jMenuGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGuardarActionPerformed
        // TODO add your handling code here:
        if (jfch.showSaveDialog(jLabel1) !=0) 
            return;
        
        FileOutputStream fos = null;
        DataOutputStream dos = null;
        
        try {
            fos = new FileOutputStream(jfch.getSelectedFile());
            dos = new DataOutputStream(fos);
            dos.writeUTF(jTextNoTriangulos.getText());//cantidad de Triangulos
            
            for (int r = 0; r < modelo.getRowCount(); r++) 
            {
                dos.writeUTF(modelo.getValueAt(r, 0)+""); 
                dos.writeInt(Integer.parseInt(modelo.getValueAt(r, 1)+"")); //base
                dos.writeInt(Integer.parseInt(modelo.getValueAt(r, 2)+""));
                dos.writeInt(Integer.parseInt(modelo.getValueAt(r, 3)+""));
                dos.writeInt(Integer.parseInt(modelo.getValueAt(r, 4)+""));
                dos.writeUTF(modelo.getValueAt(r, 5)+"");
            }   
            
        } catch (Exception e) {
        }
        finally{
            if (dos != null) {
                try {
                    dos.close();
                    if (fos != null) {
                        fos.close();
                    }
                } catch (IOException e) {
                    
                }
            }
        }
    }//GEN-LAST:event_jMenuGuardarActionPerformed

    private void jMenuNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuNuevoActionPerformed
        // TODO add your handling code here:
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Alerta!", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION)
        {
            this.repaint();
            this.habilitar();
            modelo.setRowCount(0);
            jTextNoTriangulos.setText(null);
            this.deshabilitar();
        }
    }//GEN-LAST:event_jMenuNuevoActionPerformed

    private void jMenuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAbrirActionPerformed
        // TODO add your handling code here:
        
        this.repaint();
        
        if (jfch.showOpenDialog(jLabel1) != 0) 
        {
            return;
        }
       
        
        
        FileInputStream fis = null;
        DataInputStream dis = null;
        
        
        try 
        {   
            
            fis = new FileInputStream(jfch.getSelectedFile());
            dis = new DataInputStream(fis);
            
            jTextNoTriangulos.setText(dis.readUTF());
            this.ajustar();
            
           
            
            for (int r = 0; r < modelo.getRowCount(); r++) 
            {
                modelo.setValueAt(dis.readUTF(), r, 0);
                modelo.setValueAt(dis.readInt(), r, 1);
                modelo.setValueAt(dis.readInt(), r, 2);
                modelo.setValueAt(dis.readInt(), r, 3);
                modelo.setValueAt(dis.readInt(), r, 4);
                modelo.setValueAt(dis.readUTF(), r, 5);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException ex) {
                    Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(dis != null)
                
                try {
                    dis.close();
                    
            } catch (IOException ex) {
                Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         
        this.jButGrabarActionPerformed(evt);
        this.jButMostrarActionPerformed(evt);
    }//GEN-LAST:event_jMenuAbrirActionPerformed

    private void jMenuIAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuIAcercaDeActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Copyright © Todos los Derechos Reservados\n Para enviar una queja o soporte mandarla al correo: misael_adame@protonmail.com", "Acerca de...",  JOptionPane.INFORMATION_MESSAGE );
    }//GEN-LAST:event_jMenuIAcercaDeActionPerformed

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
            java.util.logging.Logger.getLogger(PA_18131209_Frame_04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PA_18131209_Frame_04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PA_18131209_Frame_04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PA_18131209_Frame_04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PA_18131209_Frame_04().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButAjustar;
    private javax.swing.JButton jButAleatorio;
    private javax.swing.JButton jButGrabar;
    private javax.swing.JButton jButMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuAbrir;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuGuardar;
    private javax.swing.JMenuItem jMenuIAcercaDe;
    private javax.swing.JMenuItem jMenuNuevo;
    private javax.swing.JPanel jPanelDibujo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTriangulos;
    private javax.swing.JTextField jTextNoTriangulos;
    // End of variables declaration//GEN-END:variables
}
