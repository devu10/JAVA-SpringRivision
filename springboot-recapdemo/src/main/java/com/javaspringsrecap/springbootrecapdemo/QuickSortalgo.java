package com.javaspringsrecap.springbootrecapdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortalgo implements SortAlgo {
	
	public int[] sort(int[] numbers) {
		//logic for quick
		return numbers;
	}


}
