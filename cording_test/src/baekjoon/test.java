package baekjoon;

import java.util.*;


public class test {
	public static void main(String[] args) {
		String a = "123456";
		int[] arr = new int[6];
		for(int i=0;i<6;i++) {
			arr[i]=a.charAt(i)-'0';
			System.out.print(arr[i]+" ");
		}
	}
}
