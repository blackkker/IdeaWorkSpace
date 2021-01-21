package com.itheima.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
public class User {

    private Integer id;
    private String username;
    private String password;
    private String name;

}
