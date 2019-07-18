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

/*
 * 1.继承
 * 2.写service方法
 * 3.处理乱码
 * 4.获取登陆页面的用户和密码
 * 5.生成PrintWriter工具
 * 6.链接数据库
 * 7.定义sql查询语句
 * 8.执行sql语句生成结果集
 * 9.判断结果集里面有没有数据
 * 10.输出提示用语
 */
public class LoginServlet extends HttpServlet{
	public void service(HttpServletRequest request,
			HttpServletResponse response) throws IOException{
		response.setContentType("text/html;charset=UTF-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		PrintWriter pw = response.getWriter();
		
	
		//先判断是否有空值 再去数据库里面查找
		if(username=="" || password==""){
			pw.print("账号或密码为空！"
					+ "<a href='login.html'>返回登陆</a>");
		}else{
			//链接数据库查询数据并判断
			DBUtil db = new DBUtil();
			Connection conn = db.createConnection();
			String sql = "select * from user where "
					+ "username='"+username+"' "
					+ "and password='"+password+"';";
			//执行sql语句
			try {
				Statement state = conn.createStatement();
				ResultSet rs = state.executeQuery(sql);
				if(rs.next()){
					pw.print("登陆成功！");
					//跳转到主页
					response.sendRedirect("/UserManager/index.html");
				}else{
					pw.print("登陆失败！");
					pw.print("<a href='login.html'>返回登陆</a>");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}
}





