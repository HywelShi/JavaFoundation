package day05;
/**
 * 
 * @author shihongwei
 * @version 1.0
 *
 */
public class Person {
	//属性 私有化 保障数据安全
	private String name;
	private int age;
	private String address;
	//行为 公开化 保障行为能够被调用
	public void eat(){
		//System.out.println("有人在吃饭！");
	}
	public void drink(){
		System.out.println("喝水！");
	}
	public void sleep(){
		System.out.println("睡觉！");
	}
	public void study(){
		System.out.println("学习！");
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
	
	//添加get/set方法 Alt+Shift+S
	
	
	
	
	
	
	
	
	
	
	
	
}










