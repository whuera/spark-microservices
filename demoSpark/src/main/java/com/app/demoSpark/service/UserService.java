package com.app.demoSpark.service;

import com.app.demoSpark.models.User;

import java.util.List;

public interface UserService {
    public void addUSer(User user);

    public void editUser(User user);

    public User getUserById(String id);

    public void deleteUserById(String id);

    public List<User> getUsers();
}
