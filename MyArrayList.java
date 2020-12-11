package com.koreait.first.test;

public class MyArrayList {
	private int[] intArr = new int[0]; // 전역변수

	public int remove(int val) {
		int del = intArr[val];
		int[] temp = new int[intArr.length - 1]; // 배열이 줄어들어야 하니 -1을 넣어준다.
		for (int i = 0; i < intArr.length - 1; i++) { //
			if (i < val) {
				temp[i] = intArr[i]; //
			} else {
				temp[i] = intArr[i + 1];
			}
			// temp[i] = arr[i < val ? i : i+1]; //한줄로 구현가능
		}
		intArr = temp;

		return del;
	}

	public void add(int val) {
		int[] temp = new int[intArr.length + 1];
		temp[intArr.length] = val;
		for (int i = 0; i < intArr.length; i++) {
			temp[i] = intArr[i];
		}
		intArr = temp;

	}

	public void add(int val, int val2) {
		int[] temp = new int[intArr.length + 1]; // 확장하기위한 배열 만듬
		temp[val] = val2; // 새로운 배열 [칸]값에 입력하는 숫자를 넣는다.
		for (int i = 0; i < intArr.length; i++) {
			if (i < val) { // i가 돌때 val2보다 작으면 temp 배열에 intArr값을 넣는다.
				temp[i] = intArr[i];
			} else { // i가 val2보다 크면 temp[+1]배열에 intArr값을 넣는다.
				temp[i + 1] = intArr[i];
			}

		}
		intArr = temp;
	}

	public int get(int idx) {
		return intArr[idx];
	}

/*	@Override
	public String toString() {
		String str = "[";
		for (int i = 0; i < intArr.length; i++) {
			str += intArr[i] +(  i < intArr.length - 1 ? "," : "");
		}

		str += "]";
		return str;
	}*/

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < intArr.length; i++) {
			sb.append(intArr[i]);
			
			if(i<intArr.length -1) {
				sb.append(",");
			}
			
					}
		sb.append("]");
		return sb.toString();
	}
}
