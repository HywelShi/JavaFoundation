package day04;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoreManager {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//1.学生信息录入
		//1.1定义集合存放学生信息
		ArrayList<Student> students = 
				new ArrayList<Student>();
		//1.2利用死循环录入
		while(true){
			//1.3 创建对象 设置属性 存入集合
			Student s = new Student();
			System.out.println("请输入编号：");
			int id = scan.nextInt();
			if(id==100000){
				System.out.println("录入完毕，退出！");
				break;
			}
			s.setId(id);
			System.out.println("请输入姓名：");
			s.setName(scan.next());
			System.out.println("请输入成绩：");
			s.setScore(scan.nextDouble());
			students.add(s);
			System.out.println("成功录入一个学生！");
			System.out.println(
					"录入了"+students.size()+"个学生！");
		}
		System.out.println(
				"总共录入了"+students.size()+"个学生！");
		//2.求平均分
		double sum = 0;//总分默认为0
		for(int i=0;i<students.size();i++){
			double score = students.get(i).getScore();
			//每次取出一个学生的分数累加到sum上
			sum += score;
		}
		//students.size()表示集合里面所有的人数
		System.out.println("平均分为："+sum/students.size());
		
		//3.求及格率
		double count = 0;//表示及格人数 默认为0
		for(int i=0;i<students.size();i++){
			double score = students.get(i).getScore();
			if(score>=60){
				count++;//分数超过60则累加1
			}
		}
		System.out.println("及格率为："+count/students.size());
		//扩展：
		//学生其中85以上包含85分为优秀
		//70-84分为良好
		//60-69分为及格
		//0-59分为不及格
		//求出四个档的百分比
		double count1=0;double count2=0;
		double count3=0;double count4=0;
		for(int i=0;i<students.size();i++){
			double score = students.get(i).getScore();
			if(score>=85){
				count1++;
			}else if(score>=70){
				count2++;
			}else if(score>=60){
				count3++;
			}else{
				count4++;
			}
		}
		System.out.println("优秀档占有"+count1/students.size());
		System.out.println("良好档有"+count2/students.size());
		System.out.println("及格档有"+count3/students.size());
		System.out.println("不及档占有"+count4/students.size());
		
		
		
		//求最高分
		double max = 0;//指定默认值为0
		for(int i=0;i<students.size();i++){
			if(students.get(i).getScore()>max){
				max = students.get(i).getScore();
			}
		}
		System.out.println("最高分为"+max);
		//求最低分
		double min = 100;//指定默认值为0
		for(int i=0;i<students.size();i++){
			if(students.get(i).getScore()<min){
				min = students.get(i).getScore();
			}
		}
		System.out.println("最低分为"+min);
		
		
		
		
		
	}

}
