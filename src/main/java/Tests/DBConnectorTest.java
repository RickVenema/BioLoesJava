package Tests;


import BioLoesJava.DB.BioLoesDBConnectorMySQL;

public class DBConnectorTest {
    public static void main(String[] args) {
        BioLoesDBConnectorMySQL dbConnectorMySQL = new BioLoesDBConnectorMySQL();
        dbConnectorMySQL.connect();
    }


}
