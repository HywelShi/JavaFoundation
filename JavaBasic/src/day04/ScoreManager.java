package day04;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoreManager {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//1.ѧ����Ϣ¼��
		//1.1���弯�ϴ��ѧ����Ϣ
		ArrayList<Student> students = 
				new ArrayList<Student>();
		//1.2������ѭ��¼��
		while(true){
			//1.3 �������� �������� ���뼯��
			Student s = new Student();
			System.out.println("�������ţ�");
			int id = scan.nextInt();
			if(id==100000){
				System.out.println("¼����ϣ��˳���");
				break;
			}
			s.setId(id);
			System.out.println("������������");
			s.setName(scan.next());
			System.out.println("������ɼ���");
			s.setScore(scan.nextDouble());
			students.add(s);
			System.out.println("�ɹ�¼��һ��ѧ����");
			System.out.println(
					"¼����"+students.size()+"��ѧ����");
		}
		System.out.println(
				"�ܹ�¼����"+students.size()+"��ѧ����");
		//2.��ƽ����
		double sum = 0;//�ܷ�Ĭ��Ϊ0
		for(int i=0;i<students.size();i++){
			double score = students.get(i).getScore();
			//ÿ��ȡ��һ��ѧ���ķ����ۼӵ�sum��
			sum += score;
		}
		//students.size()��ʾ�����������е�����
		System.out.println("ƽ����Ϊ��"+sum/students.size());
		
		//3.�󼰸���
		double count = 0;//��ʾ�������� Ĭ��Ϊ0
		for(int i=0;i<students.size();i++){
			double score = students.get(i).getScore();
			if(score>=60){
				count++;//��������60���ۼ�1
			}
		}
		System.out.println("������Ϊ��"+count/students.size());
		//��չ��
		//ѧ������85���ϰ���85��Ϊ����
		//70-84��Ϊ����
		//60-69��Ϊ����
		//0-59��Ϊ������
		//����ĸ����İٷֱ�
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
		System.out.println("���㵵ռ��"+count1/students.size());
		System.out.println("���õ���"+count2/students.size());
		System.out.println("������"+count3/students.size());
		System.out.println("������ռ��"+count4/students.size());
		
		
		
		//����߷�
		double max = 0;//ָ��Ĭ��ֵΪ0
		for(int i=0;i<students.size();i++){
			if(students.get(i).getScore()>max){
				max = students.get(i).getScore();
			}
		}
		System.out.println("��߷�Ϊ"+max);
		//����ͷ�
		double min = 100;//ָ��Ĭ��ֵΪ0
		for(int i=0;i<students.size();i++){
			if(students.get(i).getScore()<min){
				min = students.get(i).getScore();
			}
		}
		System.out.println("��ͷ�Ϊ"+min);
		
		
		
		
		
	}

}
