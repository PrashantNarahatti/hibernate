package Collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Logger;

public class ScoreCard {

	public static void main(String[] args) {
		Map<String, Integer> mp = new HashMap<>();

		mp.put("Rahane", 20);
		mp.put("Rahul", 30);
		mp.put("Kohli", 150);
		mp.put("Dhoni", 50);
		mp.put("Lokesh", 2);

		System.out.println("Players who batted :");
		for (String key : mp.keySet()) {
			System.out.println(key);
		}

		System.out.println(mp);
		System.out.println("Scores by players");
		for (Entry<String, Integer> e : mp.entrySet()) {
			System.out.println(e);
		}

		System.out.println("Total Score :");
		int sum = 0;
		for (int value : mp.values()) {
			sum = value + sum;
		}
		System.out.println(sum);
		System.out.println();
		int maxValueInmap = ((Collections.max(mp.values())));
		System.out.println("Name of highest Scorer :" + maxValueInmap);

		System.out.println("Runs Scored by Dhonib :" + mp.get("Dhoni"));

	}

}
