package com.webbookmall.service;

import com.webbookmall.dao.DisposeDAOImpl;
import com.webbookmall.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LoginService {

    @Autowired
    private DisposeDAOImpl disposeDAO;

    public User getUser(String user){
      return  disposeDAO.getUserByName(user);
    }
}
