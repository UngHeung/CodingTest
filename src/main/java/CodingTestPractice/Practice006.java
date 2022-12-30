package CodingTestPractice;

import java.util.HashMap;
import java.util.Map;

public class Practice006 {
	/**
	 * 지표 : RT / CF / JM / AN
	 * 
	 * 입력되는 유형 조사와 선택값을 통해 파악할 것
	 * 1 ~ 3은 왼쪽 유형에 점수 3 ~ 1점
	 * 5 ~ 7은 오른쪽 유형에 점수 1 ~ 3점
	 * 4는 두 유형 모두 0점을 준다.
	 * 유형별 입력된 점수를 합산하고 지표를 확인하여
	 * 지표에 작성된 두 유형 중 높은 점수의 유형을 출력
	 * 두 유형의 점수가 같은 경우 알파벳 순서 기준 먼저 오는 유형을 출력해준다
	 * 
	 * 입력 예
	 * survey : ["AN", "CF", "MJ", "RT", "NA"]
	 * choices : [5, 4, 2, 7, 5]
	 * 
	 * 과정
	 * AN(5) -> N형 1점
	 * CF(4) -> 0점
	 * MJ(2) -> M형 2점
	 * RT(7) -> T형 3점
	 * NA(5) -> A형 1점
	 * 
	 * 지표 1 -> T3, R0 -> T
	 * 지표 2 -> C0, F0 -> C
	 * 지표 3 -> M2, J0 -> M
	 * 지표 4 -> A1, N1 -> A
	 * 
	 * 출력
	 * "TCMA"
	 */
}

class Solution {
	public String solution(String[] survey, int[] choices) {
		String answer = "";
		
		setIndicator();
		for (int i = 0; i < survey.length; i++) {
			setScore(survey[i], choices[i]);
		}
		answer = makeAnswer();
		return answer;
	}
	
	private Map<Character, Integer> indicatorMap = new HashMap<>();
	
	private void setIndicator() {
		indicatorMap.put('R', 0); indicatorMap.put('T', 0);
		indicatorMap.put('C', 0); indicatorMap.put('F', 0);
		indicatorMap.put('J', 0); indicatorMap.put('M', 0);
		indicatorMap.put('A', 0); indicatorMap.put('N', 0);
	}
	
	private void setScore(String type, int choice) {
		char typeA = type.charAt(0), typeB = type.charAt(1);
		int score = Math.abs(choice - 4);
		
		if (choice < 4) {
			indicatorMap.put(typeA, indicatorMap.get(typeA) + score);
		}
		if (4 < choice) {
			indicatorMap.put(typeB, indicatorMap.get(typeB) + score);
		}
	}

	private String makeAnswer() {
		StringBuilder result = new StringBuilder();
		String indicator = "RTCFJMAN";
		for (int i = 0; i < indicator.length(); i += 2) {
			result.append(comparisonScore(indicator.charAt(i), indicator.charAt(i + 1)));
		}
		return result.toString();
	}
}
