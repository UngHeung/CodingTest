package CodingTestPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Practice004 {
}

class Solution {
	public int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];
		
		Map<String, Integer> userIndex = new HashMap<>();
		for (int i = 0; i < id_list.length; i++) {
			userIndex.put(id_list[i], i);
		}
		
		Set<String> reportList = new HashSet<>();
		for (String element: report) {
			reportList.add(element);
		}
		return answer;
	}
}