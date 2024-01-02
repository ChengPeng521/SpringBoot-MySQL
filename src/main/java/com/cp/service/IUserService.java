package com.cp.service;

import com.cp.pojo.User;

import java.util.List;

public interface IUserService {
    List<User> selectAll();

    void deleteById(Integer id);

    void add(User user);

    User selectById(Integer id);

    void update(User user);

    User login(String name, String password);
}
