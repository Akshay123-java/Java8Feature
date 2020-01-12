package com.streamapiexample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreanApiTest {

	List <Integer> ls;
	public static void main(String[] args) {
		
		Integer[] a1={10,20,30,40,50,60,70,75,86,89};
		StreanApiTest st=new StreanApiTest();
		st.ls=new ArrayList<>();
		st.ls=Arrays.asList(a1);
		Stream< Integer> str=st.ls.stream().filter(pr->pr>30).filter(ad->ad%10==0);
       str.forEach(abc->System.out.println(abc));
	}

}
