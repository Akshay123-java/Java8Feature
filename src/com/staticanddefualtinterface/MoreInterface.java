package com.staticanddefualtinterface;

interface Demo{
	
	public void call();
	
	public default void script(){
		
		
		System.out.println("This is the scipt method from demo interface ");
	}
	
	public static void print(int x){
		
		System.out.println("This is the print static method from interface demmo "+x);
		
	}
	
}

interface Test{
	
	public void call();
	
	default void script(){
		System.out.println("this is defulat method from test interface");
	}
	
	public static void print(int x){
		
		System.out.println("This is the print static method from interface test "+x);
		
	}
}

public class MoreInterface  implements Demo ,Test{
	
	@Override
	public void call() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void script() {
		// TODO Auto-generated method stub
		Demo.super.script();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Demo a1 = ()->System.out.println("This is the lambda exprestion and this can be used inside ony it is for demo interface ");
		
		a1.call();
		a1.script();
		Demo.print(10);
		
		
		
		Test a2=()->System.out.println("TTh9s is abstract methd of resr interface");
		a2.call();
		
		a2.script();
		Test.print(20);
		
	}


	
}
