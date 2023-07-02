package class4;

import class1.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class CUserTest {

    @Test
    public void testSelectCUser(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        CUser user = mapper.getUser(1);
        System.out.println(user);

        session.clearCache();
        user = mapper.getUser(1);
        System.out.println(user);
    }

    @Test
    public void testUpdateUser(){
        SqlSession session = MybatisUtils.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        CUser tom = new CUser(1, "Tom", 13);
        mapper.updateUser(tom);
        session.commit();

        CUser user = mapper.getUser(1);
        System.out.println(user);

    }

    @Test
    public void testCacheTwo(){
        SqlSession session1 = MybatisUtils.getSession();
        SqlSession session2 = MybatisUtils.getSession();
        UserMapper mapper1 = session1.getMapper(UserMapper.class);
        CUser user1 = mapper1.getUser(1);
        session1.commit();
        System.out.println(user1);

        UserMapper mapper2 = session2.getMapper(UserMapper.class);
        CUser user2 = mapper2.getUser(1);
        session2.commit();
        System.out.println(user2);

    }
}
