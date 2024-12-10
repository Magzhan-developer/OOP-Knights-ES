package Models;

public class User {
    private String username;
    private String password;
    public User(String name, String password) {
        this.username = name;
        this.setPassword(password);

    }
    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
