package test;

import java.io.*;
import java.util.*;

public class Main4{
    public static void main(String[] args)throws Exception{
        Scanner sc  = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 

        int n1 = sc.nextInt();
        String n2 = sc.next();
        String[] array = new String[n1];
        array = n2.split("");
        
        Stack<String> stack1 = new Stack<String>();
        for(int i=0; i<n1; i++){ //i=0; i<n1; i++ 형태로 넣으면 순서가 반대로 출력된다.
            stack1.push(array[i]);
        } //입력:12345 출력:54321
        
        Stack<String> stack2 = new Stack<String>();
        for(int i=0,cnt=0; i<n1; i++,cnt++){
        	
        	if(cnt==3) {
        		stack2.push(",");
        		cnt=0;
        	}
        	stack2.push(stack1.pop());
        } //입력:543,21 출력:12,345
        
        int size = stack2.size();
        for(int i=0; i<size; i++) {
        	bw.write(stack2.pop());
        }
        bw.flush();
        bw.close();
    }
}