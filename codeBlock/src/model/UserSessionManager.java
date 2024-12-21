package codeBlock.src.model;

public class UserSessionManager {
    private static UserSessionManager instance;
    private User currentUser;
    private UserSessionManager() {}

    public static UserSessionManager getInstance() {
        if (instance == null) {
            instance = new UserSessionManager();
        }
        return instance;
    }
    public User getCurrentUser() {
        return currentUser;
    }
    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
    public boolean isLoggedIn(){
        return currentUser != null;
    }

}
