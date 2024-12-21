package codeBlock.src.model;
import codeBlock.src.enums.roles;

public class User {
    private final String username;
    private String password;
    private roles user_role = roles.USER;
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        if (username.equals("admin")){
            user_role = roles.ADMIN;
        }
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

    public void setUser_role(roles user_role) {
        this.user_role = user_role;
    }

    public roles getUserRole(){
        return user_role;
    }

    @Override
    public String toString() {
        return "Пользователь с никнеймом " + username + " и с ролью " + user_role;
    }

}
