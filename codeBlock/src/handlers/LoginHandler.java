package codeBlock.src.handlers;

import codeBlock.src.model.User;
import codeBlock.src.model.UserSessionManager;

import java.util.Scanner;
import java.util.Vector;

public class LoginHandler {
    public static boolean loginUser(Vector<Object> users) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя пользователя:");
        String username = scanner.nextLine();
        System.out.print("Введите пароль:");
        String password = scanner.nextLine();

        if (users.isEmpty()) {
            System.out.println("Вас нет в системе! Сначала зарегистрируйтесь.");
            return false;
        } else {
            boolean userFound = false;
            for (Object userObj : users) {
                User user = (User) userObj;
                if (user.getUsername().equals(username)) {
                    userFound = true;
                    if (user.getPassword().equals(password)) {
                        System.out.println("Вы успешно вошли в систему");
                        UserSessionManager.getInstance().setCurrentUser(user);
                        return true;
                    } else {
                        System.out.println("Неправильный пароль!");
                        boolean isCorrectPassword = false;
                        while (!isCorrectPassword) {
                            System.out.print("Введите пароль еще раз:");
                            String passwordRepeat = scanner.nextLine();
                            if (passwordRepeat.equals(user.getPassword())) {
                                System.out.println("Пароль верный. Вы вошли в систему.");
                                return true;
                            } else {
                                System.out.println("Неправильный пароль. Попробуйте снова.");
                            }
                        }
                    }
                }
            }

            if (!userFound) {
                System.out.println("Пользователь с таким именем не найден!");
            }
            return false;
        }
    }

}
