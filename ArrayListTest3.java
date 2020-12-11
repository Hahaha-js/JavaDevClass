package com.koreait.first.test;

public class ArrayListTest3 {
	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(1,500);
		
		
		
		System.out.println(list.get(0)); //100
		System.out.println(list.get(1)); //500
		System.out.println(list.get(2)); //200
		System.out.println(list.get(3)); //300
		
		System.out.println("---");
		
		System.out.println(list.remove(1));
		
		System.out.println("---");
		
		System.out.println(list.get(0)); //100
		System.out.println(list.get(1)); //500
		System.out.println(list.get(2)); //200
		
		
		System.out.println(list.toString());
		
		
		
		
		
		
		
		
//		int[] temp = new int[intArr.length + 1];
//		temp[val] = val2;
//		for (int i = 0; i < intArr.length; i++) {
//			if (i < val) {
//				temp[i] = intArr[i];
//
//			} else {
//				temp[i + 1] = intArr[i];
//			}
//
//		}
//		intArr = temp;
//	}
//		
	}
}
