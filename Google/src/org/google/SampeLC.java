package org.google;

import java.util.ArrayList;

public class SampeLC {
public static void main(String[] args) {
	ArrayList stu=new ArrayList();
	stu.add("Balaji");
	stu.add(555);
	stu.add(555);
	stu.add('D');
	stu.add(1, 444);
	System.out.println(stu);
	System.out.println(stu.size());
	System.out.println(stu.get(4));
}
}

