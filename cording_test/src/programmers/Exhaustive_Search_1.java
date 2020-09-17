package programmers;

import java.util.*;


public class Exhaustive_Search_1 {
	public static void main(String[] args) {
		String a="17";
		String[] str_arr = a.split("");
		int[] int_arr = new int[str_arr.length];
		
		for(int i=0; i<str_arr.length; i++) {
			int_arr[i]=Integer.parseInt(str_arr[i]);
		}
		
		Set<Integer> int_set = new HashSet<>(); //set�������: ���������Ҷ� �ߺ����ڴ� �����ϱ� ���ؼ�
		
		for(int i=1; i<=int_arr.length;i++) { //���� �� �ִ� ������ ���� : ex.i=1 > 1,7 / i=2 > 17,71
			func(str_arr, 0, i, int_set);
		}
		int answer = int_set.size();
		
		System.out.println(answer);
	}
	
	public static void func(String[] arr, int dept, int k, Set set) {
		
	}
}
