package com.main.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.main.entry.User;

@Service
public interface queryHotelDaoService {

    public List<User> queryHotelPublic();
    

}
