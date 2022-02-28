
package mypackage;

 import java.sql.*;
 import javax.swing.JOptionPane;
 import javax.swing.table.DefaultTableModel;

public class SearchBillForm extends javax.swing.JFrame {
       ResultSet rs;
       Statement stmt, stmt1;
       Connection con;
   
    public SearchBillForm() {
         initComponents();
                          
         try {
             
             con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzachef","root","root");
             stmt = con.createStatement();
                                        
             }            
         catch (Exception e) 
         {
            JOptionPane.showMessageDialog(null, e);
         }              
                
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtdate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDisplay = new javax.swing.JTable();
        txtBillNo = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Jokerman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Billno..");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 80, 20));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Jokerman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 80, 20));

        txtdate.setBackground(new java.awt.Color(0, 0, 0));
        txtdate.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 250, 30));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Jokerman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 70, 20));

        btnSearch.setBackground(new java.awt.Color(204, 0, 0));
        btnSearch.setFont(new java.awt.Font("Jokerman", 1, 18)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 110, -1));

        btnExit.setBackground(new java.awt.Color(204, 0, 0));
        btnExit.setFont(new java.awt.Font("Jokerman", 1, 18)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 650, 150, 40));

        tblDisplay.setBackground(new java.awt.Color(0, 0, 0));
        tblDisplay.setForeground(new java.awt.Color(255, 255, 255));
        tblDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEM NAME", "PRICE", "QUANTITY", "AMOUNT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDisplay);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, 200));

        txtBillNo.setBackground(new java.awt.Color(0, 0, 0));
        txtBillNo.setForeground(new java.awt.Color(255, 255, 255));
        txtBillNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBillNoMouseClicked(evt);
            }
        });
        txtBillNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBillNoActionPerformed(evt);
            }
        });
        getContentPane().add(txtBillNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 110, 30));

        txtName.setBackground(new java.awt.Color(0, 0, 0));
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 250, 30));

        jLabel2.setFont(new java.awt.Font("Algerian", 3, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Order History");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 450, -1));

        jLabel1.setBackground(new java.awt.Color(255, 153, 0));
        jLabel1.setFont(new java.awt.Font("Jokerman", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mypackage/searchbillform image.PNG"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBillNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBillNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBillNoActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
               
                
        try
        {
            int billno = Integer.parseInt(txtBillNo.getText());
            String q = "Select * from bill where billno = " + billno;
            rs = stmt.executeQuery(q);
            rs.first();
            txtName.setText(rs.getString("name"));
            txtdate.setText(rs.getString("billdate"));
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(q);
            String iName, qty, price, amount;
            DefaultTableModel model = (DefaultTableModel) tblDisplay.getModel();
            tblDisplay.setModel(model);
           while (rs.next())
            {
                iName = rs.getString("itemname");
                price = rs.getString("price");
                qty = rs.getString("quantity");
                amount = rs.getString("amount");
                model.addRow(new Object[] { iName, price, qty, amount });
               
            }
            
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
       
        ParentForm frmParentForm = new ParentForm();
        frmParentForm.setVisible(true); 
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtBillNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBillNoMouseClicked
        
         DefaultTableModel model = (DefaultTableModel) tblDisplay.getModel();
         model.setRowCount(0);
         txtName.setText("");
         txtdate.setText("");
         btnSearch.setEnabled(true);
    }//GEN-LAST:event_txtBillNoMouseClicked

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
       
        btnSearch.setEnabled(false);
    }//GEN-LAST:event_btnSearchMouseClicked

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
            java.util.logging.Logger.getLogger(SearchBillForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchBillForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchBillForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchBillForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchBillForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDisplay;
    private javax.swing.JTextField txtBillNo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtdate;
    // End of variables declaration//GEN-END:variables
}
