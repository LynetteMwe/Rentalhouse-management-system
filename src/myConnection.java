
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class myConnection {
    
    public Connection createConnection(){
        Connection connect=null;
        
        MysqlDataSource mds=new MysqlDataSource();
        mds.setServerName("localhost");
        mds.setPortNumber(3306);
        mds.setUser("root");
        mds.setPassword("");
        mds.setDatabaseName("aa");
        
        
            connect = mds.getConnection();
        
        
        return connect;
    }

    PreparedStatement prepareStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
