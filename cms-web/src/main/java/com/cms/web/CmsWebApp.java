package com.cms.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//组件扫描，需要扫描加载其他依赖包中的组件
@ComponentScan(basePackages = {"com.cms"})
@ServletComponentScan(basePackages = {"com.cms"})
public class CmsWebApp {

    public static void main(String[] args){
        SpringApplication.run(CmsWebApp.class, args);
    }

}
