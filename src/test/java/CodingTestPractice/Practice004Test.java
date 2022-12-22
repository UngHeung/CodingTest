package CodingTestPractice;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class Practice004Test {
	private Solution sol = new Solution();
	
	private final String[] IdListTestCase1 = {"muzi", "frodo", "apeach", "neo"};
	private final String[] IdListTestCase2 = {"con", "ryan"};
	private final String[] reportTestCase1 = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
	private final String[] reportTestCase2 = {"ryan con", "ryan con", "ryan con", "ryan con"};
	private final int kTestCase1 = 2;
	private final int kTestCase2 = 3;
	
	private final int[] expectedResultCase1 = {2, 1, 1, 0}; 
	private final int[] expectedResultCase2 = {0, 0};
	
	@Test
	public void test01() {
		int[] answer = sol.solution(IdListTestCase1, reportTestCase1, kTestCase1);
		assertEquals(Arrays.toString(answer), Arrays.toString(expectedResultCase1));
	}

	@Test
	public void test02() {
		int[] answer = sol.solution(IdListTestCase2, reportTestCase2, kTestCase2);
		assertEquals(Arrays.toString(answer), Arrays.toString(expectedResultCase2));
	}

}
