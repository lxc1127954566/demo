package com.cpy.userdboperation.controller;


import com.cpy.userdboperation.encapsulation.EncapUser;
import com.cpy.userdboperation.pojo.User;
import com.cpy.userdboperation.encapsulation.EncapPage;
import com.cpy.userdboperation.encapsulation.EncapPostPwd;
import com.cpy.userdboperation.service.UserService;
import com.cpy.userdboperation.encapsulation.ResultDTO;
import com.cpy.userdboperation.tool.PagerTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    //获取全体用户信息
    @GetMapping(value = "/pager")
    public ResultDTO pager(@Valid EncapPage encapPage){
        Long totalMeg = userService.returnCount(encapPage.getUserName());
        PagerTool tool = new PagerTool(totalMeg,encapPage.getPage(),encapPage.getRecordSize());       //使用页码工具类
        encapPage.setRecord(tool.getRecord());
        List<EncapUser> list= this.userService.selList(encapPage);
        return ResultDTO.successTotal(totalMeg,tool.getTotalPage()).add("getAll",list);
    }

    //根据id查询用户信息
    @GetMapping(value = "/getUById/{userId}")
    public ResultDTO getUById(@PathVariable("userId") Long userId){
        EncapUser user = this.userService.selUserById(userId);
        return ResultDTO.success().add("user",user);
    }

    //根据id删除用户
    @PostMapping(value = "/delUByUserId")
    public ResultDTO delUByUserId(@RequestParam("userId") Long userId){
        EncapUser user = this.userService.selUserById(userId);
        if(user != null){
            this.userService.updateStatus(userId);
            return ResultDTO.success();
        }else{
            return ResultDTO.errorWithCodeAndMsg(500,"用户不存在！");
        }
    }

    //更新用户信息
    @PostMapping (value = "/updUser")
    public ResultDTO updUser(@RequestBody @Valid User user){
        EncapUser EncapUser = this.userService.selUserById(user.getUserId());
        if(EncapUser != null) {
            this.userService.updataUser(user);
            return ResultDTO.success();
        }else {
            return ResultDTO.errorWithCodeAndMsg(500,"用户不存在！");
        }
    }

    //修改用户密码
    @PostMapping(value = "/postPwd")
    public ResultDTO postPwd(@RequestParam("userId") Long userId, @RequestParam("passWord") String passWord ){
        EncapUser user = this.userService.selUserById(userId);
        if(user != null) {
            EncapPostPwd postPwd = new EncapPostPwd(Long.valueOf(userId),passWord);
            this.userService.updataPassWord(postPwd);
            return ResultDTO.success();
        }else {
            return ResultDTO.errorWithCodeAndMsg(500,"用户不存在！");
        }

    }

    //增加用户
    @PostMapping(value = "/addUser")
    public ResultDTO addUser(@RequestBody @Valid User user){
        this.userService.insertUser(user);
        return ResultDTO.success();
    }

    /*
    //根据姓名 性别 出生年月查询用户信息
    @GetMapping(value = "/getUByNameSexBirthday")
    public List<User> getUByNameSexBirthday(HttpServletRequest request) throws ParseException {
        User user = new User();
        user.setUserName(request.getParameter("userName"));
        user.setSex(Integer.parseInt(request.getParameter("sex")));
        user.setBirthday(specificationDate(request.getParameter("birthday")));
        return this.userService.selUserByNameSexBirthday(user);
    }

    //根据出生地模糊查询用户信息
    @GetMapping(value = "/getUByBirthplace/{birthplace}")
    public List<User> getUByBirthplace(@PathVariable("birthplace") String birthplace){
        return this.userService.selUserByBirthplace(birthplace);
    }

    //根据现居地址模糊查询用户信息
    @GetMapping(value = "/getUByNowPlace/{nowPlace}")
    public List<User> getUByNowPlace(@PathVariable("nowPlace") String nowPlace){
        return this.userService.selUserByNowPlace(nowPlace);
    }

    //根据公司名查询用户信息
    @GetMapping(value = "/getUByCompany/{company}")
    public List<User> getUByCompany(@PathVariable("company") String company){
        return this.userService.selUserByCompany(company);
    }

    //根据学历查询用户信息
    @GetMapping(value = "/getUByAcademicCareer/{academicCareer}")
    public List<User> getUByAcademicCareer(@PathVariable("academicCareer") String academicCareer){
        return this.userService.selUserByAcademicCareer(academicCareer);
    }*/

}
