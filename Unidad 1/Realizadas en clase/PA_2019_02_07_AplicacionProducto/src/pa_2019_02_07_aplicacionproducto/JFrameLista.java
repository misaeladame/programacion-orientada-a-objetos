/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa_2019_02_07_aplicacionproducto;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aa507
 */
public class JFrameLista extends javax.swing.JFrame {

    /**
     * Creates new form JFrameLista
     */
    //constructor del frame
    public JFrameLista() {
        initComponents();
        jTableLista.setShowGrid(true);
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
        jTableLista = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jButAleatorios = new javax.swing.JButton();
        jButCalcular = new javax.swing.JButton();
        jButPorPrecio = new javax.swing.JButton();
        jButAlfabetico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jTableLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Costo $", "% Margen", "% Descuento", "% Impuesto", "Margen $", "Descuento $", "Impuesto", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableLista);
        if (jTableLista.getColumnModel().getColumnCount() > 0) {
            jTableLista.getColumnModel().getColumn(0).setPreferredWidth(150);
            jTableLista.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTableLista.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTableLista.getColumnModel().getColumn(3).setPreferredWidth(130);
            jTableLista.getColumnModel().getColumn(4).setPreferredWidth(120);
        }

        jLabel1.setText("Número de productos");

        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });

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

        jButPorPrecio.setText("Por Precio");
        jButPorPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButPorPrecioActionPerformed(evt);
            }
        });

        jButAlfabetico.setText("Alfabetico");
        jButAlfabetico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAlfabeticoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108)
                        .addComponent(jButAleatorios)
                        .addGap(38, 38, 38)
                        .addComponent(jButCalcular)
                        .addGap(40, 40, 40)
                        .addComponent(jButPorPrecio)
                        .addGap(39, 39, 39)
                        .addComponent(jButAlfabetico)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButAleatorios)
                    .addComponent(jButCalcular)
                    .addComponent(jButPorPrecio)
                    .addComponent(jButAlfabetico))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        // TODO add your handling code here:
        int renglones = Integer.parseInt(jSpinner1.getValue()+"");
        DefaultTableModel modelo = (DefaultTableModel)jTableLista.getModel();
        modelo.setRowCount(renglones);
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jButAleatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAleatoriosActionPerformed
        // TODO add your handling code here:
        Random azar = new Random();
        String [] prod = {"Laptop", "Mouse", "Memoria USB","Misa", "Proyector", "Conector", "Alexa", "Spinner","Tablet","Disco Duro","Impresora matriz","Impresora laser", "Impresora inyeccion"};
        double [] imp = {0,6,10,16,22,5,35,44};
        for (int r=0; r<jTableLista.getRowCount(); r++){
            jTableLista.setValueAt(prod[azar.nextInt(prod.length)], r, 0);//descripcion
            jTableLista.setValueAt(100+azar.nextInt(20000), r, 1);//costo
            jTableLista.setValueAt(+azar.nextInt(46), r, 2); //%margen
            jTableLista.setValueAt(azar.nextInt(31), r, 3);//%descuento
            jTableLista.setValueAt(imp[azar.nextInt(imp.length)], r, 4); //%impuesto
        }
    }//GEN-LAST:event_jButAleatoriosActionPerformed

    private void jButCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButCalcularActionPerformed
        // TODO add your handling code here:
        Producto x = new Producto();
        DecimalFormat d = new DecimalFormat("###,##0.00");
        
        for(int r=0; r<jTableLista.getRowCount(); r++){
            x.setCosto(Double.parseDouble(jTableLista.getValueAt(r, 1)+""));
            x.setMargenUtilidad(Double.parseDouble(jTableLista.getValueAt(r, 2)+""));
            x.setPorcDescuento(Double.parseDouble(jTableLista.getValueAt(r, 3)+""));
            x.setPorcImpuesto(Double.parseDouble(jTableLista.getValueAt(r, 4)+""));
            
            jTableLista.setValueAt(d.format(x.importeUtilidad()),r,5);
            jTableLista.setValueAt(d.format(x.importeDescuento()),r,6);
            jTableLista.setValueAt(d.format(x.importeImpuesto()),r,7);
            jTableLista.setValueAt(d.format(x.precio()), r, 8);//cuando pide objeto no es necesario hacer conversion (object, renglon, columna)
        }
    }//GEN-LAST:event_jButCalcularActionPerformed

    private void jButPorPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButPorPrecioActionPerformed
        // TODO add your handling code here:

        //Creamos un arreglo de referencias de objetos de la clase producto
        Producto [] lista = new Producto[jTableLista.getRowCount()];
        
        //Creamos los objetos del arreglo
        int r;
        for(r=0; r<lista.length; r++){
            lista[r] = new Producto(jTableLista.getValueAt(r, 0)+"",//descripcion
                                    Double.parseDouble(jTableLista.getValueAt(r, 1)+""),//costo
                                    Double.parseDouble(jTableLista.getValueAt(r, 2)+""),//%margen
                                    Double.parseDouble(jTableLista.getValueAt(r, 3)+""),//%descuento
                                    Double.parseDouble(jTableLista.getValueAt(r, 4)+""));//%impuesto
        }
        
        //Ordenamos el arreglo
        //Arrays.sort(lista); //no ordena un arreglo de objetos(de MOMENTO)
        
        for(int i=0; i<lista.length-1; i++)
            for(int j=i+1; j<lista.length; j++)
                if(lista[i].precio()>lista[j].precio()){
                    Producto aux = lista[i];
                    lista[i] = lista[j];
                    lista[j] = aux;
                }
        
        //Copiamos los datos de los objetos del arreglo al JFrameLista
        DecimalFormat d = new DecimalFormat("##,##0.00");
        
        for(r=0; r<lista.length; r++){
            jTableLista.setValueAt(lista[r].getDescripcion(), r, 0);
            jTableLista.setValueAt(lista[r].getCosto(), r, 1);
            jTableLista.setValueAt(lista[r].getMargenUtilidad(), r, 2);
            jTableLista.setValueAt(lista[r].getPorcDescuento(), r, 3);
            jTableLista.setValueAt(lista[r].getPorcImpuesto(), r, 4);
            jTableLista.setValueAt(d.format(lista[r].importeUtilidad()), r, 5);
            jTableLista.setValueAt(d.format(lista[r].importeDescuento()), r, 6);
            jTableLista.setValueAt(d.format(lista[r].importeImpuesto()), r, 7);
            jTableLista.setValueAt(d.format(lista[r].precio()), r, 8);
            
        }
        
    }//GEN-LAST:event_jButPorPrecioActionPerformed

    private void jButAlfabeticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAlfabeticoActionPerformed
        // TODO add your handling code here:
        
        //Creamos un arreglo de referencias de objetos de la clase producto
        Producto [] lista = new Producto[jTableLista.getRowCount()];
        
        //Creamos los objetos del arreglo
        int r;
        for(r=0; r<lista.length; r++){
            lista[r] = new Producto(jTableLista.getValueAt(r, 0)+"",//descripcion
                                    Double.parseDouble(jTableLista.getValueAt(r, 1)+""),//costo
                                    Double.parseDouble(jTableLista.getValueAt(r, 2)+""),//%margen
                                    Double.parseDouble(jTableLista.getValueAt(r, 3)+""),//%descuento
                                    Double.parseDouble(jTableLista.getValueAt(r, 4)+""));//%impuesto
        }
        
        //Ordenamos el arreglo
        //Arrays.sort(lista); //no ordena un arreglo de objetos(de MOMENTO)
        
        for(int i=0; i<lista.length-1; i++)
            for(int j=i+1; j<lista.length; j++)
                if(lista[i].getDescripcion().compareTo(lista[j].getDescripcion())>0){
                    Producto aux = lista[i];
                    lista[i] = lista[j];
                    lista[j] = aux;
                }
        
        //Copiamos los datos de los objetos del arreglo al JFrameLista
        DecimalFormat d = new DecimalFormat("##,##0.00");
        
        for(r=0; r<lista.length; r++){
            jTableLista.setValueAt(lista[r].getDescripcion(), r, 0);
            jTableLista.setValueAt(lista[r].getCosto(), r, 1);
            jTableLista.setValueAt(lista[r].getMargenUtilidad(), r, 2);
            jTableLista.setValueAt(lista[r].getPorcDescuento(), r, 3);
            jTableLista.setValueAt(lista[r].getPorcImpuesto(), r, 4);
            jTableLista.setValueAt(d.format(lista[r].importeUtilidad()), r, 5);
            jTableLista.setValueAt(d.format(lista[r].importeDescuento()), r, 6);
            jTableLista.setValueAt(d.format(lista[r].importeImpuesto()), r, 7);
            jTableLista.setValueAt(d.format(lista[r].precio()), r, 8);
            
        }
        
    }//GEN-LAST:event_jButAlfabeticoActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameLista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButAleatorios;
    private javax.swing.JButton jButAlfabetico;
    private javax.swing.JButton jButCalcular;
    private javax.swing.JButton jButPorPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTableLista;
    // End of variables declaration//GEN-END:variables
}
