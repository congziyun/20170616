package com.ahsdk.Demo;

public enum Person implements Runnable {
	A("张三") {
		@Override
		public void job() {
			System.out.println("扫地");
			
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
	},
	B("李四") {
		@Override
		public void job() {
			System.out.println("拖地");
			
		}

		@Override
		public void run() {
			System.out.println("李四的执行方法");
			
		}
	},
	C("王五") {
		@Override
		public void job() {
			System.out.println("擦灰");
			
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
	},
	D("赵六") {
		@Override
		public void job() {
			System.out.println("倒垃圾");
			
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
	},
	E("王麻子") {
		@Override
		public void job() {
			System.out.println("搽玻璃");
			
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
	};




	String name=null;
	private Person(String name){
		this.name=name;
	}
	
	public abstract void job();
	public void ect(){
		System.out.println("特能吃");
	}
}
