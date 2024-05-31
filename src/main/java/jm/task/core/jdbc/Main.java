package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь JDBC
//        UserService userService = new UserServiceImpl();
//        userService.createUsersTable();
//        userService.saveUser("Name1", "LastName1", (byte) 20);
//        userService.saveUser("Name2", "LastName2", (byte) 25);
//        userService.saveUser("Name3", "LastName3", (byte) 31);
//        userService.saveUser("Name4", "LastName4", (byte) 38);
//
//        userService.removeUserById(1);
//        List<User> userArrayList = userService.getAllUsers();
//        for (User u: userArrayList) {
//            System.out.println(u);
//        }
//        userService.cleanUsersTable();

        // -----------------HIBERNATE
        UserService userServiceHiberImpl = new UserServiceImpl();
        userServiceHiberImpl.createUsersTable();

        userServiceHiberImpl.saveUser("Volodya", "Volodin", (byte) 55);
        userServiceHiberImpl.saveUser("Valera", "Valerin", (byte) 51 );
        userServiceHiberImpl.saveUser("Bogdan", "Bogdanov", (byte) 53);
        userServiceHiberImpl.saveUser("Vasiliy", "Vasiliyev", (byte) 54);

        userServiceHiberImpl.removeUserById(1);
        userServiceHiberImpl.getAllUsers().stream().forEach(System.out::println);         userServiceHiberImpl.cleanUsersTable();
        userServiceHiberImpl.dropUsersTable();

    }
}
