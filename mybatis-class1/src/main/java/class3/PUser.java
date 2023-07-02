package class3;

//通过定义参数和返回类型，可以在Java中调用存储过程。 MyBatis会生成相应的SQL语句
//并将其发送到数据库执行。存储过程通常用于执行复杂的查询或处理数据的业务逻辑。
//使用存储过程的优点是可以将数据库逻辑封装起来，减少应用程序与数据库之间的通信。
//此外，存储过程还可以提高性能，因为它们在数据库中编译一次，并且可以重复使用，从而减少了每次执行SQL语句的开销。
public class PUser {
    private String id;
    private String name;
    private String sex;

    public PUser(String id, String name, String sex) {
        super();
        this.id = id;
        this.name = name;
        this.sex = sex;
    }
}
