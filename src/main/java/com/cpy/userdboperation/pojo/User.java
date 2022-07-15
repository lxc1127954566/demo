package com.cpy.userdboperation.pojo;


import lombok.Data;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

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

    public String getNumberId() {
        return numberId;
    }

    public void setNumberId(String numberId) {
        this.numberId = numberId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWeChat() {
        return weChat;
    }

    public void setWeChat(String weChat) {
        this.weChat = weChat;
    }

    public String getAcademicCareer() {
        return academicCareer;
    }

    public void setAcademicCareer(String academicCareer) {
        this.academicCareer = academicCareer;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getNowPlace() {
        return nowPlace;
    }

    public void setNowPlace(String nowPlace) {
        this.nowPlace = nowPlace;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
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

