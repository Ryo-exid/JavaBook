package dateAndTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// 現在から100日後の日付を「西暦〇〇〇〇年〇〇月〇〇日」という形式で表示するプログラム（Date、Calendar、SimpleDateFormat）
public class CalendarAndDatePractice {
	public static void main(String[] args) {
		// ①現在の日時をDate型で取得
		Date now = new Date();
		Calendar c = Calendar.getInstance();
		
		// ②取得した日時情報をCalendarにセット
		c.setTime(now);
		
		// ③Calendarから「日」の情報を取得
		int day = c.get(Calendar.DAY_OF_MONTH);
		
		// ④取得した値に100足してCalendarの「日」にセット
		day += 100;
		c.set(Calendar.DAY_OF_MONTH, day);
		
		// ⑤Calendarの日付情報をDate型に変換
		Date future = c.getTime();
		
		// ⑥指定された形式で表示
		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
		System.out.println(f.format(future)); // 西暦2022年01月01日
	}
}
