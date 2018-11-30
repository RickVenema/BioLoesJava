package BioLoesJava.DB;
import java.sql.*;

public class BioLoesDBConnectorMySQL extends BioLoesDBConnectorBase {
    @Override
    public void connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            BioLoesPropertiesReader propertiesReader = new BioLoesPropertiesReader();
            propertiesReader.getDBUser();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
