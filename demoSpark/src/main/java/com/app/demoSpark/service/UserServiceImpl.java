package com.app.demoSpark.service;

import com.app.demoSpark.models.User;
import com.app.demoSpark.models.UserBasicData;

import java.util.*;

/** The type User service. */
public class UserServiceImpl implements UserService {
    private static Map<String, User> users = new HashMap<String, User> ();

  /** Instantiates a new User service. */
  public UserServiceImpl() {

        users.put("101", new User("101","Pavan Solapure","Perez", Optional.ofNullable("pavan.solapure@gmail.com"), Optional.ofNullable ("https://bucket-mobilpymes.s3.amazonaws.com/img/a1.jpg"), new UserBasicData(1, "1","15126622","M",30)));
        users.put("102", new User("102","Aadya Solapure","Perez",Optional.ofNullable("aadya.solapure@gmail.com"), Optional.ofNullable ("https://bucket-mobilpymes.s3.amazonaws.com/img/a2.jpg"), new UserBasicData(2, "1","15126622","M",30)));
        users.put("103", new User("103","Aaarna Solapure","Perez", Optional.ofNullable("aarna.solapure@gmail.com"), Optional.ofNullable ("https://bucket-mobilpymes.s3.amazonaws.com/img/a3.jpg"), new UserBasicData(3, "1","15126622","M",30)));
        users.put("104", new User("104","Shilpa Solapure","Perez",Optional.ofNullable("shilpa.solapure@gmail.com"), Optional.ofNullable ("https://bucket-mobilpymes.s3.amazonaws.com/img/a4.jpg"), new UserBasicData(4, "1","15126622","M",30)));
        users.put("105", new User("105","Pavan Solapure","Perez", Optional.ofNullable("pavan.solapure@gmail.com"), Optional.ofNullable ("https://bucket-mobilpymes.s3.amazonaws.com/img/a5.jpg"), new UserBasicData(1, "1","15126622","M",30)));
        users.put("106", new User("106","Aadya Solapure","Perez",Optional.ofNullable("aadya.solapure@gmail.com"), Optional.ofNullable ("https://bucket-mobilpymes.s3.amazonaws.com/img/a6.jpg"), new UserBasicData(2, "1","15126622","M",30)));
        users.put("107", new User("107","Aaarna Solapure","Perez", Optional.ofNullable("aarna.solapure@gmail.com"), Optional.ofNullable ("https://bucket-mobilpymes.s3.amazonaws.com/img/a7.jpg"), new UserBasicData(3, "1","15126622","M",30)));
        users.put("108", new User("108","Shilpa Solapure","Perez",Optional.ofNullable("shilpa.solapure@gmail.com"), Optional.ofNullable ("https://bucket-mobilpymes.s3.amazonaws.com/img/a8.jpg"), new UserBasicData(4, "1","15126622","M",30)));

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
