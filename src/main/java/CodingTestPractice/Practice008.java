package CodingTestPractice;

import java.util.Stack;

public class Practice008 {
	/**
	 * 1. index j -> 층
	 * 2. index i -> 칸
	 * 
	 * 해당 칸에 값이 0이 아닐 때(비어있지 않을 때) 해당 값을 stack에 넣는다.
	 * 만약 가져온 값이 스택에 있다면 두 값을 모두 제거한다.
	 * 해당하는 칸에 값이 없는 경우 한 층 내려간다.
	 */
}

class Solution {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		floors = new int[board[0].length];
		for (int i = 0; i < moves.length; i++) {
			int move = moves[i] - 1;
			answer += popCount(move, board);
		}
		return answer;
	}
	
	private Stack<Integer> bucket = new Stack<>();
	private int[] floors;
	
	private int popCount(int move, int[][] board) {
		int result = 0;
		for (int j = 0; j < board[0].length; j++) {
			if (floors[move] < board[0].length) {
				int doll = board[floors[move]][move];
				
				floors[move]++;
				if (doll == 0) {
					continue;
				}
				
				if (bucket.isEmpty()) {
					bucket.push(doll);
					break;
				}
				
				if (bucket.peek() == doll) {
					bucket.pop();
					result += 2;
					break;
				}
				
				bucket.push(doll);
				break;
			}
		}
		return result;
	}
}
