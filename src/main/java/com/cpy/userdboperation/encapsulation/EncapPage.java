package com.cpy.userdboperation.encapsulation;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/*
*
* 封装页码、步长、用户名 用于查询
*
* */

@Getter
@Setter
public class EncapPage {

    @NotNull(message = "页码不能为空")
    @Min(1)
    private Long page;

    @Min(1)
    private Long record;

    @NotNull(message = "步长不能为空")
    @Min(1)
    @Max(50)
    private Integer recordSize;

    private String userName;

    public EncapPage(){

    }

    public EncapPage(Long page, Integer recordSize, String userName) {
        this.page = page;
        this.recordSize = recordSize;
        this.userName = userName;
    }
}

