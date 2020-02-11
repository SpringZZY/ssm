package com.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.main.server.testInterfaceServer;

@RestController
@RequestMapping(path = "/server")
public class ServerController {

    @Autowired
    testInterfaceServer testInterfaceServer;

    /***
     * 测试查询 返回固定值 展示页面
     * 
     * @return
     */
    @RequestMapping(value = "/test")
    @ResponseBody
    public String test() {
        return "测试一,字符串show页面。";
    }

    /***
     * SHOW 页面跳转,视图解析去
     * 
     * @return
     */
    @RequestMapping(value = "/queypage")
    public ModelAndView showpage() {
        System.out.println("******2018、09、28******");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("queysso");
        mv.addObject("name", "queysso");
        return mv;
    }
    
    
    @RequestMapping(value = "/getEntryvalue")
    public ModelAndView getEntrvalue() {
        String value = testInterfaceServer.getPropertiesEntry();
        System.out.println("******"+ value +"******");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("queysso");
        mv.addObject("name", "queysso");
        return mv;
    }
    
    

}
