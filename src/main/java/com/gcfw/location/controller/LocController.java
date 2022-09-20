package com.gcfw.location.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sbdw")
public class LocController {
    //返回查询页面
    @GetMapping("")
    public String toEquListUI( )
    {
        return "loc/equLoc";
    }
}
