package com.example.doma.practice.controller;

import com.example.doma.practice.searvice.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
  private final UserService userService;

  @RequestMapping(value = "/selectAll/")
  private List all() {
    return userService.getUsers();
  }
}
