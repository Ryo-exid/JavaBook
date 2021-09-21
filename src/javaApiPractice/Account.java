package javaApiPractice;

public class Account {
	String accountNumber; // 口座番号
	int balance; // 残高
	
	// 文字列表現のメソッド
	public String toString() {
		return "¥" + this.balance + "（口座番号：" + this.accountNumber + "）";
	}
	
	// 等価判定のメソッド（口座番号が等しければ等価と判断 ※「  4649」と「4649」は同じものとする）
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o instanceof Account) {
			Account a = (Account)o;
			String an1 = this.accountNumber.trim(); // trim()は文字列の前後の空白を取り除くメソッド
			String an2 = a.accountNumber.trim();
			if (an1.equals(an2)) {
				return true;
			}
		}
		return false;
	}
}
