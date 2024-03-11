package com.javaspringsrecap.springbootrecapdemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleAlgo implements SortAlgo {
	
	public int[] sort(int[] numbers) {
		//logic for bubble
		return numbers;
	}

}
