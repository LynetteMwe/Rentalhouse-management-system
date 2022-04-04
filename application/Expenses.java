
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Expenses {
       
    myConnection cn= new myConnection();
    public boolean addExpenses(String name,String amount, String use, String date){
        
        PreparedStatement st;
        ResultSet rs;
        String queryAddition="INSERT INTO `expenses`(`Name_of_Personel`, `Amount`, `Use`, `Date`) VALUES (?,?,?,?)";
        
        try {
            st=cn.createConnection().prepareStatement(queryAddition);
            
            st.setString(1, name);
            st.setString(2, amount);
            st.setString(3, use);
            st.setString(4, date);


              if(st.executeUpdate()>0){
                  return true;
              }
              else{
                  
                  return false;
                  
                  
              }
        } catch (SQLException ex) {
            Logger.getLogger(Landlord.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        
        
    }
   
    
    public void filljTable(JTable table){
        PreparedStatement st;
        ResultSet  rs;
        String querySelection = "SELECT * FROM `expenses`";
        
        try {
            st=cn.createConnection().prepareStatement(querySelection);
            
            rs = st.executeQuery();
            
            DefaultTableModel tableModel=(DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next()){
                row = new Object[4];
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                tableModel.addRow(row);


                        
                
                
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Landlord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    
}
