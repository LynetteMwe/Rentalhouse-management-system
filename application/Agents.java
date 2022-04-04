
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Agents {
    
    myConnection cn= new myConnection();
    public boolean addAgent(String ID,String name, String phone){
        
        try {
            PreparedStatement st=cn.createConnection().prepareStatement("INSERT INTO `agents`(`ID`, `Name`, `Phone`) VALUES (?,?,?)");
            
            st.setString(1, ID);
            st.setString(2, name);
            st.setString(3, phone);
            
            if(st.executeUpdate()>0){
                return true;
            }
            else{
                
                return false;
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Agents.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
        
        
        
    }
    
     public boolean editAgent(String ID,String name, String phone){
        
        try {
            PreparedStatement st=cn.createConnection().prepareStatement("UPDATE `agents` SET `Name`=?,`Phone`=? WHERE `ID`=?");
            
            st.setString(1, name);
            st.setString(2, phone);
            st.setString(3, ID);
            
            
            return (st.executeUpdate()>0);
        } catch (SQLException ex) {
            Logger.getLogger(Agents.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
              
                  
                 
        
        
        
        
    }
     
      public boolean removeAgent(String ID){
        
        PreparedStatement st;

        String queryAddition="DELETE FROM `agents` WHERE `ID`=?";
        
        try {
            st=cn.createConnection().prepareStatement(queryAddition);
            
            st.setString(1, ID);

              
            return (st.executeUpdate()>0);
              
                  
                 
        } catch (SQLException ex) {
            Logger.getLogger(Agents.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        
        
    }
    
    
   
    
   public void filljTable(JTable table){
        PreparedStatement st;
        ResultSet  rs;
        String querySelection = "SELECT * FROM `agents`";
        
        try {
            st=cn.createConnection().prepareStatement(querySelection);
            
            rs = st.executeQuery();
            
            DefaultTableModel tableModel=(DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next()){
                row = new Object[3];
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                
                tableModel.addRow(row);


                        
                
                
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Landlord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}

