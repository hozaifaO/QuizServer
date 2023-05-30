package com.hozaifa.quizserver.repos;

import com.hozaifa.quizserver.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {

    User findByUserName(String userName);
}
