package test;

import java.io.*;
import java.util.*;

public class Main5 {
	//���ڸ� ���ڿ��� �޾ƿ� ����� ó������ ���������� ������ �� �ڸ��� ���� ������, 10�� �Ѵ� �ڸ����� �ڸ��ø��� ����
	//1 9 �Է�
	
	public static void main(String[] args)throws Exception {
		Scanner sc  = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		
		String n1 = sc.next();
		String n2 = sc.next();
		
		String[] arr1 = n1.split(""); 
		String[] arr2 = n2.split(""); //�� �� ���� scanner�� �޾Ƽ� �迭�� �ֱ�
		
		//����� �ڿ��� ���� �ؾ��ϹǷ� stack���
		Stack<String> stack1 = new Stack<String>();
		for(int i=0; i<arr1.length; i++) {
			stack1.push(arr1[i]);
		}
		
		Stack<String> stack2 = new Stack<String>();
		for(int i=0; i<arr2.length; i++) {
			stack2.push(arr2[i]);
		}
		
		//stack1 + stack2 ���ϱ� > stack3�� �ְ� ������ ����ϱ�(�״���ϸ� �Ųٷ� ��µȴ�.)
		//stack1�� stack2���� Ŀ������ ��µȴ�. ?? �ݴ�� �ϸ� �־ȵ���?
		int a;
		int sum=0;
		Stack<String> stack3 = new Stack<String>();
		for(int i=0; i<arr1.length+arr2.length; i++) {
			
			if(stack2.empty()==true&&stack1.empty()==true) { //�Ѵ� �������
				if(sum==1) {
					stack3.push(Integer.toString(sum));
					sum=0;
				}else {
					break;
				}
			}else {
				if(stack1.empty()!=true&&stack2.empty()!=true) { //�Ѵ� �������x
					a = sum+Integer.parseInt(stack1.pop())+Integer.parseInt(stack2.pop());
				}else if(stack2.empty()==true){
					a = sum+Integer.parseInt(stack1.pop());
				}else{
					a = sum+Integer.parseInt(stack2.pop());
				}
	
				if(a-10>=0) {
					sum=1;
					a=(a%10);
					stack3.push(Integer.toString(a));
				}else {
					sum=0;
					stack3.push(Integer.toString(a));
				}
			}

		}
		//���
		//System.out.println(stack3.size());
		//for(int i=0; i<(stack3.size()); i++) {
		for(int i=0; i<arr1.length+arr2.length; i++) {
			if(stack3.empty()) {
				break;
			}

			bw.write(stack3.pop());
		}
		
		bw.flush();
		bw.close();
	}
	
}