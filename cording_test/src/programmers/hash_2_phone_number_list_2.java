package programmers;

public class hash_2_phone_number_list_2 {
	public static void main(String[] args) { //�ؽ�x
		
		String[] phone_book = { "12", "123", "1235", "567", "88" };
		boolean answer = true;

		for (int i = 0; i < phone_book.length; i++) {
			for (int j = 0; j < phone_book.length; j++) {
				if (i == j)
					continue;
				if (phone_book[j].indexOf(phone_book[i]) == 0) {// ���ξ���
					answer = false;
				}
			}
		}

		System.out.println(answer);
	}
}
