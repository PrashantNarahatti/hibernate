package com.xworkz.apti;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bubble ob = new Bubble();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }

	}


