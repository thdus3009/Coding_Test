package test;

import java.util.Scanner;

public class Main3{
    
	 public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      if (n != 1) {

	         func(n);
	      }
	      System.out.println(n);
	   }

	   public static void func(int n) {
	      if (n % 2 == 1) { // È¦¼ö
	         n = 3 * n + 1;
	         if (n == 1) {
	            System.out.println(n);
	            return;
	         }
	         func(n);
	         System.out.println(n);
	     
	      } else { // Â¦¼ö
	         n = n / 2;
	         if (n == 1) {
	            System.out.println(n);
	            return;
	         }
	         func(n);
	         System.out.println(n);
	      }
	   }

}