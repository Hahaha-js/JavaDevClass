package com.koreait.first.test;

import java.util.List;
import java.util.ArrayList;

public class ArrayListTest2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
//		list.add("1");
//		list.add(true);
//		list.add(1.1);
//		
//		Object obj = 1;
//		obj = "1";
//		obj = true;
//		obj = 1.1;

		int a = list.get(0);

		System.out.println("a :" + a);

	}
}
