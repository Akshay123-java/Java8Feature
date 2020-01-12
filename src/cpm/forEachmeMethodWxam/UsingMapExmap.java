package cpm.forEachmeMethodWxam;

import java.util.HashMap;
import java.util.Map;

public class UsingMapExmap {
	
	Map<String ,Integer> mp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		UsingMapExmap a1=new UsingMapExmap();
		a1.mp=new HashMap<>();
       a1.mp.put("akshay",101);	
       a1.mp.put("Rajkumar",102);	
       a1.mp.put("Chidre",103);	
       a1.mp.put("Gopal",104);	
       
       a1.mp.put("Mohanish",105);	
       a1.mp.put("Bhoyer",106);	
       a1.mp.put("Bhoyer",107);	
       
       System.out.println(a1.mp.size());
       System.out.println(a1.mp);
       
       
       
       a1.mp.forEach((abc,xyz)->System.out.println(abc +"   " +xyz));
		
		
	}

}


	
	
