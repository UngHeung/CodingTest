package CodingTestPractice;

public class Practice009 {
	/**
	 * 1, 4, 7은 무조건 왼손
	 * 3, 6, 9는 무조건 오른손이다.
	 * 
	 * 키패드 위아래는 1칸당 숫자 3만큼의 차이가 있다
	 * 즉 3만큼의 차이는 1칸으로 볼 수 있다.
	 * 
	 * 눌러야 하는 번호(number)와 왼손, 오른손 위치의 차를 비교하여
	 * 적은 쪽의 손으로 번호를 누르며 해당 손의 번호가 누른 번호로 변경된다.
	 * 
	 * 왼손은 *에서 시작하며 위치상 10이 오는 자리이며 
	 * 오른손은 #, 12가 오는 자리이다.
	 * 0은 11로 친다.
	 * 
	 * 움직이는 방식
	 * 왼손으로 움직이는 경우 number = 5, leftHand = 1일 때
	 * 1 -> 2 -> 5 로 총 2번 움직이며
	 * Math.abs(5 - 1) / 3 + Math.abs(5 - 1) % 3 = 4 / 3 + 4 % 3 = 2
	 * 
	 * 오른손으로 움직이는 경우 number = 2, rightHand = 9일 때
	 * 9 -> 6 -> 3 -> 2 로 총 3번 움직이며
	 * Math.abs(2 - 9) / 3 + Math.abs(2 - 9) % 3 = 2 + 1 = 3
	 * 3으로 나누는 이유는 상하 1칸의 차가 3이기 때문이다.
	 */	
}

class Solution {
	public String solution(int[] numbers, String hand) {
		String answer = "";
		for (int number : numbers) {
			answer += checkLeftOrRight(number, hand);
		}
		return answer;
	}
	
	private int leftHand = 10;
	private int rightHand = 12;
	
	private String checkLeftOrRight(int number, String hand) {
		if (number == 0) number = 11;
		if (number == 1 || number == 4 || number == 7) {
			leftHand = number;
			return "L";
		}
		if (number == 3 || number == 6 || number == 9) {
			rightHand = number;
			return "R";
		}
		return checkHandLocation(number, hand);
	}
}