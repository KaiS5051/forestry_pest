package com.agriguard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AgriGuardPageController {

    /**
     * AgriGuard OS 核心门户 - 智慧农田虫情数字孪生大屏
     */
    @GetMapping("/agriguard")
    public String dashboard() {
        return "user/dashboard";
    }

    /**
     * 远程控制台 - 设备远程操控中心
     */
    @GetMapping("/agriguard/devices")
    public String devices() {
        return "user/remote";
    }

    /**
     * 决策大脑 - 数据仓库OLAP分析
     */
    @GetMapping("/agriguard/analysis")
    public String analysis() {
        return "user/analysis";
    }

}
