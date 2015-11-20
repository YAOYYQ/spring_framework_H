package com.yao.controller;

import com.yao.dao.IUserDao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import com.yao.entity.user;
/**
 * Created by YAO on 15/11/19.
 */
@Controller
@RequestMapping("/view")
public class IndexController {

    @Resource
    private IUserDao userdao;

    @RequestMapping("/helloworld.do")
    public String  helloworld(Model model){
       model.addAttribute("test","helloworld!");
       return "index";
    }

    @RequestMapping("/testjson.json")
    @ResponseBody
    public Map json(){
        Map map=new HashMap();
        map.put("test","helloworld");
        return map;
    }

    @RequestMapping("/add.do")
    public String add(Model model){
       user u=new user();
        u.setUsername("test");
        u.setPassword("123456");
        u.setSex("man");
        userdao.save(u);
        model.addAttribute("test","add success");
        return "index";
    }

    @RequestMapping("/remove.do")
    public String remove(Long id,Model model){
        userdao.delete(id);
        model.addAttribute("test","remove success");
        return "index";
    }
}
