package com.hozaifa.quizserver;

import com.hozaifa.quizserver.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;


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
