package CodingTestPractice;

public class Practice005 {
}

class Solution {
	public int solution(int[] ingredient) {
		int answer = 0;
		
		String str = "";
		for (int element : ingredient) {
			str += element;
		}
		
		int ingredientCount = ingredient.length;
		int length = 0;
		while (true) {
			length = str.length();
			str = str.replace("1231", "");
			
			if (length == str.length()) {
				break;
			}
		}
		
		answer = (ingredientCount - length) / 4;
		
		return answer;
	}
}
