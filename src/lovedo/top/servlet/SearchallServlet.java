package lovedo.top.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import lovedo.top.dao.UserDao;
import lovedo.top.dao.UserDaoImpl;
import lovedo.top.entity.User;
 
public class SearchallServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		UserDao ud = new UserDaoImpl();
		List<User> userAll = ud.getUserAll();
		request.setAttribute("userAll", userAll);
		request.getRequestDispatcher("/pages?view=/mysql/showall").forward(request, response);
	}
}
