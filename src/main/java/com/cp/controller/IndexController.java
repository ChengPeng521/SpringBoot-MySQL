package com.cp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * index跳转转发控制
 */

@Controller
public class IndexController {
    @RequestMapping("/indexAdmin")
    public String indexAdmin(){
        return "index_admin";
    }

    @RequestMapping("/indexNormal")
    public String indexNormal(){
        return "index_normal";
    }
}
