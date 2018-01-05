package com.cms.web;


import com.wordnik.swagger.config.ConfigFactory;
import com.wordnik.swagger.config.ScannerFactory;
import com.wordnik.swagger.config.SwaggerConfig;
import com.wordnik.swagger.jaxrs.config.DefaultJaxrsScanner;
import com.wordnik.swagger.jersey.JerseyApiReader;
import com.wordnik.swagger.model.ApiInfo;
import com.wordnik.swagger.reader.ClassReaders;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//组件扫描，需要扫描加载其他依赖包中的组件
@ComponentScan(basePackages = {"com.cms"})
@ServletComponentScan(basePackages = {"com.cms"})
public class CmsWebApp implements CommandLineRunner {

    public static void main(String[] args){
        SpringApplication.run(CmsWebApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        SwaggerConfig swaggerConfig = ConfigFactory.config();
        swaggerConfig.setBasePath("/v1");
        swaggerConfig.setApiVersion("1.0.0");
        swaggerConfig.setApiInfo(new ApiInfo("","<a href=\"/api\"></a>",null,null,null,null));
        ScannerFactory.setScanner(new DefaultJaxrsScanner());
        ClassReaders.setReader(new JerseyApiReader());
    }
}
