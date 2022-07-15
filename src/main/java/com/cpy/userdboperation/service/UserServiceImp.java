package com.cpy.userdboperation.service;

import com.cpy.userdboperation.encapsulation.EncapUser;
import com.cpy.userdboperation.mapper.UserMapper;
import com.cpy.userdboperation.pojo.User;
import com.cpy.userdboperation.encapsulation.EncapPage;
import com.cpy.userdboperation.encapsulation.EncapPostPwd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    UserMapper userMapper;

    List<EncapUser> list;


    @Override
    public Long returnCount(String userName){
        Long count = userMapper.returnCount(userName);
        System.out.println("总用户信息条数："+count);
        return count;
    }

    @Override
    public List<EncapUser> selList(EncapPage encapPage) {
        list = userMapper.selList(encapPage);
        return list;
    }

    @Override
    public EncapUser selUserById(Long userId) {
        System.out.println("根据id查询到的用户："+userMapper.selUserById(userId));
        return userMapper.selUserById(userId);
    }


    @Override
    public void updataUser(User user) {
        userMapper.updataUser(user);
        System.out.println("用户信息更新成功");
    }

    @Override
    public void updataPassWord(EncapPostPwd postPwd) {
        userMapper.updataPassWord(postPwd);
        System.out.println("用户密码修改成功");
    }

    @Override
    public void updateStatus(Long status) {
        userMapper.updateStatus(status);
        System.out.println("用户删除成功");
    }

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
        System.out.println("用户信息成功增加");
    }

    /*


    @Override
    public void delUserById(Long userId) {
        userMapper.delUserById(userId);
        System.out.println("用户信息删除成功！");
    }

    @Override
    public List<User> selUserByNameSexBirthday(User user) {
        list = userMapper.selUserByNameSexBirthday(user);
        if (list != null) {
            list.forEach(e->System.out.println(e.toString()));
        }else{
            System.out.println("未查询到结果");
        }
        return userMapper.selUserByNameSexBirthday(user);
    }

    @Override
    public List<User> selUserByBirthplace(String birthplace) {
        list = userMapper.selUserByBirthplace(birthplace);
        if (list != null) {
            list.forEach(e->System.out.println(e.toString()));
        }else{
            System.out.println("未查询到结果");
        }
        return userMapper.selUserByBirthplace(birthplace);
    }

    @Override
    public List<User> selUserByNowPlace(String nowPlace) {
        list = userMapper.selUserByNowPlace(nowPlace);
        if (list != null) {
            list.forEach(e->System.out.println(e.toString()));
        }else{
            System.out.println("未查询到结果");
        }
        return userMapper.selUserByNowPlace(nowPlace);
    }

    @Override
    public List<User> selUserByCompany(String company) {
        list = userMapper.selUserByCompany(company);
        if (list != null) {
            list.forEach(e->System.out.println(e.toString()));
        }else{
            System.out.println("未查询到结果");
        }
        return userMapper.selUserByCompany(company);
    }

    @Override
    public List<User> selUserByAcademicCareer(String academicCareer) {
        list = userMapper.selUserByAcademicCareer(academicCareer);
        if (list != null) {
            list.forEach(e->System.out.println(e.toString()));
        }else{
            System.out.println("未查询到结果");
        }
        return userMapper.selUserByAcademicCareer(academicCareer);
    }*/

}
