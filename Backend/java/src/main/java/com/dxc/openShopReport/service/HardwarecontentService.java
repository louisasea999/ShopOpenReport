package com.dxc.openShopReport.service;
import bean.HardwareContentTemp;
import bean.HardwareJsonContent;
import com.dxc.openShopReport.model.Hardwarecontent;
import com.dxc.openShopReport.core.Service;


/**
 * Created by CodeGenerator on 2019/01/21.
 */
public interface HardwarecontentService extends Service<Hardwarecontent> {
    int saveByShopCodeAndContent(Hardwarecontent hardwarecontent);
    Hardwarecontent getHardwareContentByShopcode(Hardwarecontent hardwarecontent);
    HardwareContentTemp updateHardwareContent(Hardwarecontent hardwarecontent);
    int updateByShopCodeAndContent(Hardwarecontent hardwarecontent);
}
