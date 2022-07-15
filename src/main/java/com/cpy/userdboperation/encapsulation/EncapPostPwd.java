package com.cpy.userdboperation.encapsulation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/*
*
* 封装账号密码
*
* */
@Getter
@Setter
@AllArgsConstructor
public class EncapPostPwd {

    private Long userId;
    private String passWord;
}
