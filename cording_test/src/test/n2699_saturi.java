package test;

import java.util.*;

public class n2699_saturi {
	
	static Scanner sc = new Scanner(System.in);
	static String a,b;
	static int[][] arr;
	
	public static void main(String[] args) {
		a = sc.nextLine();
		b = sc.nextLine();
		
		arr = new int[b.length()+1][a.length()+1];
		for(int i=1; i<=b.length(); i++) {
			for(int j=1; j<=a.length(); j++) {
				
				if(b.charAt(i-1)!=a.charAt(j-1)) {
					arr[i] [j] = Math.max(arr[i][j-1], arr[i-1][j]);
				}else {
					arr[i][j] = arr[i-1][j-1]+1;
				}
			}
		}
		System.out.println(arr[b.length()][a.length()]);
		
//		사투리-비교 : sic o hwkdfj xo
//		서울말-중심 : w ocib h xs   >>chx >>중복3개
		
//		iukiam
//		mksism
	}

}
