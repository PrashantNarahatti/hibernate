package Collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Pacchu");
		set.add("Pranu");
		set.add("Anu");
		set.add("Pacchu");
//		System.out.println(set);
//		System.out.println(set.contains("Pacchu"));

		Set<String> st = new TreeSet<>();

		st.addAll(set);
		System.out.println(st);
		
	}

}
