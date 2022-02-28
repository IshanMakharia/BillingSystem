
package mypackage;

public class ParentForm extends javax.swing.JFrame {

   
    public ParentForm() {
        initComponents();
        
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnExit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnMenucard = new javax.swing.JButton();
        btnOrderHistory = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuiteminfo = new javax.swing.JMenuItem();
        mnubillform = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        SearchBillForm = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(521, 453));
        getContentPane().setLayout(null);

        btnExit.setFont(new java.awt.Font("Jokerman", 1, 18)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(1010, 480, 100, 30);

        jLabel3.setFont(new java.awt.Font("Algerian", 3, 50)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("WELCOME TO PIZZACHEF");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(400, 30, 650, 60);

        btnMenucard.setFont(new java.awt.Font("Jokerman", 1, 18)); // NOI18N
        btnMenucard.setText("MENU CARD");
        btnMenucard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenucardActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenucard);
        btnMenucard.setBounds(990, 530, 160, 40);

        btnOrderHistory.setFont(new java.awt.Font("Jokerman", 1, 18)); // NOI18N
        btnOrderHistory.setText("ORDER HISTORY");
        btnOrderHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderHistoryActionPerformed(evt);
            }
        });
        getContentPane().add(btnOrderHistory);
        btnOrderHistory.setBounds(970, 580, 191, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mypackage/parentform image.PNG"))); // NOI18N
        jLabel1.setText(" ");
        jLabel1.setName(""); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1576, 897));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1940, 680);

        jMenu1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu1.setText("Forms");

        mnuiteminfo.setFont(new java.awt.Font("Jokerman", 1, 18)); // NOI18N
        mnuiteminfo.setText("Menu Card");
        mnuiteminfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuiteminfoActionPerformed(evt);
            }
        });
        jMenu1.add(mnuiteminfo);

        mnubillform.setFont(new java.awt.Font("Jokerman", 1, 18)); // NOI18N
        mnubillform.setText("Bill Form");
        mnubillform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnubillformActionPerformed(evt);
            }
        });
        jMenu1.add(mnubillform);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenu2.setText("Reports");

        SearchBillForm.setFont(new java.awt.Font("Jokerman", 1, 18)); // NOI18N
        SearchBillForm.setText("Order History");
        SearchBillForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBillFormActionPerformed(evt);
            }
        });
        jMenu2.add(SearchBillForm);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuiteminfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuiteminfoActionPerformed
            
        ItemInfoForm frmItemInfoForm = new ItemInfoForm();
        frmItemInfoForm.setVisible(true);
    }//GEN-LAST:event_mnuiteminfoActionPerformed

    private void mnubillformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnubillformActionPerformed
        
        BillForm frmbillform = new BillForm();
        frmbillform.setVisible(true);
        
        
    }//GEN-LAST:event_mnubillformActionPerformed

    private void SearchBillFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBillFormActionPerformed
        
        SearchBillForm frmsearchbillform = new SearchBillForm();
        frmsearchbillform.setVisible(true);
    }//GEN-LAST:event_SearchBillFormActionPerformed

    private void btnMenucardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenucardActionPerformed
       
        ItemInfoForm frmiteminfoform = new ItemInfoForm();
                frmiteminfoform.setVisible(true); 
    }//GEN-LAST:event_btnMenucardActionPerformed

    private void btnOrderHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderHistoryActionPerformed
        
        SearchBillForm frmSearchBillForm  = new SearchBillForm();
        frmSearchBillForm.setVisible(true); 
    }//GEN-LAST:event_btnOrderHistoryActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(ParentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem SearchBillForm;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMenucard;
    private javax.swing.JButton btnOrderHistory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnubillform;
    private javax.swing.JMenuItem mnuiteminfo;
    // End of variables declaration//GEN-END:variables
}
