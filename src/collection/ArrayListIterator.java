package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("ゴン");
		names.add("キルア");
		names.add("クラピカ");
		
		// イテレータでリストの中身を取り出す ※イテレータ：リストに含まれる一つの箱を「ココ！」と」指している矢印のようなもなもの
		Iterator<String> it = names.iterator(); // イテレータのインスタンス生成ではnewは使わない
		
		while (it.hasNext()) { // 矢印を次に進められるなら繰り返す
			String e = it.next(); // 矢印を次に進め、内容を取り出す
			System.out.println(e);
		}
	}
}
