package com.staticanddefualtinterface;

@FunctionalInterface
interface Calculation{

 public void add();
	
	default int print(){
		int i=20;
		int j=50;
		int k=i+j;
		System.out.println("this is defualt print method of inteface calculation : "+k);
	 return k;
	 
	}
	
	
}


public class DefualtMethodExmpl implements Calculation {
	
	public void add(){
		
		System.out.println("This is the abstract method in inteface clculation");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculation a1= new Calculation() {
			
			@Override
			public void add() {
				
				System.out.println("this is in inline function implementation of method");
				
			}
			
		};

		a1.add();
		a1.print();
		
		System.out.println(a1.print());
		
		
		
		Calculation a2= ()->System.out.println("This is using lambda expretion ");
		
		a2.add();
		a2.print();
		
	}

}
