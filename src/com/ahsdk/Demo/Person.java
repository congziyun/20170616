package com.ahsdk.Demo;

public enum Person implements Runnable {
	A("����") {
		@Override
		public void job() {
			System.out.println("ɨ��");
			
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
	},
	B("����") {
		@Override
		public void job() {
			System.out.println("�ϵ�");
			
		}

		@Override
		public void run() {
			System.out.println("���ĵ�ִ�з���");
			
		}
	},
	C("����") {
		@Override
		public void job() {
			System.out.println("����");
			
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
	},
	D("����") {
		@Override
		public void job() {
			System.out.println("������");
			
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
	},
	E("������") {
		@Override
		public void job() {
			System.out.println("�벣��");
			
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
		System.out.println("���ܳ�");
	}
}
