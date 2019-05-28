package org.google;

import java.util.Scanner;

public class Sample2 {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter The String : ");
String s1;
String s2;
s1=s.next();
s2=s.next();
boolean equalsIgnoreCase = s1.equalsIgnoreCase(s2);
System.out.println(equalsIgnoreCase);
}
}
