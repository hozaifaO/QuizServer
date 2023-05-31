package com.hozaifa.quizserver.services;

import com.hozaifa.quizserver.models.User;
import com.hozaifa.quizserver.models.UserRole;


import java.util.Set;

public interface UserService {
    User createUser(User user, Set<UserRole> userRoles) throws Exception;
    User getUser(String userName);

    void deleteUser(Long id);


}
