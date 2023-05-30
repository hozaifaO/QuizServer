package com.hozaifa.quizserver;

import com.hozaifa.quizserver.models.Role;
import com.hozaifa.quizserver.models.User;
import com.hozaifa.quizserver.models.UserRole;
import com.hozaifa.quizserver.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@SpringBootApplication
public class QuizServerApplication implements CommandLineRunner {

    @Autowired
    private UserService userService;
    public static void main(String[] args) {
        SpringApplication.run(QuizServerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Starting Test Code");
        /*
        User user = new User();
        user.setUserName("howaisi");
        user.setFirstName("Hozaifa");
        user.setLastName("Owaisi");
        user.setProfile("default.png");
        user.setEmail("email@email.com");
        user.setPassword("test");
        user.setPhone("1234567890");

        Role role1 = new Role();
        role1.setRoleId(44L);
        role1.setRoleName("ADMIN");

        Set<UserRole> userRoles = new HashSet<>();
        UserRole userRole = new UserRole();
        userRole.setRole(role1);
        userRole.setUser(user);

        userRoles.add(userRole);

        this.userService.createUser(user,userRoles);
        */
    }
}
