package class2;

import class1.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UserTest {

    @org.junit.Test
    public void testConditionUser(){
        SqlSession session = MybatisUtils.getSession();
        ConditionUserMapper mapper = session.getMapper(ConditionUserMapper.class);

        String name="o";
        name=null;
        ConditionUser conditionUser = new ConditionUser("%" + name + "%", 13, 18);
        List<User> list = mapper.getUser(conditionUser);
        System.out.println(list);
        session.close();


    }
}
