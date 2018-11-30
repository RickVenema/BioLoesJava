package BioLoesJava.DB;

import java.util.Properties;

public class BioLoesPropertiesReader {
    Properties configFile;

    public BioLoesPropertiesReader() {
        configFile = new java.util.Properties();
        try {
            configFile.load(this.getClass().getClassLoader().
                    getResourceAsStream("BioLoes/DB/config.cfg"));
        }catch(Exception eta){
            eta.printStackTrace();
        }
    }

    private String getProperty(String key) {
        String value = this.configFile.getProperty(key);
        return value;
    }


    public BioLoesDBOptions getDBUser() {
        return new BioLoesDBOptions(getProperty("user"), getProperty("password"), getProperty("host"), getProperty("database"));
    }
}

