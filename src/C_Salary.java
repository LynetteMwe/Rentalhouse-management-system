import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class C_Salary {
    
    myConnection cn= new myConnection();
    public boolean addSalary(String ID,String empID, String amount,String Date){
        
        PreparedStatement st;
        String queryAddition="INSERT INTO `salary`(`Payment_ID`, `employee_ID`, `Amount`, `date`) VALUES (?,?,?,?)";
        
        try {
            st=cn.createConnection().prepareStatement(queryAddition);
            
            st.setString(1, ID);
             st.setString(2, empID);
              st.setString(3, amount);
              st.setString(4, Date);
              
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
