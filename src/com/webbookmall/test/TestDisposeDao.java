package com.webbookmall.test;

import com.webbookmall.dao.DisposeDAOImpl;
import org.junit.Test;

import java.util.HashMap;


public class TestDisposeDao {
        DisposeDAOImpl disposeDAO = new DisposeDAOImpl();

    @Test
    public void TestDisposeDao()  {
        System.out.println(disposeDAO.getUserById(1));
    }
    @Test
    public void TestGetUserByName(){
        System.out.println(disposeDAO.getUserByName("root"));
    }
    @Test
    public void TestGetUserData(){
        System.out.println(disposeDAO.getUserDataById(1));
    }

    @Test
    public void getBookById() throws Exception {
        System.out.println(disposeDAO.getBookById(1));
    }

    @Test
    public void getBookByName() throws Exception {
        System.out.println(disposeDAO.getBookByName("javaWEB开发"));
    }
    @Test
    public void getAll(){
        HashMap hashmap = new HashMap<>();
        hashmap.put("selectBooks","selectBooks");
        System.out.println(disposeDAO.getAll("selectBooks"));
    }
}
