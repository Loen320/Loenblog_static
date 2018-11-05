package lovedo.top.servlet;

import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
import lovedo.top.dao.UserDao;
import lovedo.top.dao.UserDaoImpl;
 
public class DeleteServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String id = request.getParameter("id");
		int userId = Integer.parseInt(id);
		
		UserDao ud = new UserDaoImpl();
		
		if(ud.delete(userId)){
			request.setAttribute("xiaoxi", "删除成功");
			request.getRequestDispatcher("SearchallServlet").forward(request, response);
		}else{
			response.sendRedirect("index.jsp");
		}
	}
 
}