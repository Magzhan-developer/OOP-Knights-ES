package codeBlock.src.handlers;

import codeBlock.src.model.User;

import java.util.Scanner;
import java.util.Vector;

public class RegistrationHandler {
    public static boolean registerUser(Vector<Object> users){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вы перешли в блок регистрации");
        System.out.print("Введите имя пользователя:");
        String usernameRegistration = scanner.nextLine();

        String passwordRegistration;
        String passwordRegistrationRepeat;

        while (true) {
            System.out.print("Введите пароль:");
            passwordRegistration = scanner.nextLine();
            System.out.print("Повторите пароль:");
            passwordRegistrationRepeat = scanner.nextLine();

            if (passwordRegistrationRepeat.equals(passwordRegistration)) {
                users.add(new User(usernameRegistration, passwordRegistration));
                System.out.println("Вы успешно зарегистрировались");
                return true;
            } else {
                System.out.println("Введенные пароли не совпадают. Попробуйте снова.");
            }
        }

    }

}
