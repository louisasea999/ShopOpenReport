package com.dxc.openShopReport.web;
import bean.HardwareContentTemp;
import bean.HardwareJsonContent;
import com.dxc.openShopReport.core.Result;
import com.dxc.openShopReport.core.ResultGenerator;
import com.dxc.openShopReport.model.Hardwarecontent;
import com.dxc.openShopReport.service.HardwarecontentService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.lang.reflect.Type;
import java.util.List;

/**
* Created by CodeGenerator on 2019/01/21.
*/
@RestController
@RequestMapping("/hardwarecontent")
public class HardwarecontentController {
    @Resource
    private HardwarecontentService hardwarecontentService;

    @PostMapping("/add")
    public Result add(Hardwarecontent hardwarecontent) {
        String content = hardwarecontent.getContent();
        HardwareContentTemp hardwareContentTemp = new Gson().fromJson(content,HardwareContentTemp.class);
        int subId = 0;
        HardwareJsonContent[] hardwareJsonContent= hardwareContentTemp.getContent();
        for(HardwareJsonContent s:hardwareJsonContent){
            s.setSubId(String.valueOf(subId));
            subId++;
        }
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization()
                .create();
        hardwarecontent.setContent(gson.toJson(hardwareContentTemp));
        hardwarecontentService.saveByShopCodeAndContent(hardwarecontent);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Hardwarecontent hardwarecontent) {
        HardwareContentTemp hardwareJsonContents = hardwarecontentService.updateHardwareContent(hardwarecontent);
        Gson gson = new GsonBuilder().enableComplexMapKeySerialization()
                .create();
        hardwarecontent.setContent(gson.toJson(hardwareJsonContents));
        hardwarecontentService.updateByShopCodeAndContent(hardwarecontent);
        return ResultGenerator.genSuccessResult();
    }
}
