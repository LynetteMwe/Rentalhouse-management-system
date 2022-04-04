
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class p_class {
    myConnection cn= new myConnection();
    public boolean addPayment(String ID,String name, String houseno,String date){
        
        PreparedStatement st;
        String queryAddition="INSERT INTO `payments`(`Payment_ID`, `House_No`, `Cash_paid`, `Date`) VALUES (?,?,?,?)";
        
        try {
            st=cn.createConnection().prepareStatement(queryAddition);
            
            st.setString(1, ID);
             st.setString(2, name);
              st.setString(3, houseno);
             st.setString(4, date);
              
              if(st.executeUpdate()>0){
                  return true;
              }
              else{
                  
                  return false;
                  
                  
              }
        } catch (SQLException ex) {
            Logger.getLogger(Agents.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
        
        
    }
    
    
}
