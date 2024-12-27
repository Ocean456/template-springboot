package org.example.demo.service;

import org.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> getAllUser();

    Boolean addUser(User user);

    Boolean updateUser(User user);

    Boolean deleteUser(Integer id);
}
