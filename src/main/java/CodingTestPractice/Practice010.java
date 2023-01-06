package CodingTestPractice;

public class Practice010 {
	
}

class Solution0A {
	public int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = {};
		for (int number : win_nums) {
			lottoNumbers[number]++;
		}
		return answer;
	}
	
	private int[] lottoNumbers = new int[46];
}