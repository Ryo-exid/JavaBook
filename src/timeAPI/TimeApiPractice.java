package timeAPI;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// // 現在から100日後の日付を「西暦〇〇〇〇年〇〇月〇〇日」という形式で表示するプログラム（Time API）
public class TimeApiPractice {
	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate future = now.plusDays(100);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		System.out.println(future.format(fmt)); // 西暦2022年01月01日
	}
}
