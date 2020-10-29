package ect;

import java.util.*;

public class Priority_Queue {
	public static void main(String[] args) {
	int[] scoville = {1,2,3,9,10,12};
	int k=7;
	int a = solution(scoville,k);	
	System.out.println(a);
	}
	
	public static int solution(int[] scoville, int K) {
		//PriorityQueue 우선순위큐 > 데이터를 꺼낼 때 우선순위가 가장 높은 데이터가 가장먼저 나온다.
		//우선순위큐는 힙(Heap)을 이용해 구현한다.
		//우순순위큐는 기본적으로 숫자가 낮은것이 우선순위가 높다.
	        int answer = 0;
	        PriorityQueue<Integer> heap = new PriorityQueue<>();
	        
	        for(int i:scoville) {
	        	heap.offer(i);
	        }
	        while(heap.peek()<=K) { //가장 숫자가 낮은게 우선으로 나오는데 그게 K보다 아직 작은지
	        	if(heap.size()==1) {
	        		return -1; //만약 heap에 들어있는 수가 5하나이고 k가 7일때 -1을 return (문제의 제한사항)
	        	}
	        	
	        	int a=heap.poll();
	        	int b=heap.poll();
	        	
	        	int result = a+(b*2);
	        	
	        	heap.offer(result);
	        	answer++;
	        }
	        
	        return answer;
	}
	
}
