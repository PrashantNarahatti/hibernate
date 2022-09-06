package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;


public class ListDemo {

	public static void main(String[] args) {
		
		Logger log=Logger.getLogger(ListDemo.class.getName());
		List<Integer> list=new ArrayList<>();
		list.add(8);
		list.add(1);
		//System.out.println(list);
		log.info("List:"+list);
		list.add(0,9);
		log.info("values added to list"+list);
//		System.out.println(list);
//		list.remove(7);
//		System.out.println(list);
//		
		Iterator i=list.iterator();
		
//		while(i.hasNext()) {
//			System.out.println(i.next());
//			
//			for(Integer number:list) {
//				System.out.println(number*number);
			}
		}
	


