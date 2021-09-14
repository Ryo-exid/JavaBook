package method;

public class Practice2 {
	public static void email(String title, String address, String text) {
		System.out.println(address + " に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
	
	// オーバーライド
	public static void email(String address, String text) {
		System.out.println(address + " に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);
	}
	
	public static void main(String[] args) {
		String title = "Hello!!";
		String address = "test@test.com";
		String text = "How are you?";
		
		email(title, address, text);
		System.out.println("===========================================");	
		email(address, text);
	}
}
