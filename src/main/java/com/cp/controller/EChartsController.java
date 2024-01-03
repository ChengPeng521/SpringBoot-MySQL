package com.cp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/echarts")
public class EChartsController {

    @RequestMapping("/toECharts")
    public String toECharts(){
        return"echarts";
    }
}
