package day04;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		/**
		实现手动输入学生学号 姓名 年龄 地址存入到集合中
		输入exit退出提示存入完毕
		再去输入一个学生姓名 判断此学生在不在这个集合中
		如果在 将学生信息输出
		 */
		//集合后面的<>可以限制集合中存储数据的类型
		ArrayList<Student> students = 
				new ArrayList<Student>();
		//调用控制台输入方法
		Scanner scan = new Scanner(System.in);
		
		//练习：利用for循环往学生集合中存入十个学生
		for(int i=1;i<=10;i++){
			Student s = new Student();
			//存入集合之前，
			//设置每一个学生对象的四个属性的值
			//四个属性需要手动输入
			System.out.println("请输入学号：");
			s.setId(scan.nextInt());
			System.out.println("请输入姓名：");
			s.setName(scan.next());
			System.out.println("请输入年龄：");
			s.setAge(scan.nextInt());
			System.out.println("请输入地址：");
			s.setAddress(scan.next());
			students.add(s);
			System.out.println("存入学生成功！");
		}
		
		//输出学生信息 访问学生集合
		for(int i=0;i<students.size();i++){
			System.out.println(
					"学号为:"+students.get(i).getId()+
					"  姓名为:"+students.get(i).getName()+
					"  年龄为:"+students.get(i).getAge()+
					"  地址为:"+students.get(i).getAddress());
		}
		
		//查找某一个学生
		
		
		//定义一个开关 或者叫标记
		int a = 1;
		System.out.println("请输入查找学生的姓名：");
		String name = scan.next();
		for(int i=0;i<students.size();i++){
			if(name.equals(students.get(i).getName())){
				a = 2;//学生姓名对比上了则将标记改为2
				System.out.println(
						"学号为:"+students.get(i).getId()+
						"  姓名为:"+students.get(i).getName()+
						"  年龄为:"+students.get(i).getAge()+
						"  地址为:"+students.get(i).getAddress());
			}
		}
		//只需要判断开关或者标记的值即可
		if(a==1){
			System.out.println("没有此学生！");
		}else{
			System.out.println("有此学生！");
		}
		
		
		
	}

}






