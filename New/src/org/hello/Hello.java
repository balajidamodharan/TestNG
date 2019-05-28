package org.hello;

import java.util.Scanner;

public class Hello {
public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	System.out.println("Enter your Age : ");
	int age=s.nextInt();
	System.out.println(age);
	if(age>=18) {
		System.out.println("Your Eligible to Vote");
	}
	else {
		System.out.println("Your not Eligible to vote");
	}
}
}
