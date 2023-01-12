package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Yegor", "Surname1", (byte) 1);
        User user2 = new User("Ivan", "Surname2", (byte) 2);
        User user3 = new User("Sasha", "Surname3", (byte) 3);
        User user4 = new User("Petya", "Surname4", (byte) 4);
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser(user1.getName(), user1.getLastName(), user1.getAge());
        System.out.println("User с именем - " + user1.getName() + " добавлен в БД");

        userService.saveUser(user2.getName(), user2.getLastName(), user2.getAge());
        System.out.println("User с именем - " + user2.getName() + " добавлен в БД");

        userService.saveUser(user3.getName(), user3.getLastName(), user3.getAge());
        System.out.println("User с именем - " + user3.getName() + " добавлен в БД");

        userService.saveUser(user4.getName(), user4.getLastName(), user4.getAge());
        System.out.println("User с именем - " + user4.getName() + " добавлен в БД");

        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}
