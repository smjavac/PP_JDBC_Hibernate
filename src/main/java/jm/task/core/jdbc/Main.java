package jm.task.core.jdbc;


import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        UserService userServiceHiberImpl = new UserServiceImpl();
        userServiceHiberImpl.createUsersTable();

        userServiceHiberImpl.saveUser("Volodya", "Volodin", (byte) 55);
        userServiceHiberImpl.saveUser("Valera", "Valerin", (byte) 51 );
        userServiceHiberImpl.saveUser("Bogdan", "Bogdanov", (byte) 53);
        userServiceHiberImpl.saveUser("Vasiliy", "Vasiliyev", (byte) 54);

        userServiceHiberImpl.removeUserById(1);
        userServiceHiberImpl.getAllUsers().stream().forEach(System.out::println);
        userServiceHiberImpl.cleanUsersTable();
        userServiceHiberImpl.dropUsersTable();

    }
}
