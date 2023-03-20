package com.developer.converter;

import com.developer.dto.UserDto;
import com.developer.model.UserModel;
import org.springframework.stereotype.Component;

@Component("userDtoConverter")
public class UserDtoConverter implements Converter<UserModel, UserDto> {

  @Override
  public UserDto convert(UserModel source) {
    UserDto target = new UserDto();
    target.setId(source.getId());
    target.setFirstName(source.getFirstName());
    target.setLastName(source.getLastName());
    target.setAge(source.getAge());
    target.setEmail(source.getEmail());
    return target;
  }
}
