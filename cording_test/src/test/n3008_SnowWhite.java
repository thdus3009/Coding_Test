package test;

import java.util.Arrays;
import java.util.Scanner;

public class n3008_SnowWhite {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int arr1[] = new int[9]; //��¥ ���� ��ü ������
		int arr2[] = new int[7]; //��¥ 7�� ������
		
		int lier1=0; //��¥������1
		int lier2=0; //��¥������2
		
		for(int i=0; i<9; i++) {
			arr1[i]=sc.nextInt();
		}
		
		//�� ���Ѽ� -i�ε���-j�ε��� ==100
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
		
		//��¥������2���� ������ ������ �����̸� arr2�迭�� �ű��.
		int k = 0;
		for(int j=0; j<9; j++) {
			if(arr1[j]!=lier1&&arr1[j]!=lier2) {
				arr2[k] = arr1[j];
				k++; //����������
			}
		}	
		
		Arrays.sort(arr2); //�������� 
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		
	}	
}
