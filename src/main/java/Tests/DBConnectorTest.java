package Tests;

import BioLoesJava.DB.BioLoesCNFReader;

public class DBConnectorTest {
    public static void main(String[] args) {
        BioLoesCNFReader cnfReader = new BioLoesCNFReader();
        cnfReader.read("E:\\BioLoesJava\\src\\main\\java\\Tests\\cnf-template.cnf");
    }


}
