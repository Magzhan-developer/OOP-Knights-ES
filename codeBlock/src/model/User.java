package codeBlock.src.model;

public class User {
    private final String username;
    private String password;
    private ROLES user_role;
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this) return true;
        if((obj == null) || obj.getClass() != this.getClass()) return false;

        User anotherUser = (User) obj;
        return anotherUser.getUsername().equals(this.getUsername())
                &&
                anotherUser.getPassword().equals(this.getPassword());
    }

    public void setUserRole(ROLES user_role) {
        this.user_role = user_role;
    }

}
