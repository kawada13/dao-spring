package com.example.doma.practice.searvice;

import com.example.doma.practice.dao.UserDao;
import com.example.doma.practice.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService {
  private final UserDao userDao;

  public List<User> getUsers() {
    return userDao.selectAll();
  }
}
