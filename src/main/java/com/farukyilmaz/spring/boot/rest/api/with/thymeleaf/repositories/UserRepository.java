package com.farukyilmaz.spring.boot.rest.api.with.thymeleaf.repositories;

import com.farukyilmaz.spring.boot.rest.api.with.thymeleaf.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long>{
}
