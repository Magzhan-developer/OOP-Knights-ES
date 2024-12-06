package codeBlock.src.main;
import codeBlock.src.handlers.LoginHandler;
import codeBlock.src.handlers.RegistrationHandler;
import codeBlock.src.model.User;

import java.util.*;
public class ES_Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в систему!");
        System.out.println("1.Войти в систему");
        System.out.println("2.Еще нет аккаунта? Быстрая регистрация ->");
        System.out.println("3.Увидеть массив пользователей");

        boolean inSystem = false;
        Vector<Object> users = new Vector<>();

        Scanner scanner = new Scanner(System.in);
        while(!inSystem){
            String userInput = scanner.nextLine();
            switch (userInput){
                case "1":
                    inSystem = LoginHandler.loginUser(users);
                    break;
                case "2":
                    inSystem = RegistrationHandler.registerUser(users);
                    break;
                default:
                    System.out.println("Незнакомый ввод!!!");
            }
        }

    }
}
