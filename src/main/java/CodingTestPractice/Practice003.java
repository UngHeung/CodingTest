package CodingTestPractice;

public class Practice003 {
	/**
	 * 옹알이 (1)
	 * 머쓱이는 태어난지 6개월 된 조카를 돌보고 있습니다.
	 * 조카는 아직 "aya", "ye", "woo", "ma"
	 * 네 가지 발음을 최대 한 번씩 사용해 조합한(이어 붙인)
	 * 발음밖에 하지 못합니다. 문자열 배열 babbling이
	 * 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는
	 * 단어의 개수를 return하도록 solution 함수를 완성해주세요.
	 * 
	 * 제한사항
	 * : 1 <= babbling의 길이 <= 100
	 * : 1 <= babbling[i]의 길이 <= 15
	 * : babbling의 각 문자열에서 "aya", "ye", "woo", "ma"는
	 *   각각 최대 한 번씩만 등장합니다.
	 *   즉, 각 문자열의 가능한 모든 부분 문자열 중에서
	 *   "aya", "ye", "woo", "ma"가 한 번씩만 등장합니다.
	 * : 문자열은 알파벳 소문자로만 이루어져 있습니다.
	 * 
	 * 입출력 예 (babbling -> result)
	 * ["aya", "yee", "u", "maa", "wyeoo"] -> 1
	 * ["ayaye", "uuuma", "ye", "yemawoo", "ayaa"] -> 3
	 */
}

class Solution {
	public int solution(String[] babbling) {
		int answer = 0;
		for (String word : babbling) {
			if (checkWord(word)) {
				answer += 1;
			}
		}
		return answer;
	}
	
	final String[] possibleWordList = {"aya", "woo", "ye", "ma"};
	
	private boolean checkWord(String word) {
		int wordLength = word.length();
		int lengthCount = 0;
		for (String possibleWord : possibleWordList) {
			if (word.contains(possibleWord)) {
				lengthCount += possibleWord.length();
			}
		}
		return checkCount(wordLength, lengthCount);
	}
	
	private boolean checkCount(int wordLength, int lengthCount) {
		if (wordLength == lengthCount) {
			return true;
		}
		return false;
	}
}