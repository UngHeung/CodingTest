package CodingTestPractice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Practice008Test {
	Solution sol = new Solution();
	
	private int[][] boardCase01 = {
			{0, 1, 0, 0, 1}, 
			{0, 3, 0, 0, 3}, 
			{2, 4, 0, 0, 2}, 
			{4, 1, 0, 2, 4}, 
			{1, 5, 1, 1, 5}};
	
	private int[][] boardCase02 = {
			{0, 0, 0, 0, 0}, 
			{0, 0, 1, 0, 3}, 
			{0, 2, 5, 0, 1}, 
			{4, 2, 4, 4, 2}, 
			{3, 5, 1, 3, 1}};
	
	private int[][] boardCase03 = {
			{0, 0, 0, 0, 0}, 
			{0, 2, 1, 0, 0}, 
			{0, 5, 2, 0, 2}, 
			{0, 4, 1, 3, 2}, 
			{1, 3, 5, 2, 3}};
	
	private int[] movesCase01 = {2, 5, 2, 5, 1, 1, 2, 3};
	private int[] movesCase02 = {1, 5, 3, 5, 1, 2, 1, 4};
	private int[] movesCase03 = {4, 3, 1, 2, 3, 3, 5, 4};
	
	private int expectedResultCase01 = 6;
	private int expectedResultCase02 = 4;
	private int expectedResultCase03 = 6;
	
	@Test
	public void test01() {
		assertEquals(sol.solution(boardCase01, movesCase01), expectedResultCase01);
	}
	
	@Test
	public void test02() {
		assertEquals(sol.solution(boardCase02, movesCase02), expectedResultCase02);
	}
	
	@Test
	public void test03() {
		assertEquals(sol.solution(boardCase03, movesCase03), expectedResultCase03);
	}
}
