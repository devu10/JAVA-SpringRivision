package com.javaspringsrecap.springbootrecapdemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortalgo implements SortAlgo {
	
	public int[] sort(int[] numbers) {
		//logic for quick
		return numbers;
	}


}
