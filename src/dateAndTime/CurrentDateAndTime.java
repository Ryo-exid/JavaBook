package dateAndTime;

import java.util.Date;

public class CurrentDateAndTime {
	public static void main(String[] args) {
		Date now = new Date(); // 現在の日時を取得
		System.out.println(now); // Wed Sep 22 23:41:00 JST 2021
		
		// Dateインスタンスの内部に格納されているlong値を取り出す場合（セットしたい場合はsetTime()）
		System.out.println(now.getTime()); // 1632321660106
		
		Date past = new Date(1600705425827L);
		System.out.println(past); // Tue Sep 22 01:23:45 JST 2020
	}
}
