package com.aries.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.aries.entitys.UserDO;
import com.aries.entitys.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserController {
    @Reference
    private UserService userService;

    @GetMapping("/list")
    public List<UserDO> list() {
        return userService.list();
    }

    @GetMapping("/insert")
    public Boolean insert() {
        UserDO userDO = new UserDO();
        userDO.setId(UUID.randomUUID().toString().replaceAll("-", ""));
        userDO.setAge(18);
        userDO.setDeleted(false);
        userDO.setName("Aries");
        return userService.insert(userDO);
    }

    @GetMapping("/{id}/get")
    public UserDO get(@PathVariable("id") String id) {
        return userService.get(id);
    }

}
