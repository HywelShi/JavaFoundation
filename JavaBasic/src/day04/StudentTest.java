package day04;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		/**
		ʵ���ֶ�����ѧ��ѧ�� ���� ���� ��ַ���뵽������
		����exit�˳���ʾ�������
		��ȥ����һ��ѧ������ �жϴ�ѧ���ڲ������������
		����� ��ѧ����Ϣ���
		 */
		//���Ϻ����<>�������Ƽ����д洢���ݵ�����
		ArrayList<Student> students = 
				new ArrayList<Student>();
		//���ÿ���̨���뷽��
		Scanner scan = new Scanner(System.in);
		
		//��ϰ������forѭ����ѧ�������д���ʮ��ѧ��
		for(int i=1;i<=10;i++){
			Student s = new Student();
			//���뼯��֮ǰ��
			//����ÿһ��ѧ��������ĸ����Ե�ֵ
			//�ĸ�������Ҫ�ֶ�����
			System.out.println("������ѧ�ţ�");
			s.setId(scan.nextInt());
			System.out.println("������������");
			s.setName(scan.next());
			System.out.println("���������䣺");
			s.setAge(scan.nextInt());
			System.out.println("�������ַ��");
			s.setAddress(scan.next());
			students.add(s);
			System.out.println("����ѧ���ɹ���");
		}
		
		//���ѧ����Ϣ ����ѧ������
		for(int i=0;i<students.size();i++){
			System.out.println(
					"ѧ��Ϊ:"+students.get(i).getId()+
					"  ����Ϊ:"+students.get(i).getName()+
					"  ����Ϊ:"+students.get(i).getAge()+
					"  ��ַΪ:"+students.get(i).getAddress());
		}
		
		//����ĳһ��ѧ��
		
		
		//����һ������ ���߽б��
		int a = 1;
		System.out.println("���������ѧ����������");
		String name = scan.next();
		for(int i=0;i<students.size();i++){
			if(name.equals(students.get(i).getName())){
				a = 2;//ѧ�������Ա������򽫱�Ǹ�Ϊ2
				System.out.println(
						"ѧ��Ϊ:"+students.get(i).getId()+
						"  ����Ϊ:"+students.get(i).getName()+
						"  ����Ϊ:"+students.get(i).getAge()+
						"  ��ַΪ:"+students.get(i).getAddress());
			}
		}
		//ֻ��Ҫ�жϿ��ػ��߱�ǵ�ֵ����
		if(a==1){
			System.out.println("û�д�ѧ����");
		}else{
			System.out.println("�д�ѧ����");
		}
		
		
		
	}

}






