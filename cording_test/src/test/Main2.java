package test;

import java.util.Scanner;
import java.io.*;

public class Main2 {

	static int [][] Pascal= new int [51][51];
    public static void main(String[] args) {
    	 
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(test(a,b));
    }
    
    public static int test(int x, int y) {
    
     // �̷��� �����ϸ� �� �迭�� ���Ҵ� int�� �⺻��(default value)�� 0�� ������ �ʱ�ȭ�ȴ�.
    	
    	//1<=x,y<=50
    	if(x==1||y==1) {
    		return Pascal[x][y] = Pascal[y][x] = 1; //(1,x),(x,1) ���� 1�� �� 
    	}
    	
    	if(Pascal[x][y]!=0) {return Pascal[x][y];}
    	
    	else {
    		return Pascal[x][y] = Pascal[y][x] = (test(x-1, y) + test(x, y-1))%100000000;
    	}
    	
    }
}
