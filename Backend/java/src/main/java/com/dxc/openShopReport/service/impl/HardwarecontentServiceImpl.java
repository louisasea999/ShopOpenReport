package com.dxc.openShopReport.service.impl;

import bean.HardwareContentTemp;
import bean.HardwareJsonContent;
import com.dxc.openShopReport.dao.HardwarecontentMapper;
import com.dxc.openShopReport.model.Hardwarecontent;
import com.dxc.openShopReport.service.HardwarecontentService;
import com.dxc.openShopReport.core.AbstractService;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;


/**
 * Created by CodeGenerator on 2019/01/21.
 */
@Service
@Transactional
public class HardwarecontentServiceImpl extends AbstractService<Hardwarecontent> implements HardwarecontentService {
    @Resource
    private HardwarecontentMapper hardwarecontentMapper;

    @Override
    public int saveByShopCodeAndContent(Hardwarecontent hardwarecontent) {
        return hardwarecontentMapper.saveByShopCodeAndContent(hardwarecontent);
    }

    @Override
    public Hardwarecontent getHardwareContentByShopcode(Hardwarecontent hardwarecontent) {
        return hardwarecontentMapper.getHardwareContentByShopcode(hardwarecontent);
    }

    @Override
    public HardwareContentTemp updateHardwareContent(Hardwarecontent hardwarecontent) {
        String content = hardwarecontent.getContent();
        Hardwarecontent hardwarecontentInDatabase = hardwarecontentMapper.getHardwareContentByShopcode(hardwarecontent);
        String contentInDatabase = hardwarecontentInDatabase.getContent();
//        HardwareContentTemp hardwareJsonInDatabase= new Gson().fromJson(contentInDatabase,HardwareContentTemp.class);
//        HardwareContentTemp hardwareJson= new Gson().fromJson(content,HardwareContentTemp.class);
        HardwareJsonContent[] hardwareJsonContentInDatabase = new Gson().fromJson(contentInDatabase,HardwareContentTemp.class).getContent();
        String id = new Gson().fromJson(contentInDatabase,HardwareContentTemp.class).getId();
        HardwareJsonContent[] hardwareJsonContent = new Gson().fromJson(content,HardwareContentTemp.class).getContent();
        ArrayList<HardwareJsonContent> arrayList = new ArrayList<HardwareJsonContent>(Arrays.asList(hardwareJsonContentInDatabase));
        int subId = arrayList.size();
        for(HardwareJsonContent s:hardwareJsonContent){
            if(s.getSubId().contains("a")){
                s.setSubId(String.valueOf(subId));
                arrayList.add(s);
                subId++;
            } else if(s.getSubId().contains("r")) {
                String sub = s.getSubId().substring(1, s.getSubId().length());
                for (HardwareJsonContent h : arrayList) {
                    if (h.getSubId().equals(sub)) {
                        arrayList.remove(h);
                        break;
                    }
                }
            }else{
                for (HardwareJsonContent h : arrayList) {
                    if (h.getSubId().equals(s.getSubId())) {
                        arrayList.remove(h);
                        arrayList.add(s);
                        break;
                    }
                }
            }
        }
        HardwareContentTemp h = new HardwareContentTemp();
        h.setId(id);
        h.setContent(arrayList.toArray(new HardwareJsonContent[arrayList.size()]));
        return h;
    }

    @Override
    public int updateByShopCodeAndContent(Hardwarecontent hardwarecontent) {
        return hardwarecontentMapper.updateByShopCodeAndContent(hardwarecontent);
    }
}
