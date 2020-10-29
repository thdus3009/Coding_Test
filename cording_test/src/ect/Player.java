package ect;

import java.util.*;

public class Player {
	public static void main(String[] args) {
	String[] participant = {"mislav","stando","mislav","ana"};
	String[] completion = {"mislav","stando","ana"};
	String a = solution(participant,completion);	
	System.out.println(a);
	}
	
	public static String solution(String[] participant, String[] completion) {
	        String answer = "";
	        Map<String, Integer> map = new HashMap<>();
	        
	        for(String a : participant) {
	        	map.put(a,map.getOrDefault(a, 0)+1);
	        }
	        
	        for(String a : completion) {
	        	map.put(a,map.getOrDefault(a, 0)-1);
	        }
	        
	        for(String a : completion) {
	        	if(map.get(a)!=0) {
	        		answer=a;
	        	}
	        }

	        return answer;
	}
	
}
