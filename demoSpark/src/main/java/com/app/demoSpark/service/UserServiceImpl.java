package com.app.demoSpark.service;

import com.app.demoSpark.models.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserServiceImpl implements UserService{
    private static Map<String, User> users = new HashMap<String, User> ();

    public UserServiceImpl(){
        users.put("101", new User("101","Pavan Solapure","Perez", "pavan.solapure@gmail.com"));
        users.put("102", new User("102","Aadya Solapure","Perez","aadya.solapure@gmail.com"));
        users.put("103", new User("103","Aaarna Solapure","Perez", "aarna.solapure@gmail.com"));
        users.put("104", new User("104","Shilpa Solapure","Perez","shilpa.solapure@gmail.com"));
    }

    @Override
    public void addUSer (User user) {
        users.put(user.getId(), user);
    }

    @Override
    public void editUser (User user) {
        users.replace(user.getId(), user);
    }

    @Override
    public User getUserById (String id) {
        return users.get(id);
    }

    @Override
    public void deleteUserById (String id) {
        users.remove(id);
    }

    @Override
    public List<User> getUsers () {
        return new ArrayList<User> (users.values());
    }
}
