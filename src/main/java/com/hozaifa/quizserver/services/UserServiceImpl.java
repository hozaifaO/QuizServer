package com.hozaifa.quizserver.services;

import com.hozaifa.quizserver.models.User;
import com.hozaifa.quizserver.models.UserRole;
import com.hozaifa.quizserver.repos.RoleRepo;
import com.hozaifa.quizserver.repos.UserRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;
import java.util.Set;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private RoleRepo roleRepo;

    //Creating User
    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {
        User local = this.userRepo.findByUserName(user.getUserName());
        if(local!=null){
            System.out.println("User Already Exists");
            throw new Exception("User Already Present");
        }else{
            for(UserRole ur :userRoles){
                this.roleRepo.save(ur.getRole());
            }
            user.getUserRoles().addAll(userRoles);
            local = this.userRepo.save(user);
        }
        return local;
    }

    @Override
    public User getUser(String userName) {
        return this.userRepo.findByUserName(userName);
    }

    @Override
    public void deleteUser(Long id) {
        this.userRepo.deleteById(id);
    }

}
