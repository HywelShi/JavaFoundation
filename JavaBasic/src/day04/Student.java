package day04;

public class Student {
	//����˽�л� ��Ϊ������
	//���ԣ�����
	//��Ϊ������
	private int id;//Ĭ��ֵΪ0
	private String name;//null
	private int age;
	private String address;
	private double score;//�ɼ�
	
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	//����get/set����
	//Alt+Shift+S ѡ��Generate Getters And Setters
	//��ѡ���е����� Ok����
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	
}
