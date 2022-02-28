

package mypackage;



    import java.sql.*;
    import javax.swing.JOptionPane;
    //import javax.swing.event.TableModelEvent;
    //import javax.swing.table.DefaultTableModel;
    import javax.swing.table.TableModel;
    
public class BillForm extends javax.swing.JFrame {
 
    ResultSet rs;
    Statement stmt, stmt1;
    Connection con;
           
    int grandTotal = 0;
    private TableModel model2;


    public BillForm() {
        initComponents();
       
         try {
             
             con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzachef","root","root");
             stmt = con.createStatement();
             stmt1 = con.createStatement();

             String ak = "select curdate()";
             rs = stmt.executeQuery(ak);
             rs.first();
             txtDate.setText(rs.getString("curdate()"));
             
             String s = "select * from iteminfo";
             rs = stmt.executeQuery(s);
             int bno = getLatestBillNo();
             txtBillno.setText("" + bno);
                        
             }            
         catch (Exception e) 
            {
                    JOptionPane.showMessageDialog(null, e);
            }
         }
        private int getLatestBillNo()
         {
        int bno = 0;
        
        try {
       
            Statement stmt = con.createStatement();
            ResultSet rs;
            String q = "select max(billno) from bill";
            rs = stmt.executeQuery(q);
            String testBno = "";
            rs.first();
            testBno = rs.getString("max(billno)");

            if(testBno!=null)
            {
                bno = Integer.parseInt(rs.getString("max(billno)"));
                bno++;
            }
            else
            {
                bno++;
            }
             
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return bno;
      
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        txtGrandtotal = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();
        btnCalculate = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblbill = new javax.swing.JTable();
        txtDate = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtBillno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Jokerman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 0));
        jLabel6.setText("Grand Total");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 130, 20));

        txtGrandtotal.setBackground(new java.awt.Color(102, 0, 0));
        txtGrandtotal.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtGrandtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, 120, 30));

        btnRefresh.setBackground(new java.awt.Color(102, 0, 0));
        btnRefresh.setFont(new java.awt.Font("Jokerman", 1, 18)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        getContentPane().add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 280, 160, -1));

        btnCalculate.setBackground(new java.awt.Color(102, 0, 0));
        btnCalculate.setFont(new java.awt.Font("Jokerman", 1, 18)); // NOI18N
        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalculate, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 200, 160, -1));

        btnExit.setBackground(new java.awt.Color(102, 0, 0));
        btnExit.setFont(new java.awt.Font("Jokerman", 1, 18)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 440, 150, 40));

        btnSave.setBackground(new java.awt.Color(102, 0, 0));
        btnSave.setFont(new java.awt.Font("Jokerman", 1, 18)); // NOI18N
        btnSave.setText("Paid");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 360, 160, 40));

        tblbill.setBackground(new java.awt.Color(102, 0, 0));
        tblbill.setForeground(new java.awt.Color(255, 255, 255));
        tblbill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Price", "Quantity", "Amount"
            }
        ));
        jScrollPane1.setViewportView(tblbill);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 430, 130));

        txtDate.setBackground(new java.awt.Color(102, 0, 0));
        txtDate.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 140, 30));

        txtName.setBackground(new java.awt.Color(102, 0, 0));
        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNameMouseClicked(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 250, 30));

        txtBillno.setBackground(new java.awt.Color(102, 0, 0));
        txtBillno.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBillno.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtBillno, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 90, 30));

        jLabel9.setFont(new java.awt.Font("Algerian", 3, 50)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 0));
        jLabel9.setText("PizzaChef Billing SYSTEM");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 750, -1));

        jLabel4.setFont(new java.awt.Font("Jokerman", 1, 18)); // NOI18N
        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 90, -1));

        jLabel3.setFont(new java.awt.Font("Jokerman", 1, 18)); // NOI18N
        jLabel3.setText("Date");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 90, -1));

        jLabel2.setFont(new java.awt.Font("Jokerman", 1, 18)); // NOI18N
        jLabel2.setText("Bill No..");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 110, -1));

        jLabel1.setBackground(new java.awt.Color(255, 102, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mypackage/billform image.PNG"))); // NOI18N
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
       
        int sum = 0;
        int f = tblbill.getRowCount();
        for(int i = 0;i < f;i++) 
        {       
         sum = sum +  Integer.parseInt(tblbill.getValueAt(i, 3).toString());
        }        
        txtGrandtotal.setText(sum+"");
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        
        ParentForm frmparentform = new ParentForm();
        frmparentform.setVisible(true);
        
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        
        txtName.setText("");
        txtGrandtotal.setText("");
           
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
           try {
                           
               int y = tblbill.getRowCount();
             //JOptionPane.showMessageDialog(this, Y);
            for (int i = 0; i < y ; i++) {
                int billno = Integer.parseInt(txtBillno.getText());
                String billdate = txtDate.getText();
                String name = txtName.getText();
                String itemname = tblbill.getValueAt(i, 0).toString();
                double price = Double.parseDouble(tblbill.getValueAt(i, 1).toString());
                int qty = Integer.parseInt(tblbill.getValueAt(i, 2).toString());
                double amount = Double.parseDouble(tblbill.getValueAt(i, 3).toString());

                String r = "insert into bill values (" + billno + ",'" + billdate + "','" + name + "','" + itemname + "'," + price + "," + qty + "," + amount + ")";

                stmt1.executeUpdate(r);

            }
            JOptionPane.showMessageDialog(null, "Bill paid and successfully saved!");

        } 
           catch (Exception e) 
           {
              JOptionPane.showMessageDialog(null, e);
           }

           JOptionPane.showMessageDialog(null, "THANK YOU! please visit again");

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameMouseClicked

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
            java.util.logging.Logger.getLogger(BillForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblbill;
    private javax.swing.JTextField txtBillno;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtGrandtotal;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

   
}
