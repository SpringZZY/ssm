package com.main.util;

import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.main.entry.data_source_entiry;

@Configuration
public class publicInterfaceServer implements EnvironmentAware{
    
    @Override
    public void setEnvironment(Environment environment) {
        data_source_entiry dse = new data_source_entiry();
        System.out.println("123333333");
        dse = Binder.get(environment).bind("spring.datasource", data_source_entiry.class).orElse(dse);
        System.out.println("------------"+dse.toString());
    }
}
