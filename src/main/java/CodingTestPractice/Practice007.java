package CodingTestPractice;

import java.util.ArrayList;
import java.util.List;

public class Practice007 {
	/**
	 * 신규 아이디 추천
	 * 
	 * 문자열 new_id가 매개변수로 넘어올 때
	 * 7개의 규칙을 기준으로 유효성 검사 및 규칙에 맞는 id를 반환한다.
	 * 
	 * 1. 대문자 -> 소문자
	 * 2. 소문자, 숫자, "-", "_", "."를 제외한 모든 문자 제거
	 * 3. 마침표가 2번 이상 연속될 경우 하나로 치환
	 * 4. 마침표가 처음 혹은 끝에 위치할 경우 제거
	 * 5. 빈 문자열인 경우 "a"를 대입
	 * 6. 길이가 16자 이상인 경우 첫 15자 외 제거
	 * 7. 길이가 2자 이하인 경우 마지막 문자를 길이가 3이 될 때까지 반복하여 끝에 추가
	 */
}

class Solution {
	private List<Character> recommendId = new ArrayList<>();
	
	public String solution(String new_id) {
		String answer = "";
		new_id = new_id.toLowerCase();
		for (int i = 0; i < new_id.length(); i++) {
			if (checkUnfitCharacter(new_id.charAt(i), i)) {
				recommendId.add(new_id.charAt(i));
			}
		}
		checkPeriodLocation();
		checkIdLength();
		answer = makeRecommendId();
		return answer;
	}
	
	private boolean checkUnfitCharacter(char element, int index) {
		if (element == '.') {
			return checkContinuationPeriod(index);
		}
		if (element == '-' || element == '_') {
			return true;
		}
		if ('0' <= element && element <= '9') {
			return true;
		}
		if ('a' <= element && element <= 'z') {
			return true;
		}
		return false;
	}
	
	private boolean checkContinuationPeriod(int index) {
		if (recommendId.size() < 1) {
			return true;
		}
		if (recommendId.get(recommendId.size() - 1) == '.') {
			return false;
		}
		return true;
	}
	
	private void checkPeriodLocation() {
		if (recommendId.get(0) == '.') {
			recommendId.remove(0);
		}
		if (1 <= recommendId.size()) {
			if (recommendId.get(recommendId.size() - 1) == '.') {
				recommendId.remove(recommendId.size() - 1);
			}
		}
	}
	
	private void checkIdLength() {
		if (recommendId.size() == 0) {
			recommendId.add('a');
		}
		while (recommendId.size() < 3) {
			recommendId.add(recommendId.get(recommendId.size() - 1));
		}
		if (15 < recommendId.size()) {
			recommendId = recommendId.subList(0, 15);
		}
		checkPeriodLocation();
	}
	
	private String makeRecommendId() {
		StringBuilder result = new StringBuilder();
		for (char element : recommendId) {
			result.append(element);
		}
		return result.toString();
	}
}