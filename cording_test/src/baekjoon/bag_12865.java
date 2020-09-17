package baekjoon;

import java.util.*;

public class bag_12865 {
	
	static int f_value=0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Map<Integer, Integer> map = new LinkedHashMap<>();
		int things = sc.nextInt(); //4
		int weight = sc.nextInt(); //7 무게
		
		for(int n=0; n<things;n++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			map.put(a, b); //key:무게   value:만족도
		}
		
		
	}
	public static int func(Map<Integer, Integer> map) {
		for(int a:map.keySet()) {
			if(f_value<map.get(a)) {
				f_value=map.get(a);
			}
		}
		
		return 0;
	}

}
