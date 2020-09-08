package test;

import java.io.*;
import java.util.*;

public class Main5 {
	//숫자를 문자열로 받아와 뒤집어서 처음부터 마지막까지 모조리 한 자리씩 더한 다음에, 10이 넘는 자리마다 자리올림을 수행
	//1 9 입력
	
	public static void main(String[] args)throws Exception {
		Scanner sc  = new Scanner(System.in);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
		
		String n1 = sc.next();
		String n2 = sc.next();
		
		String[] arr1 = n1.split(""); 
		String[] arr2 = n2.split(""); //두 값 전부 scanner로 받아서 배열에 넣기
		
		//계산을 뒤에서 부터 해야하므로 stack사용
		Stack<String> stack1 = new Stack<String>();
		for(int i=0; i<arr1.length; i++) {
			stack1.push(arr1[i]);
		}
		
		Stack<String> stack2 = new Stack<String>();
		for(int i=0; i<arr2.length; i++) {
			stack2.push(arr2[i]);
		}
		
		//stack1 + stack2 더하기 > stack3에 넣고 꺼내서 출력하기(그대로하면 거꾸로 출력된다.)
		//stack1이 stack2보다 커야지만 출력된다. ?? 반대로 하면 왜안되지?
		int a;
		int sum=0;
		Stack<String> stack3 = new Stack<String>();
		for(int i=0; i<arr1.length+arr2.length; i++) {
			
			if(stack2.empty()==true&&stack1.empty()==true) { //둘다 비어있음
				if(sum==1) {
					stack3.push(Integer.toString(sum));
					sum=0;
				}else {
					break;
				}
			}else {
				if(stack1.empty()!=true&&stack2.empty()!=true) { //둘다 비어있지x
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
		//출력
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