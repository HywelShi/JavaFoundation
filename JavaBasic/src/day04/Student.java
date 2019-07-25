package day04;

public class Student {
	//属性私有化 行为公开化
	//属性：变量
	//行为：方法
	private int id;//默认值为0
	private String name;//null
	private int age;
	private String address;
	private double score;//成绩
	
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	//设置get/set方法
	//Alt+Shift+S 选择Generate Getters And Setters
	//勾选所有的属性 Ok即可
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
