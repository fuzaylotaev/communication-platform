package com.developer.service.impl;

import com.developer.dao.UserDao;
import com.developer.model.UserModel;
import com.developer.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class DefaultUserService implements UserService {

  private final UserDao userDao;

  public DefaultUserService(UserDao userDao) {
    this.userDao = userDao;
  }

  @Override
  public UserModel getUserById(Long id) {
    if (id == null || id < 0) {
      throw new IllegalArgumentException("id cannot be null or less than zero");
    }
    return userDao.getUserById(id);
  }
}
