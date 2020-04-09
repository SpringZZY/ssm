package com.main.dao;


import org.springframework.stereotype.Service;

import com.main.entry.User;

@Service
public interface insertHotaleDaoService {

  public boolean insertUser(User user);

}
