package com.app.java;

import java.util.ArrayList;
import java.util.List;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {-11,2,-3,24,-65,-3,74};
		List <Integer> result = new ArrayList<>();
		int sum=74; 
		getIndexes(array,sum,result);
		if(result.size() > 0) {
		for(int i=0;i<result.size();i++) {
				System.out.println(result.get(i));
			}
		}else {
			System.out.println("Not found");
		}
	}
	private static void getIndexes(int[] arr, int sum, List<Integer> result) {
		int prevCount = 0;
		int pos = 0;
		for(int i=0; i<arr.length;i++) {
			while(prevCount > sum) {
				prevCount = prevCount - arr[pos];
				result.remove(0);
				pos++;
			}
			if(arr[i] == sum) {
				if(!result.isEmpty()) {
					result.clear();
				}
				prevCount = arr[i];
				result.add(i);
				break;
			}else if(prevCount != sum){
				prevCount = prevCount+arr[i];
				result.add(i);
			}else {
				break;
			}
		}
		if(prevCount != sum) {
			result.clear();
		}
	}

}
