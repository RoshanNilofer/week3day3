package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		String[] company = {"HCL", "Wipro", "Aspire Systems", "CTS"};
		List<String> obj=new ArrayList<String>();
		System.out.println("Length of array " +company.length);
		for(int i=0; i<company.length; i++) {
			obj.add(company[i]);
		}
	        Collections.sort(obj);
	        System.out.println(obj);      
	        Collections.reverse(obj);
	        System.out.println(obj);
	       }
}
