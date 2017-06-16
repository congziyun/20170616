package com.ahsdk.Demo;

import java.util.Arrays;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		String[] str={"张三","李四","王五","赵六"};
		List list=Arrays.asList(str);
		System.out.println(list);
		/*String name="臧三";
		String aaa=new String("臧三");*/
		
		Integer as=new Integer(1);
		int a=as;
		Integer[] arr={1,2,3,4,5};
		list=Arrays.asList(arr);
		System.out.println(list);
	}
}
