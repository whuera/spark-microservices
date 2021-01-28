package com.app.demoSpark.service;

import com.app.demoSpark.models.User;

import java.util.List;

/**
 * Interface for UserService
 */
public interface UserService {
    /**
     *
     * @param user
     */
    public void addUSer(User user);

    /**
     *
     * @param user
     */
    public void editUser(User user);

    /**
     *
     * @param id
     * @return
     */
    public User getUserById(String id);

    /**
     *
     * @param id
     */
    public void deleteUserById(String id);

    /**
     *
     * @return
     */
    public List<User> getUsers();
}
