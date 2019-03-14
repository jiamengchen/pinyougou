package com.pinyougou.sellersgoods.server.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.mapper.BrandMapper;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellersgoods.server.BrandServer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Date:2018/9/6
 * time:${time}
 * User:${user}
 * Author: DreamChen
 */

@Service(interfaceClass = BrandServer.class)
public class BrandServiceImpl  implements BrandServer {

    @Autowired
    private BrandMapper  brandMapper;

    @Override
    public List<TbBrand> queryAll() {

        return brandMapper.queryAll();
    }
}
