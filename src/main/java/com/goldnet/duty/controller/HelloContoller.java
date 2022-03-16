package com.goldnet.duty.controller;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.goldnet.duty.entity.GeStation;
import com.goldnet.duty.mapper.GeStationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HelloContoller {

    @Autowired
    GeStationMapper geStationMapper;

    @DS("GPO2")
    @GetMapping("/hello")
    @ResponseBody
    public List getStation(){
        return geStationMapper.selectList(null);
    }

    @GetMapping("/hello1")
    public String getStation(Model model){
        List<GeStation> geStations = geStationMapper.selectList(null);
        model.addAttribute("gestations",geStations);

        return "hello";
    }
}
