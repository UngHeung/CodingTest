package CodingTestPractice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Practice010Test {
	Solution sol = new Solution();
	
	int[] lottos01 = {44, 1, 0, 0, 31, 25};
	int[] lottos02 = {0, 0, 0, 0, 0, 0};
	int[] lottos03 = {45, 4, 35, 20, 3, 9};
	
	int[] win_nums01 = {31, 10, 45, 1, 6, 19};
	int[] win_nums02 = {38, 19, 20, 40, 15, 25};
	int[] win_nums03 = {20, 9, 3, 45, 4, 35};
	
	int[] result01 = {3, 5};
	int[] result02 = {1, 6};
	int[] result03 = {1, 1};
	
	@Test
	public void test01() {
		assertEquals(sol.solution(lottos01, win_nums01), result01);
	}
	
	@Test
	public void test02() {
		assertEquals(sol.solution(lottos02, win_nums02), result02);
	}
	
	@Test
	public void test03() {
		assertEquals(sol.solution(lottos03, win_nums03), result03);
	}
}
