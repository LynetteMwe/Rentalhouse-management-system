import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Salaries extends javax.swing.JFrame {

    
    myConnection cn=new myConnection();
    C_Salary cs=new C_Salary();
    SimpleDateFormat st= new SimpleDateFormat("yyyy-MM-dd");
    public Salaries() {
        initComponents();
        ComboName();
        this.setLocationRelativeTo(null);
        jDateChooser1.setMaxSelectableDate(new Date());
        jDateChooser1.setMinSelectableDate(new Date());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldemp = new javax.swing.JTextField();
        jTextFieldjob = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldamount = new javax.swing.JTextField();
        jComboBoxName = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldsalary = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setText("SALARIES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(227, 227, 227))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 821, -1));

        jLabel2.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 255, 255));
        jLabel2.setText("PAYMENT ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 96, 25));
        jPanel1.add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 174, 25));

        jLabel3.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 255, 255));
        jLabel3.setText("NAME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 52, 25));

        jLabel4.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 255, 255));
        jLabel4.setText("EMPLOYEES ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, 25));

        jTextFieldemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldempActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldemp, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 174, 25));

        jTextFieldjob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldjobActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldjob, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 174, 32));

        jLabel5.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 255, 255));
        jLabel5.setText("JOB");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, 25));

        jLabel6.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 255, 255));
        jLabel6.setText("SALARY");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 66, 25));

        jTextFieldamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldamountActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 174, 32));

        jComboBoxName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "_ _ Select_ _" }));
        jComboBoxName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxNameItemStateChanged(evt);
            }
        });
        jPanel1.add(jComboBoxName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 174, 25));

        jLabel7.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 255, 255));
        jLabel7.setText("AMOUNT");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 66, 25));

        jLabel8.setFont(new java.awt.Font("Sylfaen", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 255, 255));
        jLabel8.setText("DATE");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 66, 25));

        jTextFieldsalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldsalaryActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldsalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 174, 32));

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 174, 31));

        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\icons\\Floppy-Small-icon.png")); // NOI18N
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 129, 31));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
     public void ComboName(){
        PreparedStatement st;
        ResultSet  rs;
        String querySelection = "SELECT * FROM `employees` ";
        
         try {
             st=cn.createConnection().prepareStatement(querySelection);
              rs = st.executeQuery();
              
              while(rs.next()){
                  String LandlordID=rs.getString("Name");
                  jComboBoxName.addItem(LandlordID);
              }
             
         } catch (SQLException ex) {
             Logger.getLogger(Houses.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    private void jTextFieldempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldempActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldempActionPerformed

    private void jTextFieldjobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldjobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldjobActionPerformed

    private void jTextFieldamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldamountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldamountActionPerformed

    private void jTextFieldsalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldsalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldsalaryActionPerformed

    private void jComboBoxNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxNameItemStateChanged
        // TODO add your handling code here:
        try{
         PreparedStatement st;
            ResultSet rs;
           String query=" SELECT\n" +
"`ID`,`Job`,`Salary`\n" +
"FROM\n" +
"employees\n" +
"WHERE\n" +
"Name='"+jComboBoxName.getSelectedItem()+"';";
            String ID,job,salary;
           
            st=cn.createConnection().prepareStatement(query);

            rs=st.executeQuery(query);
            if(rs.next()){
                ID=rs.getString("ID");
                job=rs.getString("Job");
                salary=rs.getString("Salary");
                
               
                jTextFieldemp.setText(ID);
                jTextFieldjob.setText(job);
                jTextFieldsalary.setText(salary);
               }
}
catch (SQLException ex) {
            Logger.getLogger(TenantsCheckIn.class.getName()).log(Level.SEVERE, null, ex);
        }    
        
        
    }//GEN-LAST:event_jComboBoxNameItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String ID=String.valueOf(jTextFieldID.getText());
        String empID=jTextFieldemp.getText();
        String amount=String.valueOf(jTextFieldamount.getText());
        Date d = jDateChooser1.getDate();
        String date = st.format(d);
        
        if(ID.trim().equals("") ||amount.trim().equals("") || date.trim().equals("")){
            
            JOptionPane.showMessageDialog(rootPane, "Required Fields -> ID, Name and Phone", "Empty fields", JOptionPane.WARNING_MESSAGE);

        }
        else{
            
        
        
         if(cs.addSalary(ID, empID, amount,date)){
            JOptionPane.showMessageDialog(rootPane, "Successful", "Add_Agent", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Unsuccessful", "Add_Agent Error", JOptionPane.ERROR_MESSAGE);

        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Salaries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Salaries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Salaries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Salaries.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Salaries().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBoxName;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldamount;
    private javax.swing.JTextField jTextFieldemp;
    private javax.swing.JTextField jTextFieldjob;
    private javax.swing.JTextField jTextFieldsalary;
    // End of variables declaration//GEN-END:variables
}
