package com.pinyougou.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.pinyougou.pojo.TbBrand;
import com.pinyougou.sellersgoods.server.BrandServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("/brand")
@RestController  //是组合注解
public class BrandController {

    @Reference
    private BrandServer  brandServer;


    @GetMapping("/findAll")
    public List<TbBrand> findAll(){
        return  brandServer.queryAll();
    }
}
