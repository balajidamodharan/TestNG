package org.google;


public class SampleStr2 extends SampleStr {
	static String a="Balaji";
	static int b=29121991;
	public static void username() {
	System.out.println("User Name is : "+a);
	System.out.println(SampleStr.c);
	

}
	public static void password() {
	System.out.println("Password is : "+b);
	System.out.println(c);

}
	public static void main(String[] args) {
		username();
		SampleStr2.password();
	}
}
