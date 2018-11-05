package lovedo.top.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.BreakIterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

import lovedo.top.dao.UserDao;
import lovedo.top.dao.UserDaoImpl;
import lovedo.top.entity.User;
 
public class RegisterServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String name = request.getParameter("name"); //获取jsp页面传过来的参数
		String pwd = request.getParameter("pwd");
		String sex = request.getParameter("sex");
		String home = request.getParameter("home");
		String info = request.getParameter("info");
		
		User user = new User(); //实例化一个对象，组装属性
		user.setName(name);
		user.setPwd(pwd);
		user.setSex(sex);
		user.setHome(home);
		user.setInfo(info);
		
		UserDao ud = new UserDaoImpl();
		if (name.equals("")||pwd.equals("")) {
			JOptionPane.showMessageDialog(null, "请输入用户名或密码", "填写错误", JOptionPane.ERROR_MESSAGE);
		}
		if(ud.register(user)){
			request.setAttribute("username", name);  //向request域中放置参数
			request.setAttribute("xiaoxi", "注册成功");
			//request.getRequestDispatcher("/pages?view=/mysql/login").forward(request, response);  //转发到登录页面
			JOptionPane.showMessageDialog(null, "提示", "填写错误", JOptionPane.ERROR_MESSAGE);
		}else{
			
			//response.sendRedirect("/pages?view=/mysql/");//重定向到首页
			JOptionPane.showMessageDialog(null, "提示", "填写错误", JOptionPane.ERROR_MESSAGE);
		}
	}
}