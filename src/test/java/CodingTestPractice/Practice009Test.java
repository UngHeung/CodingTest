package CodingTestPractice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Practice009Test {
	Solution sol = new Solution();
	
	private int[] numbers01 = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
	private int[] numbers02 = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
	private int[] numbers03 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
	private String hand01 = "right";
	private String hand02 = "left";
	private String hand03 = "right";
	private String result01 = "LRLLLRLLRRL";
	private String result02 = "LRLLRRLLLRR";
	private String result03 = "LLRLLRLLRL";
	
	@Test
	public void test01() {
		assertEquals(sol.solution(numbers01, hand01), result01);
	}
	
	@Test
	public void test02() {
		assertEquals(sol.solution(numbers02, hand02), result02);
	}
	
	@Test
	public void test03() {
		assertEquals(sol.solution(numbers03, hand03), result03);
	}
}
