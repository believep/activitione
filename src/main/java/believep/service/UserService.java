package believep.service;

import believep.pojo.User;

import java.util.List;
import java.util.Set;

public interface UserService {
    //获取用户集合
    public List<User> getUserList();
    //增加用户
    public int addUser(User user);
    //修改用户
    public int updateUser(User user);
    //删除
    public int deleteUser(int uid);
    //根据username获取User对象
    public User getUserByUsername(String username);
    //根据用户名获取角色集合
    public Set<String> getRolesByUsername(String username);
    //根据uid获取User
    public User getUserByUid(int uid);
}
