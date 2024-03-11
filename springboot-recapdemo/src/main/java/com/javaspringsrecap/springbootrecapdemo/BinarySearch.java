package com.javaspringsrecap.springbootrecapdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {
	
	@Autowired
	private SortAlgo sortAlgo;
	
	
 public BinarySearch(SortAlgo sortAlgo) {
		super();
		this.sortAlgo = sortAlgo;
	}


public int binarySearchAl(int[] numbers, int numberToSearch) {
	 
	 //some sort logic
	 // i can use any sorting algo i like and as needed and search the numbertoSearch number
	 //like bubble sort, simple sort etc
	 // for this case i have BubbleAlgo for the sorting.
//	BubbleAlgo algo = new BubbleAlgo();
//	 int[] sortednum = algo.sort(numbers);
	 //this is not the dynamic so we wnat the aldo type
	 //to be defined in the main method.
	 //we can do that by using interface.
	
	int[] sortedNum = sortAlgo.sort(numbers);
	System.out.println(sortAlgo);
	 
	 //search the number
	 
	 return 1;
 }
}
