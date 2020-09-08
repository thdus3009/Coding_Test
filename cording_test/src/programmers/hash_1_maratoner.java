package programmers;

import java.util.HashMap;
import java.util.Map;

public class hash_1_maratoner {
	public static void main(String[] args) {
		
		String[] participant = {"a","b","a","c","d"}; //a-2 b-1 c-1
		String[] completion = {"a","b","c"};
		
		Map<String, Integer> map = new HashMap<>();
		
		for(String p:participant) {
			if(map.get(p)==null) {
				map.put(p, 1);
			}else {
				int n = map.get(p)+1;
				map.put(p, n);
			}
		}
		
		for(String c:completion) {
			int n = map.get(c)-1;
			map.put(c, n);
		}
		
		for(String s:map.keySet()) { //저장되어있는 전체key값들 꺼내기
			if(map.get(s)!=0) {
				System.out.println(s);
			}
		}
		
	}
}
