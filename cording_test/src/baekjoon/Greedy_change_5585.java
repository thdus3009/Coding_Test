package baekjoon;

import java.util.Scanner;

public class Greedy_change_5585 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		n=1000-n;
		
		int count=0;
		
		if(n/500!=0) {
			count+=(n/500);
			n=n%500;
		}
		
		if(n/100!=0){
			count+=(n/100);
			n=n%100;
		}
		
		if(n/50!=0){
			count+=(n/50);
			n=n%50;
		}
		
		if(n/10!=0){
			count+=(n/10);
			n=n%10;
		}
		

		if(n/5!=0){
			count+=(n/5);
			n=n%5;
		}
		
		if(n/1!=0){
			count+=(n/1);
			n=n%1;
		}
		System.out.println(count);
	}
}
