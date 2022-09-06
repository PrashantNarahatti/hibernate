package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;

public class StateSet {

	public static void main(String[] args) {
		int statesNo = 10;
		System.out.println("Total number of states :" + statesNo);
		Logger log = Logger.getLogger(StateSet.class.getName());
		LinkedHashSet<String> states = new LinkedHashSet<>();
		states.add("Karnataka");
		states.add("Punjab");
		states.add("Telangana");
		states.add("Maharashtra");
		states.add("Tamil Nadu");
		states.add("Uttar Pradesh");
		states.add("Punjab");
		states.add("Karnataka");
		states.add("Kerala");
		states.add("Delhi");

		log.info("LinkedHashSet:" + states);
//		System.out.println(states);
		states.remove(10);
		System.out.println(states);

//		Iterator i = states.iterator();
//
//		while (i.hasNext()) {
//
//			Object a = i.next();
//			if (a.equals("Delhi")) {
//				i.remove();
//				System.out.println("removed");
//			}
//		}

		System.out.println(states);
		
		Iterator e =states.iterator();

		while (e.hasNext()) {

			Object b = e.next();
			char ch = b.toString().charAt(0);
			
			if (ch=='K') {
			
				System.out.println("name starting with K :" + b.toString());
			}
		}
		Set<String> st = new TreeSet<>();

		st.addAll(states);
		System.out.println("states in a sorted order:"+st);
		
	}
}
