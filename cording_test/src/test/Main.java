package test;

import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        System.out.println(test(a));
    }
    
    public static long test(long num) {
    //6�Է� > 6*5*4*3*2*1 = 720���
    	if(num ==1) {
    		return 1;
    	}else {
    		return num * test(num-1);
    	}
    }
 
}