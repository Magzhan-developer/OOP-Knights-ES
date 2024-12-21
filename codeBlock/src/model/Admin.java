package codeBlock.src.model;

import codeBlock.src.enums.roles;

import java.util.Iterator;
import java.util.List;

public class Admin extends User {
    public Admin(String username,String password){
        super(username,password);
    }

    /*public static void setRoleForUsers (List<User> users, String username, roles role){
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
    }*/

}
