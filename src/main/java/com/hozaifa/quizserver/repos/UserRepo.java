package com.hozaifa.quizserver.repos;

import com.hozaifa.quizserver.models.User;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Set;

public interface UserRepo extends JpaRepository<User,Long> {

    User findByUserName(String userName);
    void deleteById(Long id);


}
