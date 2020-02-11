package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.main.entry.data_source_entiry;

@SpringBootApplication
@EnableAutoConfiguration
public class maine {

    public static void main(String[] args) {
        SpringApplication.run(maine.class, args);
    }

    /*** 返回jsp页面必须继承SpringBootServletInitializer类重写里面的方法 ***/
    protected SpringApplicationBuilder config(SpringApplicationBuilder applicationBuilder) {
        return applicationBuilder.sources(maine.class);
    }
}
