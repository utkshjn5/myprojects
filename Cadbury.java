package com.app.cadbury;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cadbury {

	public static void main(String[] args) {
		int output =0;
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)){
			int M,N,P,Q;
			M=sc.nextInt();
			//N=sc.nextInt();
			P=sc.nextInt();
			///Q=sc.nextInt();
			List<Integer> length = new ArrayList<>();
			length.add(M);
			//length.add(N);
			List<Integer> breadth = new ArrayList<>();
			breadth.add(P);
			//breadth.add(Q);
			for(int i=0;i<length.size();i++) {
				for(int j = 0;j<breadth.size();j++) {
					int length1 = length.get(i);
					int breadth1 = breadth.get(j);
					while(length1 != 1 && breadth1 !=0) {
					if(length1 >= breadth1) {
						output++;
						int length2 = length1 - breadth1;
						if(length2 <= breadth1 || length2 ==1) {
							length1 = breadth1;
							breadth1 = length2;
						}else {
							length1 = length2;
						}
						if(length1==1) {
							output++;
						}
					}else if(length1 < breadth1) {
						int temp1=length1;
						length1 = breadth1;
						breadth1 = temp1;
					}
					}
					
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(output);
	}
	
	

}
