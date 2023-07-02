package class1;

public interface userMapper {
    int insertUser(User user);
    User selectUserById(int id);
    int deleteUser(int id);
    int updateUser(User user);
}
