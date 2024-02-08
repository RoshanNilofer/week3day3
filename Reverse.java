package week3.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] split = test.split(" ");
		List<String> obj=new ArrayList<String>();
		for(int i=0; i<split.length; i++) {
			if(i%2 != 0) {
				char[] charArray = split[i].toCharArray();
				for(int j=charArray.length-1; j>=0; j--)
				{
				System.out.print(charArray[j]);
			    }
			}
				else
				{
					System.out.print(" ");
				System.out.print(split[i]+" ");
			}
			
           }}}

