
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Estate {
    
       
    myConnection cn= new myConnection();
    public boolean addEstates(String ID,String name, String Class){
        
        try {
            PreparedStatement st=cn.createConnection().prepareStatement("INSERT INTO `estates`(`ID`, `Name`, `Class`) VALUES (?,?,?)");
            ResultSet rs;
            
            
            st.setString(1, ID);
            st.setString(2, name);
            st.setString(3, Class);
            
            if(st.executeUpdate()>0){
                return true;
            }
            else{
                
                return false;
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Estate.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        
        
        
        
    }

    
     public boolean editEstates(String ID,String name, String Class){
        
        try {
            PreparedStatement st=cn.createConnection().prepareStatement("UPDATE `estates` SET `Name`=?,`Class`=? WHERE `ID`=?");
            ResultSet rs;
            
            
            
            
            
            st.setString(1, name);
            st.setString(2, Class);
            st.setString(3, ID);
            
            
            
            if(st.executeUpdate()>0){
                return true;
            }
            else{
                
                return false;
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Estate.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        } 
        
        
        
    
     public boolean removeEstate(String ID){
        
        try {
            PreparedStatement st=cn.createConnection().prepareStatement("DELETE FROM `estates` WHERE `ID`=?");
            ResultSet rs;
            
            
            
            st.setString(1, ID);
            
            
            
            if(st.executeUpdate()>0){
                return true;
            }
            else{
                
                return false;
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Estate.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
        } 
        
   
    public void filljTable(JTable table){
        try {
            PreparedStatement st=cn.createConnection().prepareStatement("SELECT * FROM `estates`");
            ResultSet  rs;
            
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
            Logger.getLogger(Estate.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
