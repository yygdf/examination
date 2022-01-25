package cn.ksling.examination.entity;

import lombok.Data;

@Data
public class User {
    private Integer id;

    private String username;

    private String password;

    private Integer role;

    private Integer status;
}