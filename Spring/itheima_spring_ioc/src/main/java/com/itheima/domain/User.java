package com.itheima.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class User {

    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String addr;

}
