/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeinterface;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import static javax.xml.bind.DatatypeConverter.parseString;



/**
 *
 * @author uilian
 */
public class CadastroProduto extends javax.swing.JInternalFrame {
    String codigo,nome,tipo,marca;
    int codigoint=0;
    private ArrayList lista= new ArrayList();

     /**
     * Creates new form CadastroProduto
     */
    public CadastroProduto() {
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

        jtcodigo = new javax.swing.JTextField();
        jtnome = new javax.swing.JTextField();
        jtmarca = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbnovo = new javax.swing.JButton();
        jbsalvar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro Produtos");
        setToolTipText("");
        getContentPane().setLayout(null);

        jtcodigo.setEnabled(false);
        jtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtcodigoActionPerformed(evt);
            }
        });
        getContentPane().add(jtcodigo);
        jtcodigo.setBounds(65, 28, 74, 20);

        jtnome.setEnabled(false);
        jtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtnomeActionPerformed(evt);
            }
        });
        getContentPane().add(jtnome);
        jtnome.setBounds(27, 81, 81, 20);

        jtmarca.setEnabled(false);
        getContentPane().add(jtmarca);
        jtmarca.setBounds(126, 81, 74, 20);

        jTextField5.setEnabled(false);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(218, 89, 87, 20);

        jLabel1.setText("codigo:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(26, 31, 35, 14);

        jLabel2.setText("categoria ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(157, 31, 48, 14);

        jLabel3.setText("nome:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(27, 66, 30, 14);

        jLabel4.setText("marca:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(126, 66, 33, 14);

        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(218, 69, 34, 14);

        jbnovo.setText("Novo");
        jbnovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnovoActionPerformed(evt);
            }
        });
        getContentPane().add(jbnovo);
        jbnovo.setBounds(27, 127, 105, 51);

        jbsalvar.setText("Salvar");
        jbsalvar.setEnabled(false);
        jbsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jbsalvar);
        jbsalvar.setBounds(150, 127, 110, 51);

        jButton3.setText("jButton3");
        jButton3.setEnabled(false);
        getContentPane().add(jButton3);
        jButton3.setBounds(27, 196, 105, 42);

        jButton4.setText("jButton4");
        getContentPane().add(jButton4);
        jButton4.setBounds(150, 196, 110, 42);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "bebidas ", "biscoitos", "higiene ", "limpeza", "frios", " ", " " }));
        jComboBox1.setEnabled(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(209, 28, 66, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtnomeActionPerformed

    private void jbnovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnovoActionPerformed
codigoint=codigoint+1;
jtnome.setEnabled(true);
jtmarca.setEnabled(true);
jbsalvar.setEnabled(true);
 jComboBox1.setEnabled(true);
 jtcodigo.setText(String.valueOf(codigoint));
        // TODO add your handling code here:
    }//GEN-LAST:event_jbnovoActionPerformed

    private void jtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtcodigoActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jtcodigoActionPerformed

    private void jbsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalvarActionPerformed
        // TODO add your handling code her
      ArrayList lista= new ArrayList();
      {
      
       
        lista.add(jtcodigo.getText());
        lista.add(jtnome.getText());
        String categoria=(String) jComboBox1.getSelectedItem();
        lista.add(categoria);
        lista.add(jtmarca.getText());
       System.out.println("codigo do produto: "+codigo);
        System.out.println(lista);
       }
       jtnome.setEnabled(false);
jtmarca.setEnabled(false);
jbsalvar.setEnabled(false);
 jComboBox1.setEnabled(false);
 jtnome.setText(null);
 jtmarca.setText(null);
 jtcodigo.setText(null);
 
 
       
    }//GEN-LAST:event_jbsalvarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JButton jbnovo;
    private javax.swing.JButton jbsalvar;
    private javax.swing.JTextField jtcodigo;
    private javax.swing.JTextField jtmarca;
    private javax.swing.JTextField jtnome;
    // End of variables declaration//GEN-END:variables
}
