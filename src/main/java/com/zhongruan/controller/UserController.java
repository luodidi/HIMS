package com.zhongruan.controller;

import com.zhongruan.bean.UserInfo;
import com.zhongruan.service.IuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    public IuserService userService;

    //do是请求说明
    @RequestMapping("/findAll.do")
    public ModelAndView findAll() {
        List<UserInfo> all = userService.findAll();
        ModelAndView mv = new ModelAndView();
        mv.addObject("userinfos", all);
        mv.setViewName("allUser");
        return mv;

    }
/*
    @RequestMapping("/toAddUser.do")
    public String addUser(){
        return "addUser";
    }

//do是请求说明
    @RequestMapping("/save.do")
   public String addUser(UserInfo userInfo){
        userService.adduser(userInfo);
        return "redirect:findAll.do";
    }
*/

    @RequestMapping("/delete.do")
    public String delete(int id){
        userService.delete(id);
        return "redirect:findAll.do";
    }


    @RequestMapping("toAddUser")
    public String toAddUser() {
        return "addUser";
    }

    @RequestMapping("/AddUser.do")
    public String addPaper(UserInfo userInfo) {
        userService.adduser(userInfo);
        return "redirect:findAll.do";
    }

    @RequestMapping("/toUpdate")
    public String toUpdatePaper(Model model, int id) {
        model.addAttribute("userInfo", userService.queryById(id));
        return "updateUser";
    }

    @RequestMapping("/update.do")
    public String update(Model model,UserInfo userInfo) {
        userService.update(userInfo);
        userInfo = userService.queryById(userInfo.getId());
        model.addAttribute("userInfo", userInfo);
        return "redirect:findAll.do";
    }


}