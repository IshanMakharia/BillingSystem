


package mypackage;

    import java.sql.*;
    import javax.swing.JOptionPane;
    import javax.swing.table.DefaultTableModel;
    import javax.swing.table.TableModel;
    

public class ItemInfoForm extends javax.swing.JFrame {  
    
    Connection con;
    Statement stmt;
    ResultSet rs;

    
    public ItemInfoForm() {
        initComponents();
        
        btnconfirm.setEnabled(false);
        btnsummary.setEnabled(false);
        
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

        btnRefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblsummary = new javax.swing.JTable();
        btnsummary = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblmenu = new javax.swing.JTable();
        btnExit = new javax.swing.JButton();
        btnconfirm = new javax.swing.JButton();
        btnmenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(5, 0, 50));
        setPreferredSize(new java.awt.Dimension(1368, 763));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRefresh.setBackground(new java.awt.Color(0, 0, 0));
        btnRefresh.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        btnRefresh.setForeground(new java.awt.Color(204, 0, 0));
        btnRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mypackage/refreshbuttonlogo image.PNG"))); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        getContentPane().add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 40));

        tblsummary.setBackground(new java.awt.Color(0, 0, 0));
        tblsummary.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tblsummary.setForeground(new java.awt.Color(204, 0, 0));
        tblsummary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEMNAME", "PRICE", "QUANTITY", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblsummary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblsummaryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblsummary);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 510, 140));

        btnsummary.setBackground(new java.awt.Color(255, 0, 0));
        btnsummary.setFont(new java.awt.Font("Jokerman", 1, 18)); // NOI18N
        btnsummary.setText("SHOW ORDER SUMMARY ");
        btnsummary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsummaryActionPerformed(evt);
            }
        });
        getContentPane().add(btnsummary, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 290, 40));

        tblmenu.setBackground(new java.awt.Color(0, 0, 0));
        tblmenu.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tblmenu.setForeground(new java.awt.Color(204, 0, 0));
        tblmenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEMNAME", "SPECIFICATION", "PRICE", "QUANTITY"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblmenu.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tblmenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblmenuMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblmenu);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 840, 270));

        btnExit.setBackground(new java.awt.Color(0, 0, 0));
        btnExit.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(204, 0, 0));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mypackage/exitbuttonlogo image.PNG"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1235, 20, -1, 40));

        btnconfirm.setBackground(new java.awt.Color(204, 0, 0));
        btnconfirm.setFont(new java.awt.Font("Jokerman", 1, 18)); // NOI18N
        btnconfirm.setText("Confirm Your Order");
        btnconfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfirmActionPerformed(evt);
            }
        });
        getContentPane().add(btnconfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 640, 230, 50));

        btnmenu.setBackground(new java.awt.Color(204, 0, 0));
        btnmenu.setFont(new java.awt.Font("Jokerman", 1, 18)); // NOI18N
        btnmenu.setText("Show Menu");
        btnmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 170, -1));

        jLabel1.setFont(new java.awt.Font("Algerian", 3, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("PIZZA CHEF");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 320, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mypackage/iteminfoform image.PNG"))); // NOI18N
        jLabel3.setOpaque(true);
        jLabel3.setPreferredSize(new java.awt.Dimension(1368, 765));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
       
        ParentForm frmparentform = new ParentForm();
        frmparentform.setVisible(true); 
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuActionPerformed
        try
        {
        
            String s = "select * from iteminfo";
            rs = stmt.executeQuery(s); 
            rs.first();
            String itmname, spec, price, qty;
            
            DefaultTableModel model = (DefaultTableModel)tblmenu.getModel();
            tblmenu.setModel(model);
            model.setRowCount(0);
            while(rs.next())
            {
                itmname = rs.getString("itemname");
                spec = rs.getString("specification");
                price = rs.getString("price");
                model.addRow(new Object[]{itmname, spec, price});
                
            }
                                 
            }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null,e);
        }
        
        btnsummary.setEnabled(true);
    }//GEN-LAST:event_btnmenuActionPerformed

    private void btnconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmActionPerformed
       
           
            TableModel model2 = tblsummary.getModel();
            int ind[]= tblsummary.getSelectedRows();
            Object[] row = new Object[4];
                BillForm frm2 = new BillForm();
                     DefaultTableModel model3 = (DefaultTableModel)frm2.tblbill.getModel();
                     for(int i = 0; i< ind.length;i++)
                     {
                            row[0] = model2.getValueAt(ind[i], 0);
                            row[1] = model2.getValueAt(ind[i], 1);
                            row[2] = model2.getValueAt(ind[i], 2);
                            row[3] = model2.getValueAt(ind[i], 3);
                            model3.addRow(row);
                     }                                                   
                       
            frm2.setVisible(true);                      
                                      
    }//GEN-LAST:event_btnconfirmActionPerformed

    private void tblmenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblmenuMouseClicked
        // TODO add your handling code here:                  
                    
    }//GEN-LAST:event_tblmenuMouseClicked

    private void btnsummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsummaryActionPerformed
                        
             TableModel model1 =  tblmenu.getModel();
             int[] indexs = tblmenu.getSelectedRows();
                     Object[] row = new Object[4];
                     DefaultTableModel model2 = (DefaultTableModel)tblsummary.getModel();
                     for(int i = 0; i< indexs.length;i++)
                     {
                            row[0] = model1.getValueAt(indexs[i], 0);
                            row[1] = model1.getValueAt(indexs[i], 2);
                            row[2] = model1.getValueAt(indexs[i], 3);
                            model2.addRow(row);
                     }
                     int j,amt,price,qty;
                     int index = tblsummary.getRowCount();
                     Object[] total = new Object[4];
                     for(j = 0;j < index;j++)
                     {
                     total[0] = model2.getValueAt(j, 1);
                     total[1] = model2.getValueAt(j, 2);
                     price = Integer.parseInt(total[0].toString());
                     qty = Integer.parseInt(total[1].toString());
                     amt = price * qty;
                     
                      model2.setValueAt(amt, j, 3);
                                          
                     }
                     
                     btnsummary.setEnabled(false);                   
                
    }//GEN-LAST:event_btnsummaryActionPerformed

    private void tblsummaryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsummaryMouseClicked
        
        btnconfirm.setEnabled(true);
                        
    }//GEN-LAST:event_tblsummaryMouseClicked

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
       
        DefaultTableModel model = (DefaultTableModel) tblmenu.getModel();
        model.setRowCount(0);
        DefaultTableModel model1 = (DefaultTableModel) tblsummary.getModel();
        model1.setRowCount(0);
        btnsummary.setEnabled(true);
        btnconfirm.setEnabled(false);
          
    }//GEN-LAST:event_btnRefreshActionPerformed

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
            java.util.logging.Logger.getLogger(ItemInfoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ItemInfoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ItemInfoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ItemInfoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ItemInfoForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnconfirm;
    private javax.swing.JButton btnmenu;
    private javax.swing.JButton btnsummary;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane6;
    public javax.swing.JTable tblmenu;
    public javax.swing.JTable tblsummary;
    // End of variables declaration//GEN-END:variables
}
