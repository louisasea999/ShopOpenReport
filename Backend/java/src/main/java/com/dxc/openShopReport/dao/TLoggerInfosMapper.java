package com.dxc.openShopReport.dao;

import com.dxc.openShopReport.core.Mapper;
import com.dxc.openShopReport.model.TLoggerInfos;

public interface TLoggerInfosMapper extends Mapper<TLoggerInfos> {
    public void insertLogInfo(TLoggerInfos tlogger);
}