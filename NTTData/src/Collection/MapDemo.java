package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> mp = new HashMap<>();
		mp.put(1, "Pacchu");
		mp.put(null, "Pranu");
		mp.put(1, "Raju");
		mp.put(2, "Anu");
		mp.put(3, null);
		// System.out.println(mp);

//		System.out.println(mp.get(3));
//		System.out.println(mp.entrySet());
//		System.out.println(mp.keySet());
//		System.out.println(mp.values());
//		
		for (Entry<Integer, String> e : mp.entrySet()) {
			System.out.println(e);
		}
		for (Integer e : mp.keySet()) {
			System.out.println(e);
		}
		for (String e : mp.values()) {
			System.out.println(e);
		}

	}

}
