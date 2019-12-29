package me.xuhu.demo.sharding.controller;

import me.xuhu.demo.sharding.entity.UserInfo;
import me.xuhu.demo.sharding.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
@RestController
public class UserInfoController {

    @Autowired
    private UserInfoMapper userInfoMapper;



    @GetMapping("get/{id}")
    public UserInfo getById(@PathVariable("id") Long id) {
        return userInfoMapper.selectById(id);
    }

    @GetMapping("add/{id}/{name}/{age}")
    public Long addUser(@PathVariable("id") Long id, @PathVariable("name") String name, @PathVariable("age") Integer age) {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(id);
        userInfo.setUserName(name);
        userInfo.setAge(age);

        userInfoMapper.insert(userInfo);
        return userInfo.getId();
    }


}
