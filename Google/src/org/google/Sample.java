package org.google;

import java.util.Scanner;

public class Sample {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
			System.out.println("Enter the String : ");
		String s1=s.next();
		String s2=s.next();
		boolean equals = s1.equals(s2);
		System.out.println(equals);
}
}
