package test;

import java.util.*;

public class n2698_hanoi_top {

	static Scanner sc = new Scanner(System.in);
	static int n=0;
	static char[] arr = {'A','B','C'};

	
	static int count=0;
	
	public static void main(String[] args) {
		n = sc.nextInt();
		hanoi(n,0,2); // hanoi(원판갯수,시작위치(arr[0]),마지막위치(arr[2]))
		System.out.println(count);
	}
	public static void hanoi(int n, int start, int finish) {
		int mid = 1;
		
		if(n==1) { // 피보나치 수열처럼 1개였을 때의 값을 고정시켜준다.
			System.out.println("1 : "+arr[start]+"->"+arr[mid]);
			count++;
			System.out.println("1 : "+arr[mid]+"->"+arr[finish]);
			count++;
			return; //함수 종료
		}
		hanoi(n-1,start,finish);
		System.out.println(n+" : "+arr[start]+"->"+arr[mid]);
		count++;
		hanoi(n-1,finish,start);
		System.out.println(n+" : "+arr[mid]+"->"+arr[finish]);
		count++;
		hanoi(n-1,start,finish);
	}
}
