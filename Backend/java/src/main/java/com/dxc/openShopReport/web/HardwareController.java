package com.dxc.openShopReport.web;
import com.dxc.openShopReport.core.Result;
import com.dxc.openShopReport.core.ResultGenerator;
import com.dxc.openShopReport.model.Hardware;
import com.dxc.openShopReport.service.HardwareService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


/**
* Created by CodeGenerator on 2018/11/02.
*/
@RestController
@RequestMapping("/hardware")
public class HardwareController {
    private final static Logger logger = LoggerFactory.getLogger(HardwareController.class);
    @Resource
    private HardwareService hardwareService;

    @GetMapping(value="/getConfig", produces = "application/json")
    public Result getConfig() {
        try{
            Hardware hd = hardwareService.findById(1);
            Object[] o = new Gson().fromJson(hd.getJson(),Object[].class);
            return ResultGenerator.genSuccessResult(o);
        }catch(Exception e){
            return ResultGenerator.genFailResult("JSON解析出错!");
        }
    }

}
