//package lovedo.top.dao;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//import lovedo.top.dao.BaseDao;
////import lovedo.top.dao.DeptDao;
////import lovedo.top.RoleDao;
//import lovedo.top.dao.UserDao;
//import lovedo.top.dao.User;
//
//public class UserDaoImpl extends BaseDao implements UserDao {
//    //DeptDao deptDao = new DeptDaoImpl();
//    //RoleDao roleDao = new RoleDaoImpl();
//    //添加一条用户信息
//    @Override
//    public int addUser(User user) {
//        String update = "insert into users(account,pwd,NAME,dept,role,phone,qq,email,remark)values(?,?,?,?,?,?,?,?,?)";
//        List<Object> params = new ArrayList<Object>();
//        params.add(user.getAccount());
//        params.add(user.getPwd());
//       // params.add(deptDao.returnDeptIdByName(user.getDept()));
//       // params.add(roleDao.returnRoleIdByName(user.getRole()));
//        params.add(user.getRole());
//        params.add(user.getPhone());
//        params.add(user.getQq());
//        params.add(user.getEmail());
//        params.add(user.getMark());
//        return this.executeUpdate(update, params);
//    }
//
//    @Override
//    public List<User> findUsers() {
//        List<User> result = new ArrayList<User>();
//        String query = "select id,account,pwd,NAME,dept,role,phone,qq,email,remark from users";
//        ResultSet rs = this.executeQuery(query, null);
//        try {
//            while(rs.next()){
//                int id = rs.getInt("id");
//                String account = rs.getString("account");
//                String pwd = rs.getString("pwd");
//                String name = rs.getString("NAME");
//              //  String dept = deptDao.returnDeptNameById(rs.getInt("dept"));
//              //  String role = roleDao.returnRoleNameById(rs.getInt("role"));
//                String phone ="11";//+ rs.getInt("phone");
//                String qq = "22";//+rs.getInt("qq");
//                String email = rs.getString("email");
//                String mark = rs.getString("remark");
//              //  User user = new User(id, account,pwd,name,dept,role,phone,qq,email,mark);
//                //result.add(user);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally{
//                this.close();
//        }
//        return result;
//    }
//
//    @Override
//    public List<User> findUsersByDept(String dept) {
//        List<User> result = new ArrayList<User>();
//        List<Object> params = new ArrayList<Object>();
//        String query = "select id,account,pwd,NAME,dept,role,phone,qq,email,remark from users where dept =?";
//        if(dept!=null&&!"".equals(dept)){
//            //int d = deptDao.returnDeptIdByName(dept);
//            //params.add(d);
//        }
//        ResultSet rs = this.executeQuery(query, params);
//        try {
//            while(rs.next()){
//                int id = rs.getInt("id");
//                String account = rs.getString("account");
//                String pwd = rs.getString("pwd");
//                String name = rs.getString("NAME");
//                //String deptName = deptDao.returnDeptNameById(rs.getInt("dept"));
//                //String role = roleDao.returnRoleNameById(rs.getInt("role"));
//                String phone = Integer.toString(rs.getInt("phone"));
//                String qq = Integer.toString(rs.getInt("qq"));
//                String email = rs.getString("email");
//                String mark = rs.getString("remark");
//                //User user = new User(id, account,pwd,name,deptName,role,phone,qq,email,mark);
//                //result.add(user);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally{
//                this.close();
//        }
//        return result;
//    }
//
//    @Override
//    public List<User> findUsersByRole(String role) {
//        List<User> result = new ArrayList<User>();
//        List<Object> params = new ArrayList<Object>();
//        String query = "select id,account,pwd,NAME,dept,role,phone,qq,email,remark from users where role =?";
//        if(role!=null&&!"".equals(role)){
//            //int d = roleDao.returnRoleIdByName(role);
//            //params.add(d);
//        }
//        ResultSet rs = this.executeQuery(query, params);
//        try {
//            while(rs.next()){
//                int id = rs.getInt("id");
//                String account = rs.getString("account");
//                String pwd = rs.getString("pwd");
//                String name = rs.getString("NAME");
//                //String deptName = deptDao.returnDeptNameById(rs.getInt("dept"));
//                //String roleName = roleDao.returnRoleNameById(rs.getInt("role"));
//                String phone = Integer.toString(rs.getInt("phone"));
//                String qq = Integer.toString(rs.getInt("qq"));
//                String email = rs.getString("email");
//                String mark = rs.getString("remark");
//                //User user = new User(id, account,pwd,name,deptName,roleName,phone,qq,email,mark);
//                //result.add(user);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally{
//                this.close();
//        }
//        return result;
//    }
//
//    @Override
//    public int delUserById(int id) {
//        String query = "delete from users where id = ?";
//        List<Object> params = new ArrayList<Object>();
//        params.add(id);
//        return this.executeUpdate(query, params);
//    }
//
//    @Override
//    public int updateUserById(int id, User role) {
//        // TODO Auto-generated method stub
//        return 0;
//    }
//
//    @Override
//    public boolean checkUser(String name) {
//        List<User> list = new ArrayList<User>();
//        list = this.findUsers();
//        for(User u:list){
//            if(u.getName().equals(name)){
//                return true;
//            }
//        }
//        return false;
//    }
//
//    @Override
//    public List<User> findUsers(String name) {
//        List<User> result = new ArrayList<User>();
//        List<Object> params = new ArrayList<Object>();
//        String query = "select id,account,pwd,NAME,dept,role,phone,qq,email,remark from users where 1=1";
//        if(name!=null&&!"".equals(name)){
//            query = query+" and NAME like ?";
//            params.add("%"+name+"%");
//        }
//        ResultSet rs = this.executeQuery(query, params);
//        try {
//            while(rs.next()){
//                int id = rs.getInt("id");
//                String n = rs.getString("name");
//                String desc = rs.getString("desc");
//                User user = new User();
//                result.add(user);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally{
//                this.close();
//        }
//        return result;
//    }
//
//}
package lovedo.top.dao;
 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
 
import lovedo.top.entity.User;
import lovedo.top.util.DBconn;
 
public class UserDaoImpl implements UserDao{
	
	public boolean register(User user) {
		boolean flag = false;
		DBconn.init();
		int i =DBconn.addUpdDel("insert into user(name,pwd,sex,home,info) " +
				"values('"+user.getName()+"','"+user.getPwd()+"','"+user.getSex()+"','"+user.getHome()+"','"+user.getInfo()+"')");
		if(i>0){
			flag = true;
		}
		DBconn.closeConn();
		return flag;
	}
    public boolean login(String name, String pwd) {
		boolean flag = false;
		try {
			    DBconn.init();
				ResultSet rs = DBconn.selectSql("select * from user where name='"+name+"' and pwd='"+pwd+"'");
				while(rs.next()){
					if(rs.getString("name").equals(name) && rs.getString("pwd").equals(pwd)){
						flag = true;
					}
				}
				DBconn.closeConn();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	public List<User> getUserAll() {
		List<User> list = new ArrayList<User>();
    	try {
		    DBconn.init();
			ResultSet rs = DBconn.selectSql("select * from user");
			while(rs.next()){
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setPwd(rs.getString("pwd"));
				user.setSex(rs.getString("sex"));
				user.setHome(rs.getString("home"));
				user.setInfo(rs.getString("info"));
				list.add(user);
			}
			DBconn.closeConn();
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public boolean update(int id,String name, String pwd,String sex, String home,String info) {
		boolean flag = false;
		DBconn.init();
		String sql ="update user set name ='"+name
				+"' , pwd ='"+pwd
				+"' , sex ='"+sex
				+"' , home ='"+home
				+"' , info ='"+info+"' where id = "+id;
		int i =DBconn.addUpdDel(sql);
		if(i>0){
			flag = true;
		}
		DBconn.closeConn();
		return flag;
	}
	public boolean delete(int id) {
		boolean flag = false;
		DBconn.init();
		String sql = "delete  from user where id="+id;
		int i =DBconn.addUpdDel(sql);
		if(i>0){
			flag = true;
		}
		DBconn.closeConn();
		return flag;
	}
    
}
