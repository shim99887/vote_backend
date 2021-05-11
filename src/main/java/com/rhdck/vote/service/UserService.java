package com.rhdck.vote.service;

import com.rhdck.vote.dto.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    public List<User> getAllUser();
    public User login(Map<String, String> map);
}
