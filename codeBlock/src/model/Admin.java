package codeBlock.src.model;

import java.util.Iterator;
import java.util.List;

public class Admin extends User {
    Admin(String username,String password){
        super(username,password);
    }

    public static void setRoleForUsers (List<User> users,String username,ROLES role){
        int count = 0;
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                user.setUserRole(role);
                count++;
                break;
            }
        }
        if (count == users.size()) {
            System.out.println("Пользователь с таким именем не существует!");
        }
    }

}
