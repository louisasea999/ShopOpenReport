package com.dxc.openShopReport.dao;

import com.dxc.openShopReport.core.Mapper;
import com.dxc.openShopReport.model.TExceptionInfos;

public interface TExceptionInfosMapper extends Mapper<TExceptionInfos> {
    public void save(TExceptionInfos te);
}