package BioLoesJava.DB;
import java.sql.*;

public class BioLoesDBConnectorMySQL extends BioLoesDBConnectorBase {
    @Override
    public void connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
