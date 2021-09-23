package timeAPI;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDateTime1 {
	public static void main(String[] args) {
		// LocalDateTimeの生成（ZonedDateTimeクラスのような、タイムゾーン情報を格納しない） ※プログラム開発で広く利用するのはLocalDateTimeクラスである
		LocalDateTime l1 = LocalDateTime.now(); // 現在日時を取得
		LocalDateTime l2 = LocalDateTime.of(2020, 1, 1, 9, 5, 0, 0); // 「2020年1月1日9時5分」を指定して取得
		
		System.out.println(l1); // 2021-09-23T19:03:21.653
		System.out.println(l2); // 2020-01-01T09:05
		
		// LocalDateTimeとZonedDateTimeの相互変換
		ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
		LocalDateTime l3 = z1.toLocalDateTime();
		
		System.out.println(l3); // 2020-01-01T09:05
	}
}
