package com.cpy.userdboperation.service;


import com.cpy.userdboperation.encapsulation.EncapUser;
import com.cpy.userdboperation.pojo.User;
import com.cpy.userdboperation.encapsulation.EncapPage;
import com.cpy.userdboperation.encapsulation.EncapPostPwd;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserService {

    //查询记录条数
    Long returnCount(String userName);

    //查询用户列表
    List<EncapUser> selList(EncapPage encapPage);

    //根据id查询用户信息
    EncapUser selUserById(Long userId);

    //更新用户信息
    void updataUser( User user);

    //修改用户密码
    void updataPassWord(EncapPostPwd postPwd);

    //修改用户状态进行删除
    void updateStatus(Long userId);

    //增加用户
    void insertUser(User user);

/*

    //根据用户id删除用户
    void delUserById(Long userId);

    //根据姓名 性别 出生年月查询用户信息
    List<User> selUserByNameSexBirthday(User user);

    //根据出生地模糊查询用户信息
    List<User> selUserByBirthplace(String birthplace);

    //根据List<Map<String,User信息
    List<User> selUserByNowPlace(String nowPlace);

    //根据公司名查询用户信息
    List<User> selUserByCompany(String company);

    //根据学历查询用户信息
    List<User> selUserByAcademicCareer(String academicCareer);*/

}
