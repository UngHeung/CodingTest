package CodingTestPractice;

public class Practice010 {
	
}

class Solution {
	public int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = {};
		for (int number : win_nums) {
			lottoNumbers[number]++;
		}
		
		for (int lotto : lottos) {
			if (lotto == 0) {
				countDeleteNumber++;
			}
		}
		return answer;
	}
	
	private int[] lottoNumbers = new int[46];
	private int countDeleteNumber = 0;
	private int countLotto = 0;
}