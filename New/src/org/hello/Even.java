package org.hello;

import java.util.Scanner;

public class Even {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Value : ");
	int i=s.nextInt();
	System.out.println(i);
	if(i%2<=0) {
		System.out.println("Even Number");
	}
	else {
		System.out.println("Odd Number");
	}
}
}
