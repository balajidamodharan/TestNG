package org.sample;

public class Morning {
public static void main(String[] args) {
	int a=20;
	int b=15;
	int c=10;
	if((a>b)|(a<c)) {
		System.out.println("A");
	}
	else if((b>a)|(b>c)) {
		System.out.println("B");
	}
	
	else
		System.out.println("C");
	
	boolean k=(a>b)?true:false;
	System.out.println("The Value of K is :"+k);
}
}
