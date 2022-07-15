package com.cpy.userdboperation.pojo;


import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Data
public class User {

    @NotNull(message = "用户id不能为空")
    private Long userId;
    private String userName;
    private Integer sex;
    private Date birthday;
    private String passWord;
    private String mobilePhone;
    private String numberId;
    @Email(message = "邮箱格式有误")
    private String email;
    private String qq;
    private String weChat;
    private String academicCareer;      //学历
    private String birthplace;
    private String nowPlace;            //现居地址
    private String company;
    private String note;
    private Date createDate;
    private Date updateDate;
    private Integer status;


    public User() {
    }

    public User(Long userId, String userName, Integer sex, Date birthday, String passWord, String numberId, String mobilePhone, String email, String qq, String weChat, String academicCareer, String birthplace, String nowPlace, String company, String note, Date createDate, Date updateDate, Integer status) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.birthday = birthday;
        this.passWord = passWord;
        this.mobilePhone = mobilePhone;
        this.email = email;
        this.qq = qq;
        this.weChat = weChat;
        this.academicCareer = academicCareer;
        this.birthplace = birthplace;
        this.nowPlace = nowPlace;
        this.company = company;
        this.note = note;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.status = status;
    }



    public User(Long userId, String passWord) {
        this.userId = userId;
        this.passWord = passWord;
        new User(userId,null,null,null,passWord,null,null,null,null,null,null,null,null,null,null,null,null,null);
    }


}

