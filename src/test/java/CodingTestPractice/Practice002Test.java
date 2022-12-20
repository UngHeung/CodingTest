package CodingTestPractice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Practice002Test {
	private String[] testCase1 = {"3 - 4 = -3", "5 + 6 = 11"};
	private String[] testCase2 = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
	private String[] testCase3 = {"3 + -1 - -11 = 12", "32 + 1 - -10 = 43", "5 - 6 + -1 = 2"};
	
	private String[] expectedResultCase1 = {"X", "O"};
	private String[] expectedResultCase2 = {"O", "O", "X", "O"};
	private String[] expectedResultCase3 = {"X", "O", "X"};
	
	@Test
	public void test01() {
		Solution sol = new Solution();
		
		String[] resultList = sol.solution(testCase1);
		
		for (int i = 0; i < expectedResultCase1.length; i++) {
			assertEquals(resultList[i], expectedResultCase1[i]);
		}
	}
	
	@Test
	public void test02() {
		Solution sol = new Solution();
		
		String[] resultList = sol.solution(testCase2);
		
		for (int i = 0; i < expectedResultCase2.length; i++) {
			assertEquals(resultList[i], expectedResultCase2[i]);
		}
	}
	
	@Test
	public void test03() {
		Solution sol = new Solution();
		
		String[] resultList = sol.solution(testCase3);
		
		for (int i = 0; i < expectedResultCase3.length; i++) {
			assertEquals(resultList[i], expectedResultCase3[i]);
		}
	}
}
