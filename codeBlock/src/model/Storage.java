package codeBlock.src.model;

import java.util.Vector;

public class Storage {
    private Vector<User> usersVector = new Vector<User>();
    public void AddNewUsers(String name,String password){
        usersVector.add(new User(name,password));
    }

    public void removeUser(String name,String password){
        try{
            usersVector.remove(new User(name,password));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
