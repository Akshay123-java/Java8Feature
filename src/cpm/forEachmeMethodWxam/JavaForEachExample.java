package cpm.forEachmeMethodWxam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class JavaForEachExample {
	
	List<String> exmp;

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        String[] x={"Xye" ,"pqr" ,"mno" ,"str"};
        
		
		JavaForEachExample js=new JavaForEachExample();
		
		js.exmp= new ArrayList<>();
	//	js.exmp=Arrays.asList(x);
		js.exmp.add("Akshay");
		js.exmp.add("Mohansh");
		js.exmp.add("Nitin");
		js.exmp.add("Suraj");
		js.exmp.add("Suraj");
		

	/*	Iterator<String> itr=js.exmp.iterator();
		while(itr.hasNext()){
			System.out.println(" This is by using a itterrator :->"+itr.next());
			
		}
		*/
		System.out.println("By using forEach method in Iterretor interface ");
		
		js.exmp.forEach(ask -> {
			System.out.println(ask);
		
		});
	}

}
