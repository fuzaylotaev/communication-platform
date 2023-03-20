package com.developer.facade;

import com.developer.dto.UserDto;

public interface UserFacade {

  UserDto getUserById(Long id);
}
