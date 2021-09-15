package com.farukyilmaz.spring.boot.rest.api.with.thymeleaf.controllers;

import com.farukyilmaz.spring.boot.rest.api.with.thymeleaf.models.User;
import com.farukyilmaz.spring.boot.rest.api.with.thymeleaf.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private final UserService userService;
    @Autowired
    public RestController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/api/users", method = RequestMethod.GET)
    public ArrayList<User> getUser() {
        return userService.getList();
    }

    @RequestMapping(value = "/api/user/{Id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable Long Id) {
        return userService.findById(Id);
    }

    @RequestMapping(value = "/api/user", method = RequestMethod.POST)
    public User setUser(@RequestBody User user) {
        return userService.save(user);
    }

    @RequestMapping(value = "/api/user", method = RequestMethod.PUT)
    public User updateUser(@RequestBody User user){
        return userService.save(user);
    }

    @RequestMapping(value = "/api/user/{Id}" ,method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable("Id") Long Id){
        try{
            User user = userService.findById(Id);
            userService.delete(user);
            return "User deleted successfully.";
        }
        catch (Exception e)
        {
            return "User doesn't exist!";
        }
    }
}