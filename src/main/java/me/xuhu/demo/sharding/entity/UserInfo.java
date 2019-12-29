package me.xuhu.demo.sharding.entity;

import lombok.Data;

import java.util.Date;

@Data
public class UserInfo {
    private Long id;
    private Integer age;
    private String userName;
    private Date createDate;
    private Date updateDate;
}
