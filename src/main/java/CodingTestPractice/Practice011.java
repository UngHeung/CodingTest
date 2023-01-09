package CodingTestPractice;

public class Practice011 {
	/**
	 * 1. 3번의 기회
	 * 2. 각 0 ~ 10점을 얻을 수 있음
	 * 3. S, D, T -> 1제곱, 2제곱, 3제곱 계산
	 * 4. *, # -> 해당 점수 마이너스, 해당 점수, 이전 점수 각 2배
	 * 5. *상이 처음에 나오는 경우 해당 점수만 2배
	 * 6. *상은 * 또는 #상과 중첩 가능 (4배 혹은 -2배)
	 */
}

class Solution {
	public int solution(String dartResult) {
		int answer = 0;
		for (int i = 0; i < dartResult.length(); i++) {
			scoreClassification(dartResult.charAt(i));
		}
		return answer;
	}
	
	private int[] scores = new int[3];
	private int index = 0;
	
	private void scoreClassification(char element) {
		if ('0' <= element && element <= '9') {
			checkNumber(element);
		}
		if (element == 'S' || element == 'D' || element == 'T') {
			checkArea(element);
			index++;
		}
		if (element == '*' || element == '#') {
			checkAward(element);
		}
	}
	
	private void checkNumber(char element) {
		if (element == '0') {
			if (scores[index] != 0) {
				scores[index] *= 10;
			}
		}
		if ('1' <= element && element <= '9') {
			scores[index] = element - 48;
		}
	}
	
	private void checkArea(char element) {
		if (element == 'D') {
			scores[index] = (int) Math.pow(scores[index], 2);
		}
		if (element == 'T') {
			scores[index] = (int) Math.pow(scores[index], 3);
		}
	}
}
