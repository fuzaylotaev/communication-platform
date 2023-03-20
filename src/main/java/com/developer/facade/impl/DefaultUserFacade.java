package com.developer.facade.impl;

import com.developer.converter.Converter;
import com.developer.dto.UserDto;
import com.developer.facade.UserFacade;
import com.developer.model.UserModel;
import com.developer.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class DefaultUserFacade implements UserFacade {

  private final UserService userService;
  private final Converter<UserModel, UserDto> userDtoConverter;

  public DefaultUserFacade(UserService userService, Converter<UserModel, UserDto> userDtoConverter) {
    this.userService = userService;
    this.userDtoConverter = userDtoConverter;
  }

  @Override
  public UserDto getUserById(Long id) {
    UserModel userModel = userService.getUserById(id);
    return userDtoConverter.convert(userModel);
  }
}
