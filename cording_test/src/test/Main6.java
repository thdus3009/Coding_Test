package test;

import java.io.*;
import java.util.*;

public class Main6 {
	//���ڸ� ���ڿ��� �޾ƿ� ����� ó������ ���������� ������ �� �ڸ��� ���� ������, 10�� �Ѵ� �ڸ����� �ڸ��ø��� ����
	//1 9 �Է�
	
	public static void main(String[] args)throws Exception {
		Scanner sc  = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		String s1;
		String s2;
		
		//ū�� ���� ������
		if(n1>n2) {
			s1 = Integer.toString(n1);
			s2 = Integer.toString(n2);
		}else {
			s1 = Integer.toString(n2);
			s2 = Integer.toString(n1);
		}
		
		String[] arr1 = s1.split(""); 
		String[] arr2 = s2.split(""); //�� �� ���� scanner�� �޾Ƽ� �迭�� �ֱ�
		
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
		int a = 0;
		int sum=0;
		Stack<String> stack3 = new Stack<String>();
		
		for(int i=0; i<arr1.length; i++) {
			
			if(stack2.empty()!=true&&stack2.empty()!=true) {
				a = sum+Integer.parseInt(stack1.pop())-Integer.parseInt(stack2.pop());
			}else if(stack2.empty()==true){
				a = sum+Integer.parseInt(stack1.pop());
			}
			
			if(a<0) {
				sum=-1;
				a=10+a;
				stack3.push(Integer.toString(a));
			}else {
				sum=0;
				stack3.push(Integer.toString(a));
			}

		}
		System.out.println(">"+stack3.search(0));
		//���
		//System.out.println(stack3.size());
		//for(int i=0; i<(stack3.size()); i++) {
		for(int i=0; i<arr1.length; i++) {
			if(stack3.empty()) {
				break;
			}
			System.out.print(stack3.pop());
			//bw.write(stack3.pop());
		}
		//�����϶�
		
		bw.flush();
		bw.close();
	}
	
}