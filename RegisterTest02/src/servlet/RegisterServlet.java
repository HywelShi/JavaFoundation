package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{
	public void service(HttpServletRequest request,
			HttpServletResponse response) throws IOException{
		
		//1.解决乱码问题
		//解决响应乱码
		response.setContentType("text/html;charset=UTF-8");
		//2.获取前端表单提交过来的账号和密码
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		//后台控制台输出测试
		System.out.println("账号为："+username);
		System.out.println("密码为："+password);
		
		//3.判断是否为空
		//4.将结果输出到页面上
		//需要调用响应的输出工具PrintWriter
		//出错鼠标划上去选第一个抛出忽略即可
		PrintWriter pw = response.getWriter();
		if(username=="" || password==""){
			System.out.println("账号或密码不能为空！");
			pw.print("账号或密码不能为空！");
		}else{
			System.out.println("注册成功！");
			pw.print("注册成功！");
			//5.注册成功之后将数据存入数据库
			//5.1 创建一张用户表user表
			// id int 自增 
			// username varchar(100)
			// password varchar(100)
			// create_time datetime
			// modify_time datetime
			//5.2 将DBUtil拷贝到servlet包下
			//5.3 创建链接
			//5.4 定义sql语句
			//5.5 执行sql插入
			
		}
		
	}
}





