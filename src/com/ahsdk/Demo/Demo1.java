package com.ahsdk.Demo;

public class Demo1 {

	public static void main(String[] args) {
		
		int[] arr={1,2,3,4,5,6};
		int a=sum(arr);
		System.out.println(a);
	} 
	
	public static int sum(int ...a){
		int sum=0;
		for (int i : a) {
			sum=sum+i;
		}
		return sum;	
	}
	
	
}
