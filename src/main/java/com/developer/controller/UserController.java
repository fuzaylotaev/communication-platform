package com.developer.controller;

import com.developer.dto.UserDto;
import com.developer.facade.UserFacade;
import com.developer.mapper.Mapper;
import com.developer.wsdto.UserWsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

  private final UserFacade userFacade;
  private final Mapper<UserDto, UserWsDto> userWsDtoMapper;

  @Autowired
  public UserController(UserFacade userFacade, Mapper<UserDto, UserWsDto> userWsDtoMapper) {
    this.userFacade = userFacade;
    this.userWsDtoMapper = userWsDtoMapper;
  }

  @GetMapping("/{id}")
  public UserWsDto getUser(@PathVariable(name = "id") Long id) {
    UserDto userDto = userFacade.getUserById(id);
    return userWsDtoMapper.map(userDto);
  }
}
