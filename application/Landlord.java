
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory.Result;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Landlord {
    
    
    myConnection cn= new myConnection();
    public boolean addLandlord(String ID,String name, String phone){
        
        PreparedStatement st;
        Result rs;
        String queryAddition="INSERT INTO `landlords`(`ID`, `Name`, `Phone`) VALUES (?,?,?)";
        
        try {
            st=cn.createConnection().prepareStatement(queryAddition);
            
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
            Logger.getLogger(Landlord.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        
        
    }
    
    
    
    
    
    public boolean editLandlord(String ID,String name, String phone){
        
        PreparedStatement st;
        Result rs;
        String queryAddition="UPDATE `landlords` SET `Name`=?,`Phone`=? WHERE `ID`=?";
        
        try {
            st=cn.createConnection().prepareStatement(queryAddition);
            
           
             st.setString(1, name);
              st.setString(2, phone);
              st.setString(3, ID);
              
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
       
    
    public boolean removeLandlord(String ID){
        
        PreparedStatement st;
        Result rs;
        String queryAddition="DELETE FROM `landlords` WHERE `ID`=?";
        
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
        String querySelection = "SELECT * FROM `landlords`";
        
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
