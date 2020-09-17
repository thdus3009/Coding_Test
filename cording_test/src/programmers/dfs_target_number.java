package programmers;

public class dfs_target_number {
	static int answer=0;
	public static void main(String[] args) {
		int[] numbers = {1,1,1};
		int target = 1;
		
		dfs(numbers,target,0); //함수에 대한 값을 창출하지 않아도 된다면 해당 함수는 void상태여도 된다.
		System.out.println(answer); 
	}
	
	public static void dfs(int[] numbers,int target, int index) {
		if(index==numbers.length) {
			int sum=0;
			for(int i=0;i<numbers.length; i++) {
				sum+=numbers[i];
			}
			if(sum==target) {
				answer++;
			}
		}else {
			numbers[index]*=1;
			dfs(numbers,target,index+1);
			
			numbers[index]*=-1;
			dfs(numbers,target,index+1); //순서대로 진행되는 객체지향 언어 특징을 이용한 재귀(dfs)
		}
	}
}
