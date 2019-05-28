package org.google;

import java.util.Scanner;

public class SampleS {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the String Value : ");
	String s1=s.next();
	boolean contains = s1.contains("@");
if(contains) {
		System.out.println("Valid Email Id");
}
		else {
			System.out.println("Invalid Email Id");
		}
}
}
