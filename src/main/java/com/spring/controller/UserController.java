package com.spring.controller;
//package webmvc.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import webmvc.dto.User;
//import webmvc.mapper.UserMapper;
//import webmvc.service.UserService;
//
//@Controller
//public class UserController {
//
//  @Autowired
//  private UserMapper userMapper;
//
//  @Autowired
//  private UserService userService;
//
//  @RequestMapping(value = "/user/edit.do", method = RequestMethod.GET)
//  public String edit(@RequestParam("id") int id, Model model) {
//    User user = userMapper.findById(id);
//    model.addAttribute("user", user);
//    return "user/edit";
//  }
//
//  @RequestMapping(value = "/user/edit.do", method = RequestMethod.POST)
//  public String edit(User user, Model model) {
//    String message = userService.validateBeforeUpdate(user);
//    if (message == null) {
//      userMapper.update(user);
//      model.addAttribute("success", "저장했습니다.");
//    }
//    else model.addAttribute("error", message);
//    return "user/edit";
//  }
//
//}
