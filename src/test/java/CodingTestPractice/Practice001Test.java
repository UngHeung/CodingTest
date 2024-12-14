package CodingTestPractice;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Practice001Test {
	private List<Integer> actualNumberList = new ArrayList<>();
	private List<Integer> expectedNumberList = new ArrayList<>();
	
	@Test
	public void test02() {
		Solution sol = new Solution();
		actualNumberList = List.of(40340, 23123, 4992, 99, 10101);
		expectedNumberList = List.of(11, 11, 24, 18, 3);
		
		for (int i = 0; i < actualNumberList.size(); i++) {
			int actualNumber = actualNumberList.get(i);
			int expectedNumber = expectedNumberList.get(i);
			assertEquals(sol.solution(actualNumber), expectedNumber);
		}
	}
}
