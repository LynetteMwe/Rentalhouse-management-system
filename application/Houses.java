
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Houses {
     myConnection cn= new myConnection();
    public boolean addHouse(String ID,String EstateID,String LandlordID,String AgentID,String rent, String size,String status){
        
        PreparedStatement st;
        ResultSet rs;
        String queryAddition="INSERT INTO `houses`(`Number`, `Landlord_ID`, `Agent_ID`, `Estate_ID`, `Rent`, `Size`, `Status`) VALUES (?,?,?,?,?,?,?)";
        
        try {
            st=cn.createConnection().prepareStatement(queryAddition);
            
            st.setString(1, ID);
             st.setString(2, EstateID);  
             st.setString(3, LandlordID); 
             st.setString(4, AgentID); 
             st.setString(5, rent);
             st.setString(6,size );  
             st.setString(7,status );





              
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
    
    
    
    
    
    public boolean editHouse(String ID,String EstateID,String LandlordID,String AgentID,String rent, String size,String status){
        
        PreparedStatement st;
        ResultSet rs;
        String queryAddition="UPDATE `landlords` SET `Name`=?,`Phone`=? WHERE `ID`=?";
        
        try {
            st=cn.createConnection().prepareStatement(queryAddition);
            
           
             st.setString(1, ID);
              st.setString(2, EstateID);
              st.setString(3, LandlordID);
              st.setString(4, AgentID);
              st.setString(5, size);
              st.setString(6, rent);
              st.setString(7, status);
              
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
       
    
    public boolean removeHouse(String ID){
        
        PreparedStatement st;
        DirStateFactory.Result rs;
        String queryAddition="DELETE FROM `houses` WHERE `Number`=?";
        
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
        String querySelection = "SELECT * FROM `houses`";
        
        try {
            st=cn.createConnection().prepareStatement(querySelection);
            
            rs = st.executeQuery();
            
            DefaultTableModel tableModel=(DefaultTableModel)table.getModel();
            
            Object[] row;
            
            while(rs.next()){
                row = new Object[7];
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);  
                row[3] = rs.getString(4);  
                row[4] = rs.getString(5); 
                row[5] = rs.getString(6);   
                row[6] = rs.getString(7);




                
                tableModel.addRow(row);


                        
                
                
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Landlord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
