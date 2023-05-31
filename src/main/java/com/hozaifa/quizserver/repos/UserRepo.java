package com.hozaifa.quizserver.repos;

import com.hozaifa.quizserver.models.User;
import com.hozaifa.quizserver.models.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public interface UserRepo extends JpaRepository<User,Long> {

    User findByUserName(String userName);
    void deleteById(Long id);


}
