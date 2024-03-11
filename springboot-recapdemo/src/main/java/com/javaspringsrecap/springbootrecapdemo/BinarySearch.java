package com.javaspringsrecap.springbootrecapdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {
	
	
	//if there are multiple beans like in our case bubbleAlgo and QuickSortalgo then we can 
	//autowire in two ways 
	//1. use the beans name directly as below: (here the two beans bubbleAlgo and quickSortalgo are created since we put @componente annotation in)
	//BubbleAlgo and QuickSortalgo.
	//2.another one is putting the @primary annotaion in the Bean below the component annotaion
	//3.using the @qualifier annotation 
	@Autowired
	@Qualifier("quick")
	private SortAlgo sortAlgo;
	
	
//idea to use constructor injectio is when there mandatory dependecies like without SortAlogo the program wont run
	//but here constructor is not necessary we can just add the dependencies and put Autowired on top
// public BinarySearch(SortAlgo sortAlgo) {
//		super();
//		this.sortAlgo = sortAlgo;
//	}
	
	
	
	
//	public SortAlgo getSortAlgo() {
//		return sortAlgo;
//	}
//
//
//
//	public void setSortAlgo(SortAlgo sortAlgo) {
//		this.sortAlgo = sortAlgo;
//	}
//	


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
