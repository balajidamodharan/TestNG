package org.sample;

public class hello {
public static void main(String[] args) {
	System.out.println("Start");
	for(int i=1;i<=10;i++) {
		if(i==5) {
			continue; 
		}
		
		System.out.println(i);
	}
	System.out.println("End");
}
}
