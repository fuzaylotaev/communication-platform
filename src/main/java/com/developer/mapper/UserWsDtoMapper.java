package com.developer.mapper;

import com.developer.dto.UserDto;
import com.developer.wsdto.UserWsDto;
import org.springframework.stereotype.Component;

@Component("userWsDtoMapper")
public class UserWsDtoMapper implements Mapper<UserDto, UserWsDto> {

  @Override
  public UserWsDto map(UserDto userDto) {
    UserWsDto userWsDto = new UserWsDto();
    userWsDto.setId(userDto.getId());
    userWsDto.setEmail(userDto.getEmail());
    userWsDto.setAge(userDto.getAge());
    userWsDto.setFirstName(userDto.getFirstName());
    userWsDto.setLastName(userDto.getLastName());
    return userWsDto;
  }
}
