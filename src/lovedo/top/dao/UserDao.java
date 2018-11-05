package lovedo.top.dao;

//import java.util.List;
//
//import lovedo.top.dao.User;
//
//public interface UserDao {
//    public int addUser(User user);
//    public List<User> findUsers();
//    public List<User> findUsers(String name);
//    public List<User> findUsersByDept(String dept);
//    public List<User> findUsersByRole(String role);
//    public int delUserById(int id);
//    public int updateUserById(int id,User role);
//    public boolean checkUser(String name);
//}

import java.util.List;
 
import lovedo.top.entity.User;
 
public interface UserDao {
	public boolean login(String name,String pwd);//登录
	public boolean register(User user);//注册
	public List<User> getUserAll();//返回用户信息集合
	public boolean delete(int id) ;//根据id删除用户
	public boolean update(int id,String name, String pwd,String sex, String home,String info) ;//更新用户信息
}