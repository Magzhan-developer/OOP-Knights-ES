package codeBlock.src.main;
import codeBlock.src.enums.roles;
import codeBlock.src.enums.systemLanguages;
import codeBlock.src.handlers.LoginHandler;
import codeBlock.src.handlers.RegistrationHandler;
import codeBlock.src.model.Admin;
import codeBlock.src.model.MainPage;
import codeBlock.src.model.UserSessionManager;

import java.util.*;
public class ES_Main {
    public systemLanguages systemLang = systemLanguages.ru;
    MainPage mainPage = new MainPage();
    public void main(String[] args) {
        System.out.println("Добро пожаловать в систему!");
        System.out.println("1.Войти в систему");
        System.out.println("2.Еще нет аккаунта? Быстрая регистрация ->");
        System.out.println("3.Увидеть массив пользователей");


        boolean inSystem = false;
        Vector<Object> users = new Vector<>();
        users.add(new Admin("admin","admin"));

        Scanner scanner = new Scanner(System.in);
        while(!inSystem){
            String userInput = scanner.nextLine();
            switch (userInput){
                case "1":
                    if(LoginHandler.loginUser(users)){
                        mainPage.onInitMethod(UserSessionManager.getInstance().getCurrentUser());
                    };
                    break;
                case "2":
                    RegistrationHandler.registerUser(users);
                    break;
                case "3":
                    if(users.isEmpty()){
                        System.out.println("Вектор пользователей пуст");
                    }else{
                        for(Object user:users){
                            System.out.println(user.toString());
                        }
                    }
                    break;
                default:
                    System.out.println("Незнакомый ввод!!!");
            }
        }

    }
}
