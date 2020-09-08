package programmers;

import java.util.*;


public class hash_3_spy_costume {
	public static void main(String[] args) {
		String[][] clothes = {{"yellow_hat","headgear"},
							{"blue_sunglasses","eyewear"},
							{"green_turban","headgear"}}; 
					
		Map<String, Integer> map = new HashMap<>();
		int answer=1;
		
		//map을 <headgear,2>/<eyewear,1> 이런형태로 담을 예정
		for(int i= 0; i<clothes.length; i++) {
			if(map.get(clothes[i][1])==null)
				map.put(clothes[i][1], 1);
			else
				map.put(clothes[i][1], map.get(clothes[i][1])+1);
		}

		for(String s:map.keySet()) {
			answer *= map.get(s)+1;	//(2+1) * (1+1) = 6 		
		}
		//return answer-1;
		System.out.println(answer-1); //-1:전부안입은경우의 수는 빼준다.
	}
}
