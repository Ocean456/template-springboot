package org.example.demo.service.impl;

import jakarta.annotation.Resource;
import org.example.demo.mapper.UserMapper;
import org.example.demo.model.User;
import org.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.selectList(null);
    }

    @Override
    public Boolean addUser(User user) {
        return userMapper.insert(user) > 0;
    }

    @Override
    public Boolean updateUser(User user) {
        return userMapper.updateById(user) > 0;
    }

    @Override
    public Boolean deleteUser(Integer id) {
        return userMapper.deleteById(id) > 0;
    }
}
