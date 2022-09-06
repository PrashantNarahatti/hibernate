package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		int number=0,mark=0;
		ArrayList<Integer>numberArray=new ArrayList<>();
		ArrayList<Integer>markArray=new ArrayList<>();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		number=input.nextInt();
		
		numberArray.add(number);
		
		System.out.println("Enter the Mark :");
		for(int i=0;i<number;i++) {
		mark=input.nextInt();
		numberArray.add(mark);
		}
		System.out.println("Highest Mark :"+Collections.max(numberArray));
		float total=0;
		for(int num:numberArray) {
			total+=num;
			
		}
		float avg=(total/numberArray.size());
		System.out.println("Average Mark :" +numberArray.get(2));
		Collections.sort(numberArray);
		System.out.println("sorted :"+numberArray);
		
	}

}
