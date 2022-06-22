package com.example.doma.practice.dao;

import com.example.doma.practice.entity.User;
import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import java.util.List;

@ConfigAutowireable
@Dao
public interface UserDao {
  @Select
  List<User> selectAll();
}
