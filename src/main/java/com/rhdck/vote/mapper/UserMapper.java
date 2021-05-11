package com.rhdck.vote.mapper;

import com.rhdck.vote.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {
    public List<User> getAllUser();
    public User login(Map<String, String> map);
}
