package org.google;

import java.util.Scanner;

public class SampleCandR2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Address : ");
	String s1=sc.nextLine();
	boolean contains = s1.contains("Pincode-626101");
	System.out.println(contains);
	String replace = s1.replace("Pincode-626101", " ");
	System.out.println(replace);
}
}
