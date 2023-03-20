package com.developer.dao.impl;

import com.developer.dao.UserDao;
import com.developer.model.UserModel;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DefaultUserDao implements UserDao {

  private final JdbcTemplate jdbcTemplate;

  public DefaultUserDao(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  @Override
  public UserModel getUserById(Long id) {
    String sql = "SELECT * FROM public.user WHERE id = ?";
    return jdbcTemplate.queryForObject(sql, new Object[]{id}, (rs, rowNum) -> {
      UserModel userModel = new UserModel();
      userModel.setId(rs.getLong("id"));
      userModel.setFirstName(rs.getString("first_name"));
      userModel.setLastName(rs.getString("last_name"));
      userModel.setEmail(rs.getString("email"));
      userModel.setAge(rs.getInt("age"));
      return userModel;
    });
  }
}
