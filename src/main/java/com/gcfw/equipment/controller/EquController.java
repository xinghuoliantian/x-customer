package com.gcfw.equipment.controller;



import com.gcfw.common.vo.Result;
import com.gcfw.equipment.entity.Equ;
import com.gcfw.equipment.service.EquService;
import com.gcfw.equipment.vo.EquQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/equ")
public class EquController {

    @Autowired
    private EquService equService;

    //返回查询页面
    @GetMapping("")
    public String toEquListUI(Model model)
    {
        List<Equ> EqudList =equService.getAllEqud();
        model.addAttribute("EqudList",EqudList);
        return "equ/equList";
    }
    //返回查询数据
    //  localhost:8082/equ/list?page=1&limit=10
    @GetMapping("/list")
    @ResponseBody
    public Result<Object> getEquList(EquQuery param){
        List<Equ> list=equService.getEquList(param);
        Long count=equService.countEquList(param);
        return Result.success(list,count);
    }






}














