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

    }
}
