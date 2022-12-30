package CodingTestPractice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Practice005Test {
	private Solution sol = new Solution();
	
	private final int[] testCase1 = {2, 1, 1, 2, 3, 1, 2, 3, 1};
	private final int[] testCase2 = {1, 3, 2, 1, 2, 1, 3, 1, 2};
	private final int[] testCase3 = {1, 2, 3, 1, 2, 3, 1, 3, 1, 2, 3, 1};
	private final int[] testCase4 = {1, 3, 2, 3, 2, 3, 1, 1, 2, 3, 1, 2, 3, 2, 2, 1, 2, 3, 1, 1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 1, 1};
	
	
	private final int expectedResultCase1 = 2;
	private final int expectedResultCase2 = 0;
	private final int expectedResultCase3 = 2;
	private final int expectedResultCase4 = 4;
	
	@Test
	public void test01() {
		assertEquals(sol.solution(testCase1), expectedResultCase1);
	}

	@Test
	public void test02() {
		assertEquals(sol.solution(testCase2), expectedResultCase2);
	}

	@Test
	public void test03() {
		assertEquals(sol.solution(testCase3), expectedResultCase3);
	}
	
	@Test
	public void test04() {
		assertEquals(sol.solution(testCase4), expectedResultCase4);
	}

}
