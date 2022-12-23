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
		
		giveUserIndex(id_list);
		makeReportList(report);
		
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
		
		for (int i = 0; i < id_list.length; i++) {
			for (String element : reportList) {
				array = element.split(" ");
				if (array[0].equals(id_list[i])) {
					if(sanctionList.contains(array[1])) {
						answer[i]++;
						continue;
					}
				}
			}
		}
		return answer;
	}
	
	private Map<String, Integer> userIndex = new HashMap<>();
	private Set<String> reportList = new HashSet<>();
	
	private void giveUserIndex(String[] id_list) {
		for (int i = 0; i < id_list.length; i++) {
			userIndex.put(id_list[i], i);
		}
	}
	
	private void makeReportList(String[] report) {
		for (String element : report) {
			reportList.add(element);
		}
	}
}