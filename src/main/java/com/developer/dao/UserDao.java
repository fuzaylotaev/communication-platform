package com.developer.dao;

import com.developer.model.UserModel;

public interface UserDao {

  UserModel getUserById(Long id);
}
