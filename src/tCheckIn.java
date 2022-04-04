
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class tCheckIn {
     myConnection cn= new myConnection();
    public boolean addTenant(String ID,String name, String phone,String houseNo,String CheckInDate){
        
        PreparedStatement st;
        ResultSet rs;
        String queryAddition="INSERT INTO `tenants`(`ID`, `Name`, `Phone`, `HouseNumber`, `CheckInDate`) VALUES (?,?,?,?,?)";
        
        try {
            st=cn.createConnection().prepareStatement(queryAddition);
            
            st.setString(1, ID);
             st.setString(2, name);
              st.setString(3, phone);
               st.setString(4, houseNo);
               st.setString(5, CheckInDate);
              
              
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
    
    
     public boolean UpdateHouseStatus(String number){
        
        PreparedStatement st;
        ResultSet rs;
        String queryAddition="UPDATE `houses` SET `Status`= \"Taken\" WHERE houses.Number=?";
        
        try {
            st=cn.createConnection().prepareStatement(queryAddition);
            
           
             st.setString(1, number);
             
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

    boolean addTenant(String ID, String name, String phone, String houseno, java.util.Date date) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
    
    
}
