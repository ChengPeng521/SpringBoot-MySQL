package com.cp.service.impl;

import com.cp.mapper.UserMapper;
import com.cp.pojo.User;
import com.cp.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    //业务
    @Override
    public List<User> selectAll() {

        List<User> list = userMapper.selectAll();
        for (User user : list) {
            user.setName("cp-"+user.getName());
        }
        return list;

    }

    @Override
    public void deleteById(Integer id) {
        userMapper.deleteById(id);
    }

    @Override
    public void add(User user) {
        userMapper.add(user);
    }

    @Override
    public User selectById(Integer id) {
        return userMapper.selectById(id);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public User login(String name, String password) {
        return userMapper.login(name, password);
    }


}
