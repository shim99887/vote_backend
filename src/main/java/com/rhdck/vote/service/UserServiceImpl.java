package com.rhdck.vote.service;

import com.rhdck.vote.dto.User;
import com.rhdck.vote.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper dao;
    @Override
    public List<User> getAllUser() {
        return dao.getAllUser();
    }

    @Override
    public User login(Map<String, String> map) {
        return dao.login(map);
    }
}
