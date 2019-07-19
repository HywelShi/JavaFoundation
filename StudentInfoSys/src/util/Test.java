package util;

public class Test {
	public static void main(String[] args) {
		DBUtil db = new DBUtil();
		System.out.println(db.createConnection());
	}
}
