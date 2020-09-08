package programmers;

import java.util.HashMap;
import java.util.Map;

public class hash_2_phone_number_list {
	public static void main(String[] args) {
		String[] phone_book = {"12","123","1235","567","88"};
		
		boolean answer = true;
		Map<String, Integer> map = new HashMap<>();
		
		for(int i=0; i<phone_book.length; i++) {
			map.put(phone_book[i], 1);
		}
		
		loop:
		for(String s:map.keySet()) {
			for(int i=0; i<phone_book.length; i++) {
				if(s==phone_book[i]) continue;
				
				if(phone_book[i].startsWith(s)) {
					answer =false;
					break loop;
				}
				
			}
		}
		
		System.out.println(answer);
	}
}
