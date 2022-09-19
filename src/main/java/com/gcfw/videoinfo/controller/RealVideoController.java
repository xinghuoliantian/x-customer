package com.gcfw.videoinfo.controller;

import com.gcfw.equipment.entity.Equ;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/sssp")
public class RealVideoController {

    //返回查询页面
    @GetMapping("")
    public String toEquListUI( )
    {


        return "videoinfo/realVideo";
    }
}
