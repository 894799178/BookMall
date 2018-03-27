package com.webbookmall.test;

import com.webbookmall.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestJoinDB {
    String resources = "config/Mybatis_config.xml";

    @Test
    public void testJoinDB1() throws IOException {

        InputStream inputStream =  Resources.getResourceAsStream(resources);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession= sqlSessionFactory.openSession();
        sqlSession.close();
        System.out.println((User)sqlSession.selectOne("selectUserInId",1));

    }
    @Test
    public void testSelectForUserData() throws IOException {

        InputStream inputStream =  Resources.getResourceAsStream(resources);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession= sqlSessionFactory.openSession();
        System.out.println(sqlSession.selectList("selectUserDateInId",1));

    }
}
