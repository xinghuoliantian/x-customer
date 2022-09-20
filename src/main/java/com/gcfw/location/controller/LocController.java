package com.gcfw.location.controller;

import com.gcfw.common.vo.Result;
import com.gcfw.equipment.entity.Equ;
import com.gcfw.location.service.LocService;
import com.gcfw.location.vo.GpsQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/sbdw")
public class LocController {

    @Autowired
    private LocService locService;

    //返回查询页面
    @GetMapping("")
    public String toEquListUI(HttpServletRequest request, Model model)
    {
        Object object=request.getSession().getAttribute("userInfo");
        List<Equ> EqudList =locService.getEquByUser(object);
        model.addAttribute("EqudList",EqudList);
        return "loc/equLoc";
    }

    //返回查询数据
    //  localhost:8082/sbdw/list?devicecode=12213004&page=1&limit=10
    @GetMapping("/list")
    @ResponseBody
    public Result<Object> getEquList(GpsQuery param){
        List<Equ> list=locService.getGpsList(param);
        Long count=locService.countGpsList(param);
        return Result.success(list,count);
    }

}
