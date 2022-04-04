import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class TenantsCheckOut extends javax.swing.JFrame {

    myConnection con = new myConnection();
    tCheckinOut tt = new tCheckinOut();
    
    public TenantsCheckOut() {
        initComponents();
        tableFill();
        jDateChooser2.setMinSelectableDate(new Date());
        jDateChooser2.setMinSelectableDate(new Date());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldname = new javax.swing.JTextField();
        jTextFieldphone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldhouseno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jTextFieldcheckin = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel4.setText("TENANTS CHECKOUT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 255));
        jLabel1.setText("Tenant ID");

        jTextFieldID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldIDKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 255));
        jLabel2.setText("Tenant Name");

        jTextFieldname.setEditable(false);
        jTextFieldname.setEnabled(false);
        jTextFieldname.setFocusable(false);
        jTextFieldname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldnameActionPerformed(evt);
            }
        });

        jTextFieldphone.setEditable(false);
        jTextFieldphone.setEnabled(false);
        jTextFieldphone.setFocusable(false);
        jTextFieldphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldphoneActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 255, 255));
        jLabel3.setText("Phone");

        jLabel14.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 255, 255));
        jLabel14.setText("Date Checked In");

        jTextFieldhouseno.setEditable(false);
        jTextFieldhouseno.setEnabled(false);
        jTextFieldhouseno.setFocusable(false);
        jTextFieldhouseno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldhousenoKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 255, 255));
        jLabel5.setText("House Number");

        jLabel15.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 255, 255));
        jLabel15.setText("Date Checked Out");

        jButton2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\icons\\remove human 2.png")); // NOI18N
        jButton2.setText("CheckOut");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextFieldcheckin.setEditable(false);
        jTextFieldcheckin.setEnabled(false);
        jTextFieldcheckin.setFocusable(false);
        jTextFieldcheckin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldcheckinActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldcheckin, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(71, 71, 71)
                                            .addComponent(jTextFieldphone, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(41, 41, 41)
                                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(17, 17, 17)
                                        .addComponent(jTextFieldname, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(87, 87, 87)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(4, 4, 4)
                                        .addComponent(jTextFieldhouseno, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldhouseno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldname))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldphone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldcheckin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldhousenoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldhousenoKeyReleased
        
    }//GEN-LAST:event_jTextFieldhousenoKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

       String ID= String.valueOf(jTextFieldID.getText());
        
         String Id=String.valueOf(jTextFieldID.getText());
        String name=jTextFieldname.getText();
        String phone=String.valueOf(jTextFieldphone.getText());
        String houseno=String.valueOf(jTextFieldhouseno.getText());
        String checkin=String.valueOf(jTextFieldcheckin.getText());
        String checkout=String.valueOf(jDateChooser2.getDate());
        
          
        if(tt.addCheckout(Id, name, phone,houseno,checkin,checkout)){
            JOptionPane.showMessageDialog(rootPane, "Tenant deleted", "Add_Landlord", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Unsuccessful", "Add_Landlord Error", JOptionPane.ERROR_MESSAGE);

        }
         if(tt.removeTenant(ID)){
            JOptionPane.showMessageDialog(rootPane, "Checked Out", "Delete_Agent", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Enter Tenant's ID", "Delete_Agent Error", JOptionPane.ERROR_MESSAGE);

        }
        
        
              
         
       
        
         String number=String.valueOf(jTextFieldhouseno.getText());
        tt.UpdateHouseStatus(number);
         jTable1.setModel(new DefaultTableModel(null, new Object[]{""}));
         tableFill();
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldIDKeyReleased
try {
            
            PreparedStatement st;
            ResultSet rs;
           String query="SELECT `Name`, `Phone`, `HouseNumber`, `CheckInDate` FROM `tenants` WHERE id='"+jTextFieldID.getText()+"';";
            String name,phone,housenumber,checkindate;
            st=con.createConnection().prepareStatement(query);

            rs=st.executeQuery(query);
            if(rs.next()){
                name=rs.getString("Name");
                phone=rs.getString("Phone");
                housenumber=rs.getString("HouseNumber");
                checkindate=rs.getString("CheckInDate");
               
                jTextFieldname.setText(name);
                jTextFieldphone.setText(phone);
                jTextFieldhouseno.setText(housenumber);
                jTextFieldcheckin.setText(checkindate);
               
                

               

            }
        } catch (SQLException ex) {
            Logger.getLogger(TenantsCheckIn.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDKeyReleased

    private void jTextFieldnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldnameActionPerformed

    private void jTextFieldphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldphoneActionPerformed

    
     public void tableFill(){
        PreparedStatement pst;
        ResultSet rst;
        
        try {
            
            
            String q="SELECT * FROM `tenants`";
            pst=con.createConnection().prepareStatement(q);
            rst=pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rst));
            
        } catch (SQLException ex) {
            Logger.getLogger(TenantsCheckIn.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    
    
    private void jTextFieldcheckinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldcheckinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldcheckinActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(TenantsCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TenantsCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TenantsCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TenantsCheckOut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TenantsCheckOut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldcheckin;
    private javax.swing.JTextField jTextFieldhouseno;
    private javax.swing.JTextField jTextFieldname;
    private javax.swing.JTextField jTextFieldphone;
    // End of variables declaration//GEN-END:variables
}
