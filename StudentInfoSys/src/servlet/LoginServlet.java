package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.DBUtil;

public class LoginServlet extends HttpServlet{
	public void service(HttpServletRequest request,
			HttpServletResponse response) throws IOException{
		response.setContentType("text/html;charset=UTF-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		PrintWriter pw = response.getWriter();
		if(username==""||password==""){
			pw.print("登录失败,账号密码不能为空!<a href='login.html'>返回</a>");
		}else{
			DBUtil db = new DBUtil();
			Connection conn = db.createConnection();
			String sql = "select * from user "
					+ "where username='"+username+"' and password='"+password+"';";
			
			try {
				Statement state = conn.createStatement();
				ResultSet rs  = state.executeQuery(sql);
				if(rs.next()){
					System.out.println("登录成功!");
					//跳转到录入学生信息界面
					response.sendRedirect("/StudentInfoSys/input.html");
				}else{
					pw.print("登录失败!<a href='login.html'>返回</a>");
				}
			} catch (SQLException e) {
				pw.print("登录失败!<a href='login.html'>返回</a>");
				e.printStackTrace();
			}
			
		}
	}
}










