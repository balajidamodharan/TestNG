package org.google;

import java.util.Scanner;

public class SampleC {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the phone No : ");
	String s1=s.next();
	int length = s1.length();
	if(length>10) {
		System.out.println("Invalid Number");
	}
	else {
		System.out.println("Valid Number");
	}
	}
}

