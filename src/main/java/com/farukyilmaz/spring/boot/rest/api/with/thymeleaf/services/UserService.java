package com.farukyilmaz.spring.boot.rest.api.with.thymeleaf.services;

import com.farukyilmaz.spring.boot.rest.api.with.thymeleaf.models.User;
import java.util.ArrayList;

public interface UserService {
    ArrayList<User> getList();
    User findById(Long Id);
    User save (User p);
    void delete(User p);
}
