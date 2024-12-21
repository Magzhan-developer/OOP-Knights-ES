package codeBlock.src.model;
import codeBlock.src.enums.roles;
import codeBlock.src.service.BasicNeedsService;

import java.time.LocalTime;
import java.util.Iterator;

public class MainPage implements BasicNeedsService {
    public static LocalTime currentTime = LocalTime.now();
    public int currentHour = currentTime.getHour();
    public String greetingTimeText;
    public MainPage(){
        if (currentHour >= 6 && currentHour < 12) {
            greetingTimeText = "Доброе утро";
        } else if (currentHour >= 12 && currentHour < 18) {
            greetingTimeText = "Добрый день";
        } else if (currentHour >= 18 && currentHour < 22) {
            greetingTimeText = "Добрый вечер";
        } else {
            greetingTimeText = "Доброй ночи";
        }
    }

    public void onInitMethod(User user) {
        if (user.getUserRole() == roles.USER) {
            System.out.println("Ваша учетная запись пока что не активирована администратором!Просим обратиться в тех-поддержку");
        } else {
            System.out.println(greetingTimeText + " " + user.getUsername());
            System.out.println("Вам доступны следующие разделы:");
            Iterator<String> permissionsIterator = getAllowedModulesByRole(user.getUserRole()).iterator();
            while(permissionsIterator.hasNext()){
                System.out.print(permissionsIterator.next() + ',');
            }
        }
    }
}
