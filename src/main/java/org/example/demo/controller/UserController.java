package org.example.demo.controller;

import jakarta.annotation.Resource;
import org.example.demo.model.User;
import org.example.demo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/all")
    public ResponseEntity<List<User>> getAllUser() {
        return ResponseEntity.ok(userService.getAllUser());
    }

    @PostMapping("/add")
    public ResponseEntity<Boolean> addUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.addUser(user));
    }

    @PutMapping("/update")
    public ResponseEntity<Boolean> updateUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.updateUser(user));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Boolean> deleteUser(@RequestParam Integer id) {
        return ResponseEntity.ok(userService.deleteUser(id));
    }



}
