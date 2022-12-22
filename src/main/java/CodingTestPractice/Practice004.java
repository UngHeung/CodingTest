package CodingTestPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
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
		
		List<String> sanctionList = new ArrayList<>();
		int[] reportCount = new int[id_list.length];
		String[] array = new String[2];
		for (String element : reportList) {
			array = element.split(" ");
			reportCount[userIndex.get(array[1])]++;
			if (reportCount[userIndex.get(array[1])] >= k) {
				sanctionList.add(array[1]);
			}
		}
		return answer;
	}
}