
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import net.proteanit.sql.DbUtils;

public class Profits extends javax.swing.JFrame {

    myConnection con = new myConnection();
    public Profits() {
        initComponents();
        tableFillOne();
        tableFillTwo();
        tableFillThree();
        Dis();
        Dis2();
        Dis3();
        //profit();
        
        
        
    }

    
    @SuppressWarnings("unchecked")
    
    
     public void tableFillOne(){
        PreparedStatement pst;
        ResultSet rst;
        
        try {
            
            
            String q="SELECT\n" +
"tenants.ID AS Tenant_ID,\n" +
"houses.Number AS House_Number,\n" +
"payments.Cash_paid AS Amount,\n" +
"(payments.Cash_paid)* 4/100 AS Company_Income\n" +
"FROM\n" +
"houses\n" +
"INNER JOIN\n" +
"tenants\n" +
"ON\n" +
"tenants.HouseNumber= houses.Number\n" +
"INNER JOIN\n" +
"payments\n" +
"ON\n" +
"payments.House_No=houses.Number";
            pst=con.createConnection().prepareStatement(q);
            rst=pst.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rst));
            
        } catch (SQLException ex) {
            Logger.getLogger(TenantsCheckIn.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
 
    
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(102, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setText("PROFITS");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(492, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(270, 270, 270))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, -1));

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
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 190));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, -1, 190));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 575, 219));
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 213, 36));

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 345, -1, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, 217, 36));
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 590, 254, 35));
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 650, 254, 35));

        jLabel3.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 255, 255));
        jLabel3.setText("Company's Profit");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 650, 230, 30));

        jLabel4.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 255, 255));
        jLabel4.setText("Salaries Paid");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 590, 210, 40));

        jLabel5.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 255, 255));
        jLabel5.setText("Total company's income");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 210, 40));

        jLabel6.setFont(new java.awt.Font("Sylfaen", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 255, 255));
        jLabel6.setText("Total expenses");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    
    public void tableFillTwo(){
        PreparedStatement pst;
        ResultSet rst;
        
        try {
            
            
            String q="SELECT\n" +
"expenses.Use,\n" +
"expenses.Amount\n" +
"FROM\n" +
"expenses";
            pst=con.createConnection().prepareStatement(q);
            rst=pst.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(rst));
            
        } catch (SQLException ex) {
            Logger.getLogger(TenantsCheckIn.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
 
     
    public void tableFillThree(){
        PreparedStatement pst;
        ResultSet rst;
        
        try {
            
            
            String q="SELECT\n" +
"salary.Payment_ID,\n" +
"salary.employee_ID,\n" +
"salary.Amount\n" +
"FROM\n" +
"salary";
            pst=con.createConnection().prepareStatement(q);
            rst=pst.executeQuery();
            jTable4.setModel(DbUtils.resultSetToTableModel(rst));
            
        } catch (SQLException ex) {
            Logger.getLogger(TenantsCheckIn.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
 
    public void Dis(){
         
        try {
            PreparedStatement st;
            ResultSet rs;
            String query="SELECT\n" +
                    "(0.04*SUM(payments.Cash_paid)) AS Income\n" +
                    "FROM\n" +
                    "payments";
            
            
            st=con.createConnection().prepareStatement(query);

            rs=st.executeQuery(query);
            if(rs.next()){
                String income=rs.getString("Income");
                jTextField1.setText(income);
                
            }   } catch (SQLException ex) {
            Logger.getLogger(Profits.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
    public void Dis2(){
         
        try {
            PreparedStatement st;
            ResultSet rs;
            String query="SELECT\n" +
"SUM(expenses.Amount) AS Total_Expenses\n" +
"FROM\n" +
"expenses";
            
            
            st=con.createConnection().prepareStatement(query);

            rs=st.executeQuery(query);
            if(rs.next()){
                String TExpenses=rs.getString("Total_Expenses");
                jTextField2.setText(TExpenses);
                
            }   } catch (SQLException ex) {
            Logger.getLogger(Profits.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
     public void Dis3(){
         
        try {
            PreparedStatement st;
            ResultSet rs;
            String query="SELECT\n" +
"SUM(salary.Amount) AS TotalSalary\n" +
"FROM\n" +
"salary";
            
            
            st=con.createConnection().prepareStatement(query);

            rs=st.executeQuery(query);
            if(rs.next()){
                String TSalaries=rs.getString("TotalSalary");
                jTextField4.setText(TSalaries);
                
            }   } catch (SQLException ex) {
            Logger.getLogger(Profits.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
     public void profit(){
         Double rent = Double.parseDouble(jTextField1.getText());
         Double exp = Double.parseDouble(jTextField2.getText());
         Double sal = Double.parseDouble(jTextField4.getText());
         Double profit = rent-exp-sal;
         jTextField3.setText(profit.toString());
         
         
         
     }
    
 
    
    
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profits().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
