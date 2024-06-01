// this is program to print inverted pattern of stars

package com.Patterns.java;

public class InvertedStars {

	public static void main(String[] args) {

		 int i,j;
		 
		 for(i=1;i <= 5;i++)
		 {
			 for(j=1;j<=(5-i+1);j++)
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	}

}
