import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;




public class tCheckinOut {
    
    myConnection con = new myConnection();
    public boolean removeTenant(String ID){
        
        PreparedStatement st;
        ResultSet rs;
        String queryAddition="DELETE FROM `tenants` WHERE ID=?";
        
        try {
            st=con.createConnection().prepareStatement(queryAddition);
            
           
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
    
    public boolean addCheckout(String ID,String name, String phone,String houseno,String checkindate,String checkoutdate){
        
        PreparedStatement st;
        ResultSet rs;
        String queryAddition="INSERT INTO `tenants_checkout`(`ID`, `Name`, `Phone`, `HouseNumber`, `CheckInDate`, `CheckOutDate`) VALUES (?,?,?,?,?,?)";
        
        try {
            st=con.createConnection().prepareStatement(queryAddition);
            
            st.setString(1, ID);
             st.setString(2, name);
              st.setString(3, phone);
              st.setString(4, houseno);
              st.setString(5, checkindate);
              st.setString(6, checkoutdate);
              
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
        String queryAddition="UPDATE `houses` SET `Status`= \"Not taken\" WHERE houses.Number=?";
        
        try {
            st=con.createConnection().prepareStatement(queryAddition);
            
           
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
    
    
}
