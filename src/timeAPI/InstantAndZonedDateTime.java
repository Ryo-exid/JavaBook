package timeAPI;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantAndZonedDateTime {
	public static void main(String[] args) {
		// Instantの生成（世界における「ある瞬間」の時刻をナノ秒単位で正確に表すことができる）
		Instant i1 = Instant.now(); // 現在日時を取得
		System.out.println(i1); // 2021-09-23T09:39:27.660Z
		
		// Instantとlong値との相互変換
		Instant i2 = Instant.ofEpochMilli(1600705425827L);
		long l = i2.toEpochMilli();
		System.out.println(l); // 1600705425827
		
		// ZonedDateTimeの生成（どの都市を基準にするかを明確にするため、タイムゾーン（「Asia/Tokyo」や「Europe/London」など）を含んでいる）
		ZonedDateTime z1 = ZonedDateTime.now(); // 現在日時を取得
		ZonedDateTime z2 = ZonedDateTime.of(2020, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo")); // 「東京時間2020年1月2日3時4分5秒6ナノ秒」を指定して取得
		
		System.out.println(z1); // 2021-09-23T18:39:27.817+09:00[Asia/Tokyo]
		System.out.println(z2); // 2020-01-02T03:04:05.000000006+09:00[Asia/Tokyo]
		
		// instantとZonedDateTimeの相互変換
		Instant i3 = z2.toInstant();
		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));
		System.out.println(z3); // 2020-01-01T18:04:05.000000006Z[Europe/London]
		
		// ZonedDateTimeの利用方法
		System.out.println("東京：" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth()); // 東京：2020JANUARY2
		System.out.println("ロンドン：" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth()); // ロンドン：2020JANUARY1
		if (z2.isEqual(z3)) {
			System.out.println("これらは同じ瞬間を指しています。");
		}
	}
}

// Time APIのクラスの多くではnewが禁止されており、静的メソッドであるnow()やof()を使ってインスタンスを生成することになっている。
