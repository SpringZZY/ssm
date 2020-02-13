package com.main.server.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.main.dao.queryHotelDaoService;
import com.main.entry.User;
import com.main.entry.data_source_entiry;
import com.main.server.testInterfaceServer;

@Service
public class testInterfaceServiceImpl implements testInterfaceServer {
    
    @Autowired
    Environment environment;
    
    @Autowired
    User us;
    
    @Autowired
    data_source_entiry dse;
    
    @Autowired
    queryHotelDaoService queryHotelDaoService;
    
    @Override
    public String getPropertiesEntry() {
        testInterfaceServiceImpl testInterfaceServiceImpl = new testInterfaceServiceImpl();
        System.out.println(us.toString());
        List<User> list = queryHotelDaoService.queryHotelPublic();
        String database = environment.getProperty("spring.jpa.database");
        System.out.println("系统时间-----" + System.nanoTime());
        return dse.toString();
    }


}
