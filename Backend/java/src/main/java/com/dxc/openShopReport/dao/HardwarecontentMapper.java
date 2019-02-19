package com.dxc.openShopReport.dao;

import com.dxc.openShopReport.core.Mapper;
import com.dxc.openShopReport.model.Hardwarecontent;

public interface HardwarecontentMapper extends Mapper<Hardwarecontent> {
    int saveByShopCodeAndContent(Hardwarecontent hardwarecontent);
    int updateByShopCodeAndContent(Hardwarecontent hardwarecontent);
    Hardwarecontent getHardwareContentByShopcode(Hardwarecontent hardwarecontent);
}