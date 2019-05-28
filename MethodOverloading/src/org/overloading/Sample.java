package org.overloading;

public class Sample {
	public void add() {
	System.out.println();

}
	public void add(int a) {
	System.out.println(a);
}
	public void add(String a) {
		System.out.println(a);
}
	public void add(String a,String b) {
		System.out.println(a+b);
}
	public void add(int a,String b) {
		System.out.println(a+b);
}
	public static void main(String[] args) {
	Sample s=new Sample();
	s.add();
	s.add(10);
	s.add("balaji");
	s.add(30,"Balaji");
	s.add("Bala", "JI");
	
		
	}
}