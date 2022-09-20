package com.gcfw.location.controller;

import com.gcfw.equipment.entity.Equ;
import com.gcfw.location.service.LocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
        model.addAttribute("EqudList1",EqudList);
        return "loc/equLoc";
    }
}
