package net.geeksbox.demo.restfulspringboot.service;

import net.geeksbox.demo.restfulspringboot.model.User;

import java.util.List;

public interface UserService {
    User findUser(Integer id);
    List<User> findAll();
    User save(User user);
    User update(User user);
    void delete(User user);
}
