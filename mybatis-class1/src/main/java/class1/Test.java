package class1;



import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Test {

    @org.junit.Test
    public void test() throws IOException {
//        String resource = "conf.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//
//        SqlSession sqlSession = sqlSessionFactory.openSession();
       SqlSession sqlsession = MybatisUtils.getSession();
        String s = "class1.User.getUser";
        User u = sqlsession.selectOne(s,1);
        System.out.println(u);
        System.out.println(u.getId());
        System.out.println(u.getName());
        System.out.println(u.getAge());
    }
    @org.junit.Test
    public void insertTest() throws IOException {
//        String resource = "conf.xml";
//        InputStream inputStream = Resources.getResourceAsStream(resource);
//        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//
//        SqlSession sqlSession = sqlSessionFactory.openSession();
        SqlSession sqlsession = MybatisUtils.getSession();
//        String str = "class1.userMapper.insertUser";
//        int insert = sqlsession.insert("str",new User(3, "swz",20));
        userMapper mapper = sqlsession.getMapper(userMapper.class);
        int insert = mapper.insertUser(new User(1,"swz",21));
        sqlsession.commit();
        System.out.println(insert);

    }
@org.junit.Test
    public void testSelectUserById(){
    SqlSession session = MybatisUtils.getSession();
    userMapper mapper = session.getMapper(userMapper.class);
    User user = mapper.selectUserById(1);
    System.out.println(user.getName());
    session.close();


}
    @org.junit.Test
    public void testDeleteUserById(){
        SqlSession session = MybatisUtils.getSession();
        userMapper mapper = session.getMapper(userMapper.class);
        int delete = mapper.deleteUser(3);
        System.out.println(delete);
        session.commit();
        session.close();
    }

    @org.junit.Test
    public void testUpdateUser(){
        SqlSession session = MybatisUtils.getSession();
        userMapper mapper = session.getMapper(userMapper.class);
        User user1 = new User(1,"孙文志",20);
        int update = mapper.updateUser(user1);
        System.out.println(update);
        session.commit();
        session.close();
    }

    @org.junit.Test
    public void testClassesGetClass(){
        SqlSession session = MybatisUtils.getSession();
        ClassMapper mapper = session.getMapper(ClassMapper.class);
        Classes c = mapper.getClasses(2);
        System.out.println(c);
        session.close();
    }

    @org.junit.Test
    public void testOderSelect(){
        SqlSession session = MybatisUtils.getSession();
        OrderMapper mapper = session.getMapper(OrderMapper.class);
        Order order = mapper.selectOrder(1);
        System.out.println(order);
        session.close();
    }

    @org.junit.Test
    public void testOderSelectMap(){
        SqlSession session = MybatisUtils.getSession();
        OrderMapper mapper = session.getMapper(OrderMapper.class);
        Order order = mapper.selectOrder(1);
        System.out.println(order.getOrderNo());
        session.close();
    }

    @org.junit.Test
    public void testClassStudents(){
        SqlSession session = MybatisUtils.getSession();
        ClassMapper mapper = session.getMapper(ClassMapper.class);
        Classes classStudents = mapper.getClassStudents(1);
        System.out.println(classStudents);
        session.close();


    }

}
