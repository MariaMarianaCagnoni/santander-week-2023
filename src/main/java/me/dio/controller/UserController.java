package me.dio.controller;

import me.dio.domain.User;
import me.dio.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author mariana
 * @Project: santander-week-2023
 */

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        var user = userService.findById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<User> createUser(@RequestBody User user) {
        var userCreated = userService.save(user);
        return new ResponseEntity<>(userCreated, HttpStatus.CREATED);
    }


    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        var allUsers = userService.findAll();
        return new ResponseEntity<>(allUsers, HttpStatus.OK);
    }

}
