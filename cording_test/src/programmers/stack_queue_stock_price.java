package programmers;

public class stack_queue_stock_price {
	public static void main(String[] args) {
		int[] prices = { 1, 2, 3, 2, 3 };
		int[] answer = new int[prices.length];
		// 이중for문의 break는 하나의 for문만 빠져나갈 수 있다. i=0->i=1(j인덱스 for문 빠져나감)
		// 이중for문의 continue는 현재 진행되고 있는 for문을 멈추고 다음 for문을 진행한다. j=0->j=1 (다음 j인덱스 실행)

		int count = 0;
		for (int i = 0; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {

				if (prices[i] <= prices[j]) {
					count++;
				} else if (prices[i] > prices[j]) {
					count++;
					break;
				}
			}
			answer[i] = count;
			count = 0;
		}
		
		//answer[prices.length-1]=0; //어짜피 int형의 초기값은 0이므로 없어도 상관x
		
		for(int k=0; k<prices.length; k++) {
			System.out.println(answer[k]);
		}

	}
}
