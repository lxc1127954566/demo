package com.cpy.userdboperation.encapsulation;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter

//封装用户日常信息
public class EncapUser {

    private String userName;
    private Integer sex;
    private Date birthday;
    private String passWord;
    private String numberId;
    private String mobilePhone;
    private String email;
    private String qq;
    private String weChat;
    private String academicCareer;      //学历
    private String birthplace;
    private String nowPlace;            //现居地址
    private String company;
    private String note;


    public EncapUser() {
    }

    public EncapUser(String userName, Integer sex, Date birthday, String numberId, String mobilePhone, String email, String qq, String weChat, String academicCareer, String birthplace, String nowPlace, String company, String note) {
        this.userName = userName;
        this.sex = sex;
        this.birthday = birthday;
        this.numberId = numberId;
        this.mobilePhone = mobilePhone;
        this.email = email;
        this.qq = qq;
        this.weChat = weChat;
        this.academicCareer = academicCareer;
        this.birthplace = birthplace;
        this.nowPlace = nowPlace;
        this.company = company;
        this.note = note;
    }

    @Override
    public String toString() {
        return "EncapUser{" +
                "userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", numberId=" + numberId +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", email='" + email + '\'' +
                ", qq='" + qq + '\'' +
                ", weChat='" + weChat + '\'' +
                ", academicCareer='" + academicCareer + '\'' +
                ", birthplace='" + birthplace + '\'' +
                ", nowPlace='" + nowPlace + '\'' +
                ", company='" + company + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}