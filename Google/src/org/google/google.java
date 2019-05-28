package org.google;

public class google {
public static void main(String[] args) {
	String s="Welcome to java Program";
	System.out.println(s);
	String[] split = s.split(" ");
	System.out.println(split);
	for(int i=0;i<split.length;i++) {
		System.out.println(split[i]);
	}
}
}
