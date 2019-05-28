package org.google;

import java.util.ArrayList;

public class SampleG {
public static void main(String[] args) {
	ArrayList<String> stu=new ArrayList();
	stu.add("Balaji");
	stu.add("D");
	stu.add("Balaji D");
	System.out.println(stu);
	System.out.println(stu.size());
	for (String string : stu) {
		System.out.println(string);
		
	}
	for(int i=0;i<stu.size();i++) {
		System.out.println(stu.get(i));
	}
}
}
