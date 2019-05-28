package org.google;

public class SampleL {
public static void main(String[] args) {
	System.out.println("Literal String");
	String s1="Welcome";
	String s2="Welcome";
	System.out.println(s1);
	System.out.println(s2);
	int i=System.identityHashCode(s1);
	int j=System.identityHashCode(s2);
	System.out.println(i);
	System.out.println(j);
	System.out.println();
	System.out.println("Non Literal String");
	String a1=new String("Selenium");
	String a2=new String("Selenium");
	System.out.println(a1);
	System.out.println(a2);
	int k=System.identityHashCode(a1);
	int l=System.identityHashCode(a2);
	System.out.println(k);
	System.out.println(l);
}
}
