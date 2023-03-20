package com.developer.service;

import com.developer.dto.UserDto;
import com.developer.model.UserModel;

public interface UserService {

  UserModel getUserById(Long id);
}
