package BioLoesJava.DB;

public class BioLoesDBOptions {
    private final String password;
    private final String username;
    private final String host;
    private final String database;

    public BioLoesDBOptions(String password, String username, String host, String database) {
        this.password = password;
        this.username = username;
        this.host = host;
        this.database = database;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getHost() {
        return host;
    }

    public String getDatabase() {
        return database;
    }
}
