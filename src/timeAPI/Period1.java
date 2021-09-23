package timeAPI;

import java.time.LocalDate;
import java.time.Period;

public class Period1 {
	public static void main(String[] args) {
		LocalDate d1 = LocalDate.of(2020, 1, 1);
		LocalDate d2 = LocalDate.of(2020, 1, 4);
		
		// 3日間を表すPeriodを2通りの方法で生成
		Period p1 = Period.ofDays(3);
		Period p2 = Period.between(d1,d2);
		
		System.out.println(p1); // P3D
		System.out.println(p2); // P3D
		
		// d2のさらに3日後を計算する
		LocalDate d3 = d2.plus(p2);
		System.out.println(d3); // 2020-01-07
	}
}

// 「2つの日付の間隔」や「2つの時刻の間隔」を格納するAPIは"Durarionクラス"と"Periodクラス"。
// サマータイムや閏年なども考慮しながら日数ベースで期間を管理する必要がある場合は、Periodクラスを使用する。
