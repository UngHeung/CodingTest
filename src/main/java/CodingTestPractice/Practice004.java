package CodingTestPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Practice004 {
}

class Solution {
	private Map<String, Set<String>> reportIdMap = new HashMap<>();
	private Map<String, Set<String>> reportedIdMap = new HashMap<>();

	public int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];
		setMap(id_list);
		return answer;
	}

	private void setMap(String[] id_list) {
		Set<String> reportIdSet, reportedIdSet;
		for (String id : id_list) {
			reportIdSet = new HashSet<>();
			reportedIdSet = new HashSet<>();
			reportIdMap.put(id, reportIdSet);
			reportedIdMap.put(id, reportedIdSet);
		}
	}
}