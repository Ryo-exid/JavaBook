package collection;

import java.util.ArrayList;

public class ArrayListInteger {
	public static void main(String[] args) {
		ArrayList<Integer> points = new ArrayList<Integer>(); // Integer型でArrayListを宣言
		points.add(10);
		points.add(80);
		points.add(75);
		for (int i : points) {
			System.out.println(i);
		}
		
		// 明示的に変換する場合
		Integer i1 = Integer.valueOf(16);
		int i2 = i1.intValue(); // ラッパークラスからプリミティブ（基本データ）型に
		System.out.println(i2); // 16
	}
}

// ラッパークラス ...Byte,Short,Integer,Long,Float,Double,Character,Boolean
// ラッパークラス型のインスタンスとint型などのプリミティブ型のデータを自動変換することをオートボクシング、オートアンボクシングという。

// オートボクシング（プリミティブ型 → ラッパークラス）
// オートアンボクシング（ラッパークラス → プリミティブ型）
