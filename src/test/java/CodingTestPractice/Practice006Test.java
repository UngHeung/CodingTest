package CodingTestPractice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Practice006Test {
	private Solution sol = new Solution();
	
	private final String[] surveyTestCase1 = {"AN", "CF", "MJ", "RT", "NA"};
	private final String[] surveyTestCase2 = {"TR", "RT", "TR"};
	
	private final int[] choicesTestCase1 = {5, 3, 2, 7, 5};
	private final int[] choicesTestCase2 = {7, 1, 3};
	
	private final String resultCase1 = "TCMA";
	private final String resultCase2 = "RCJA";
	
	@Test
	public void test01() {
		assertEquals(sol.solution(surveyTestCase1, choicesTestCase1), resultCase1);
	}
	
	@Test
	public void test02() {
		assertEquals(sol.solution(surveyTestCase2, choicesTestCase2), resultCase2);
	}
}
