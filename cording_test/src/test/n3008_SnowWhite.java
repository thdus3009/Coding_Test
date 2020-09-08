package test;

import java.util.Arrays;
import java.util.Scanner;

public class n3008_SnowWhite {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int arr1[] = new int[9]; //가짜 포함 전체 난쟁이
		int arr2[] = new int[7]; //진짜 7명 난쟁이
		
		int lier1=0; //가짜난쟁이1
		int lier2=0; //가짜난쟁이2
		
		for(int i=0; i<9; i++) {
			arr1[i]=sc.nextInt();
		}
		
		//총 더한수 -i인덱스-j인덱스 ==100
		int sum=0;
		for(int i=0; i<9; i++) {
			sum+=arr1[i];
		}
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				if(arr1[i]==arr1[j]) {
					continue;
				}
				else if(sum-arr1[i]-arr1[j]==100) {
					lier1 = arr1[i];
					lier2 = arr1[j];
				}
			}
		}
		
		//가짜난쟁이2명을 제거한 나머지 난쟁이를 arr2배열에 옮긴다.
		int k = 0;
		for(int j=0; j<9; j++) {
			if(arr1[j]!=lier1&&arr1[j]!=lier2) {
				arr2[k] = arr1[j];
				k++; //증감연산자
			}
		}	
		
		Arrays.sort(arr2); //오름차순 
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		
	}	
}
