package exception;

public class Main {
	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(-128); // 例外発生
	}
}
