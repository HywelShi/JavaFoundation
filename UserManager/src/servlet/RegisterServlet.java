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

public class RegisterServlet extends HttpServlet {
	public void service(HttpServletRequest request,
			HttpServletResponse response) throws IOException{
		//1.解决乱码问题
		response.setContentType("text/html;charset=UTF-8");
		//2.获取账号和密码
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//3.创建反馈PrintWriter工具
		PrintWriter pw = response.getWriter();
		//4.判断账号和密码是否为空
		//5.页面输出结果
		if(username=="" || password==""){
			System.out.println("账号或密码不能为空！");
			//6.注册失败 需要返回注册页面
			pw.print("账号与密码不能为空！"
					+ "<a href='register.html'>返回</a>");
			
		}else{
			
			//7.注册成功之后需要将数据存入数据库
			DBUtil db = new DBUtil();
			Connection conn = db.createConnection();
			//8.定义sql语句
			String sql = "insert into user"
					+ "(username,password,create_time,modify_time)"
					+ "values('"+username+"','"+password+"',"
					+ "(select current_timestamp),"
					+ "(select current_timestamp));";
			//9.执行sql语句 插入数据库
			try {
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.execute();//执行插入
				System.out.println("注册成功！");
				pw.print("注册成功！");
				System.out.println("存入数据库成功！");
				pw.print("存入数据库成功！");
				pw.print("<br><a href='register.html'>重新注册</a>");
				pw.print("<a href='login.html'>返回登陆</a>");
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("存入数据库失败！");
				pw.print("存入数据库失败！");
			}
			
		}
		
		
		
		
	}
}
