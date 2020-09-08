package test;

import java.util.*;

public class test {
	
	public static void main(String[] args) {

		Map<String,Integer> map = new HashMap<>();
		
		map.put("soyeon", 1);
		map.put("jisu", 1);
		map.put("soyeon", 2);
		map.put("soyeon", 3);

		System.out.println(map.get("soyeon")); // 3
		System.out.println(map.get("jisu"));  // 1
		
		for(String n : map.keySet()) {
			System.out.println(n); // Ãâ·Â: jisu soyeon 
		}
	}
}
