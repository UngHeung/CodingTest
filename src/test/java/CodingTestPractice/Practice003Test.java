package CodingTestPractice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Practice003Test {
	private Solution sol = new Solution();
	private String[] testCase1 = {"aya", "yee", "u", "maa", "wyeoo"};
	private String[] testCase2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
	
	private int expectedResultCase1 = 1;
	private int expectedResultCase2 = 3;
	
	@Test
	public void test01() {
		assertEquals(sol.solution(testCase1), expectedResultCase1);
	}
	
	@Test
	public void test02() {
		assertEquals(sol.solution(testCase2), expectedResultCase2);
	}
}
