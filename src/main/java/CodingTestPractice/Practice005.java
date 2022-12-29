package CodingTestPractice;

import java.util.Stack;

public class Practice005 {
	
}

class Solution {
	public int solution(int[] ingredient) {
		int answer = 0;
		
		for (int element : ingredient) {
			stackHamberger(element);
		}
		answer = count;
		return answer;
	}
	
	private int count = 0;
	private Stack<Integer> hamberger = new Stack<>();
	
	private void stackHamberger(int element) {
		hamberger.push(element);
		
		if (hamberger.size() < 4) return;
		if (hamberger.size() >= 4) {
			checkGredient();
		}
	}
}