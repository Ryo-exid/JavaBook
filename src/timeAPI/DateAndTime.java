package timeAPI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateAndTime {
	public static void main(String[] args) {
		// 文字列からLocalDateを生成
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate ldate = LocalDate.parse("2020/09/22", fmt);
		
		// 1000日後を計算する
		LocalDate ldatep = ldate.plusDays(1000);
		String str = ldatep.format(fmt);
		System.out.println("1000日後は" + str); // 1000日後は2023/06/19
		
		// 現在日付との比較
		LocalDate now = LocalDate.now();
		// isBeforeメソッド：引数で渡したインスタンスと前後関係を判定する ※isAfterメソッドもある
		if (now.isBefore(ldatep)) {
			System.out.println(ldatep + "は未来の日付です");
		}
	}
}
