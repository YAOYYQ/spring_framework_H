package com.yao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by YAO on 15/11/19.
 */
@Controller
@RequestMapping("/view")
public class IndexController {
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
}
