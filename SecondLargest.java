package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		int[] value={3, 2, 11, 4, 6, 7};
		List<Integer> obj=new ArrayList<Integer>();
		System.out.println("Length of array " +value.length);
		for(int i=0; i<value.length; i++) {
			obj.add(value[i]);
		}
	        Collections.sort(obj);
	        System.out.println(obj);
	        System.out.println(obj.get(1));

	}

}
