/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeinterface;

/**
 *
 * @author uilian
 */
public class Telamestre extends javax.swing.JFrame {

    /**
     * Creates new form Telamestre
     */
    public Telamestre() {
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        cadastroproduto = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmvendas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/testeinterface/walmart.jpg"))); // NOI18N
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(290, 30, 260, 200);

        jMenu1.setText("Cadastrar");

        jMenuItem1.setText("Cadastro Cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        cadastroproduto.setText("Cadastro Produto");
        cadastroproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroprodutoActionPerformed(evt);
            }
        });
        jMenu1.add(cadastroproduto);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("caixa");

        jmvendas.setText("vendas");
        jmvendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmvendasActionPerformed(evt);
            }
        });
        jMenu2.add(jmvendas);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 928, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
      CadastroClientes obj=new CadastroClientes();
      jDesktopPane1.add(obj);
      obj.setVisible(true);
      
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void cadastroprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroprodutoActionPerformed
        // TODO add your handling code here:
        CadastroProduto produto= new CadastroProduto();
        jDesktopPane1.add(produto);
        produto.setVisible(true);
        
    }//GEN-LAST:event_cadastroprodutoActionPerformed

    private void jmvendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmvendasActionPerformed
        
        Caixa vendas=new Caixa();        
        jDesktopPane1.add(vendas);
        vendas.setVisible(true);
    }//GEN-LAST:event_jmvendasActionPerformed

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
            java.util.logging.Logger.getLogger(Telamestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Telamestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Telamestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Telamestre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Telamestre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadastroproduto;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jmvendas;
    // End of variables declaration//GEN-END:variables
}
