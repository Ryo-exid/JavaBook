package javaApiPractice;

public class Main {
	public static void main(String[] args) {
		Account a = new Account();
		a.accountNumber = "4649";
		a.balance = 1592;
		System.out.println(a);
		
		Account b = new Account();
		b.accountNumber = "4649";
		b.balance = 2000;
		if (a.equals(b) == true) {
			System.out.println("等価です。");
		} else {
			System.out.println("等価ではありません。");
		}
	}
}
