package CodingTestPractice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Practice007Test {
	private Solution sol = new Solution();
	
	private String testCase1 = "...!@BaT#*..y.abcdefghijklm";
	private String testCase2 = "z-+.^.";
	private String testCase3 = "=.=";
	private String testCase4 = "123_.def";
	private String testCase5 = "abcdefghijklmn.p";
	private String testCase6 = "a.$.a";
	private String testCase7 = ".................";
	private String testCase8 = "-_.~!@#$%^&*()=+[{]}:?,<>/._-";
	private String testCase9 = ".adsffaFafesfas..adf.";
	private String testCase10 = "......a......a......a.....";
	
	private String expectedResultCase1 = "bat.y.abcdefghi";
	private String expectedResultCase2 = "z--";
	private String expectedResultCase3 = "aaa";
	private String expectedResultCase4 = "123_.def";
	private String expectedResultCase5 = "abcdefghijklmn";
	private String expectedResultCase6 = "a.a";
	private String expectedResultCase7 = "aaa";
	private String expectedResultCase8 = "-_._-";
	private String expectedResultCase9 = "adsffafafesfas";
	private String expectedResultCase10 = "a.a.a";
	
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
	
	@Test
	public void test05() {
		assertEquals(sol.solution(testCase5), expectedResultCase5);
	}
	
	@Test
	public void test06() {
		assertEquals(sol.solution(testCase6), expectedResultCase6);
	}
	
	@Test
	public void test07() {
		assertEquals(sol.solution(testCase7), expectedResultCase7);
	}
	
	@Test
	public void test08() {
		assertEquals(sol.solution(testCase8), expectedResultCase8);
	}
	
	@Test
	public void test09() {
		assertEquals(sol.solution(testCase9), expectedResultCase9);
	}

	@Test
	public void test10() {
		assertEquals(sol.solution(testCase10), expectedResultCase10);
	}
}
