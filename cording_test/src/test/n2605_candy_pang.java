package test;

import java.util.*;

public class n2605_candy_pang {
	
	static int[][] arr = new int[7][7]; //func���� ����ؾߵǼ� class�� ���ش�.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		int cnt = 0 ; //���ð����� 3���̻��� ��ϵ��� ������ ���� �������� 
		
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				int temp = 0;
				if(arr[i][j]!=0) { 
					temp = func(i,j,arr[i][j]); 
				}
				if(temp>=3) cnt++;
			}
		}
		
		System.out.println(cnt);
		
	}
	
	//�ش� ������ ã���� 0���� return, ��ã���� ��� Ž��
	public static int func(int row,int col,int color) {
		//�迭�� ����� ����(��� ������ 0~6 ��� ����)
		if(row==-1||col==-1||row==7||col==7) return 0;
		
		//�������� �ƴϸ� ���� 
		if(arr[row][col]!=color) return 0;
		
		//�������̸� 0���� ����
		if(arr[row][col]==color) arr[row][col] = 0;//������ ��ġ�ϸ� ����� ������� ������ 0���� ���� ��Ž���� �����Ѵ�.
		
		//��, ��, ��, �� �� Ž��
		return 1+func(row-1, col, color)+func(row+1, col, color)+func(row, col-1, color)+func(row, col+1, color);
	}
}
