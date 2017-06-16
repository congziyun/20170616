package com.ahsdk.Demo;



public class Demo3 {

	public static void main(String[] args) {
		
		//sum(Person.A);
		/*Person.C.job();
		Person.A.ect();
		Person.B.ect();
		Thread t1=new Thread(Person.B);
		t1.start();*/
		
		/*Person[] ps=Person.values();
		for (Person person : ps) {
			System.out.println(person+"---------"+person.name);
		}*/
		
		num();
		
	}
	
	public static void sum(Person p){
		System.out.println(p.name);
		
	}
	
	public static void num(){
		for (int i = 0; i <10; i++) {
			System.out.println(i);
		}
	}
}
