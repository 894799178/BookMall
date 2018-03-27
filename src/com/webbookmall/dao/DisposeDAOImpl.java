package com.webbookmall.dao;
import com.webbookmall.domain.Book;
import com.webbookmall.domain.User;
import com.webbookmall.domain.UserData;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

@Repository
public class DisposeDAOImpl {

    private InputStream inputStream =null;
    public static SqlSessionFactory  sqlsessionFactory =null;

    public DisposeDAOImpl() {
        String resources = "config/Mybatis_config.xml";
        try {
            inputStream =  Resources.getResourceAsStream(resources);
            sqlsessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Book getBookById(int bookId){
        return (Book) getSomeByObject("selectBookById",bookId);
    }

    public Book getBookByName(String bookName){
        return (Book) getSomeByObject("selectBookByName",bookName);
    }







    /**
     *  通过传入的userDataId来获取数据源中额达userData
     *  PS:该UserDataId 应该和UserId一致
     * @param userDataId
     * @return
     */
    public UserData getUserDataById(int userDataId){
        return (UserData) getSomeByObject("selectUserDateById",userDataId);
    }
    /**
     * 通过Id获取User
     * @param id
     * @return
     */
    public User getUserById(int id){
        User user  = (User)getSomeByObject("selectUserById",id);
        setUserDataFormUser(user);
        return user;
    }
    /**
     * 通过Name获取User
     * @param name
     * @return
     */
    public User getUserByName(String name){

        User user  =(User)getSomeByObject("selectUserByName",name);
        if(user!= null){
            setUserDataFormUser(user);
        }
        return  user;
    }
    /**
     * 填充User中的UserData数据
     * 填充数据参数通过UserId获取
     * @param user
     */
    private void setUserDataFormUser(User user){

        user.setUserData(getUserDataById(user.getUserId()));
    }
    /**
     * 通过sqlId和参数进行处理(该方法只会返回一个bean对象数据)
     * @param sqlId 传入的myBatis中Mapping映射的sqlId
     * @param age  需要传入的参数
     * @return
     */
    public  Object getSomeByObject(String sqlId, Object age){

        SqlSession sqlSession =sqlsessionFactory.openSession();
        try {
            Object obj = sqlSession.selectOne(sqlId,age);
            return obj;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally{
            sqlSession.close();
        }
    }
    public List<Object> getAll(String sqlId){
        SqlSession sqlSession =sqlsessionFactory.openSession();
        try {
            List obj = sqlSession.selectList(sqlId);
            return obj;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally{
            sqlSession.close();
        }

    }




}
