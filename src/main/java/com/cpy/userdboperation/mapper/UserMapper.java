package com.cpy.userdboperation.mapper;

import com.cpy.userdboperation.encapsulation.EncapUser;
import com.cpy.userdboperation.pojo.User;
import com.cpy.userdboperation.encapsulation.EncapPage;
import com.cpy.userdboperation.encapsulation.EncapPostPwd;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface UserMapper {

    //查询记录条数
    Long returnCount(@Param("userName") String userName);

    //查询用户列表s
    List<EncapUser> selList(EncapPage encapPage);

    //根据id查询用户信息
    EncapUser selUserById(@Param("userId") Long userId);

    //更新用户信息
    void updataUser(User user);

    //修改用户密码
    void updataPassWord(EncapPostPwd postPwd);

    //更改用户状态
    void updateStatus(@Param("userId") Long userId);

    //增加用户
    void insertUser(User user);


    /*


    //根据用户id删除用户
    void delUserById(@Param("userId") Long userId);

    //根据姓名 性别 出生年月查询用户信息
    List<User> selUserByNameSexBirthday(User user);

    //根据出生地模糊查询用户信息
    List<User> selUserByBirthplace(@Param("birthplace") String birthplace);

    //根据现居地址模糊查询用户信息
    List<User> selUserByNowPlace(@Param("nowPlace") String nowPlace);

    //根据公司名查询用户信息
    List<User> selUserByCompany(@Param("company") String company);

    //根据学历查询用户信息
    List<User> selUserByAcademicCareer(@Param("academicCareer") String academicCareer);*/
}
