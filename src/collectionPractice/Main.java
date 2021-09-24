package collectionPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		// 練習問題16-2
		Hero h1 = new Hero("斉藤");
		Hero h2 = new Hero("鈴木");
		List<Hero> heroes = new ArrayList<Hero>();
		heroes.add(h1);
		heroes.add(h2);
		for (Hero h : heroes) {
			System.out.println("勇者：" + h.getName());
		}
		
		System.out.println("====================");
		
		// 練習問題16-3
		Map<Hero, Integer> neoHeroes = new HashMap<Hero, Integer>();
		neoHeroes.put(h1, 3);
		neoHeroes.put(h2, 7);
		for (Hero nh : neoHeroes.keySet()) {
			int value = neoHeroes.get(nh);
			System.out.println(nh.getName() + "が倒した的＝" + value);
		}
	}
}
