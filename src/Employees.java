
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Employees {
    
       
    myConnection cn= new myConnection();
    public boolean addEmployees(String ID,String name, String phone, String job, String salary){
        
        PreparedStatement st;
        ResultSet rs;
        String queryAddition="INSERT INTO `employees`(`ID`, `Name`, `Phone`, `Job`, `Salary`) VALUES (?,?,?,?,?)";
        
        try {
            st=cn.createConnection().prepareStatement(queryAddition);
            
            st.setString(1, ID);
            st.setString(2, name);
            st.setString(3, phone);
            st.setString(4, job);
            st.setString(5, salary);


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
    
    public boolean editEmployee(String ID,String name, String phone,String job, String salary){
        
        PreparedStatement st;

        String queryAddition="UPDATE `employees` SET `Name`=?,`Phone`=?,`Job`=?,`Salary`=? WHERE `ID`=?";
        
        try {
            st=cn.createConnection().prepareStatement(queryAddition);
            
            st.setString(1, name);
            st.setString(2, phone);
            st.setString(3, job);
            st.setString(4,salary);
            st.setString(5, ID);


              
            return (st.executeUpdate()>0);
              
                  
                 
        } catch (SQLException ex) {
            Logger.getLogger(Employees.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        
        
    }
    
      public boolean removeEmployees(String ID){
        
        PreparedStatement st;
        ResultSet rs;
        String queryAddition="DELETE FROM `employees` WHERE `ID`=?";
        
        try {
            st=cn.createConnection().prepareStatement(queryAddition);
            
            st.setString(1, ID);
           


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
        String querySelection = "SELECT * FROM `employees`";
        
        try {
            st=cn.createConnection().prepareStatement(querySelection);
            
            rs = st.executeQuery();
            
            DefaultTableModel tableModel=(DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next()){
                row = new Object[5];
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                tableModel.addRow(row);


                        
                
                
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Landlord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
