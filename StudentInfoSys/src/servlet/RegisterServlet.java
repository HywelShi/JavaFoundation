package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import util.DBUtil;

public class RegisterServlet extends  HttpServlet{
	public void service(HttpServletRequest request,
			HttpServletResponse response) throws IOException{
		response.setContentType("text/html;charset=UTF-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		PrintWriter pw = response.getWriter();
		
		//注册成功自动跳转到登录页面 失败会提示返回
		if(username==""||password==""){
			pw.print("注册失败,账号密码不能为空!<a href='register.html'>返回</a>");
		}else{
			DBUtil db = new DBUtil();
			Connection conn = db.createConnection();
			String sql = "insert into user(username,password,create_time,modify_time)"
					+ "values('"+username+"','"+password+"',(select current_timestamp),(select current_timestamp));";
			try {
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.execute();
				System.out.println("注册成功!");
				//注册成功自动跳转到登录页面
				response.sendRedirect("/StudentInfoSys/login.html");
			} catch (SQLException e) {
				pw.print("注册失败,请重新注册!<a href='register.html'>返回</a>");
				System.out.println("注册失败");
				e.printStackTrace();
			}
			
			
			
		}
		
	}
}
