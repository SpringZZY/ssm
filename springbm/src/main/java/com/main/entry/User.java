package com.main.entry;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = {"/config/outher.properties"})
@ConfigurationProperties(prefix = "user")
public class User {

    public User() {
        // TODO Auto-generated constructor stub
    }
    public String name;
    public String sex;
    public String ager;
    @Value("${user.xxx.yyy}")
    public String yyy;
    
    public String getYyy() {
        return yyy;
    }
    public void setYyy(String yyy) {
        this.yyy = yyy;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getAger() {
        return ager;
    }
    public void setAger(String ager) {
        this.ager = ager;
    }
    @Override
    public String toString() {
        return "User [name=" + name + ", sex=" + sex + ", ager=" + ager + ", yyy=" + yyy + "]";
    }
    
    
}
