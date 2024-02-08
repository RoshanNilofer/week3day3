package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		int[] a={3, 2, 11, 4, 6, 7};
		int[] b={1, 2, 8, 4, 9, 7};
		List<Integer> obj=new ArrayList<Integer>();
		List<Integer> obj1=new ArrayList<Integer>();
		System.out.println("Length of array " +a.length);
		for(int i=0; i<a.length; i++) {
			obj.add(a[i]);
			}
		System.out.println("Length of array " +b.length);
		for(int j=0; j<b.length; j++)
		{
			obj1.add(b[j]);
		}
		Collections.sort(obj);
	        System.out.println(obj);
	        Collections.sort(obj1);
	        System.out.println(obj1);
	        for (int i = 0; i < a.length-1; i++) {
	            if (obj1.contains(obj.get(i))) {
	                System.out.println(obj);
	            }
	       else
	        {
	                break;
	        }
	        }

	}

}
