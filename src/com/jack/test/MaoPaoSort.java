package com.jack.test;

import java.util.Arrays;

/**
 * @author zhouyl
 * @date 2019年10月31日
 * @version 1.0
 */
public class MaoPaoSort {
	public static void main(String[] args) {
		int[] arr = { 2, 454, 989, 4854, 564, 2544, 41, 545, 454, 1, -1, 3 };
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i; j >= 0; j--) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
