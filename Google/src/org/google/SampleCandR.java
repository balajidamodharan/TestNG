package org.google;

import java.util.Scanner;

public class SampleCandR {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter The Email : ");
	String s1=scanner.next();
	boolean contains = s1.contains("gmail");
	System.out.println(contains);
	String replace = s1.replace("gmail", "yahoo");
	System.out.println(replace);
}
}
