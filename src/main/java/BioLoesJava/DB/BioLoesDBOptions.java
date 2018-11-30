package BioLoesJava.DB;

public class BioLoesDBOptions {
    private final String password;
    private final String username;

    public BioLoesDBOptions(String password, String username) {
        this.password = password;
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}
