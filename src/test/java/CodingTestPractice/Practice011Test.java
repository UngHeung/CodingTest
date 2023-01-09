package CodingTestPractice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Practice011Test {
	private Solution sol = new Solution();
	
	private String dartResult01 = "1S2D*3T";
	private String dartResult02 = "1D2S#10S";
	private String dartResult03 = "1D2S0T";
	private String dartResult04 = "1S*2T*3S";
	private String dartResult05 = "1D#2S*3S";
	private String dartResult06 = "1T2D3D#";
	private String dartResult07 = "1D2S3T*";
	
	private int answer01 = 37;
	private int answer02 = 9;
	private int answer03 = 3;
	private int answer04 = 23;
	private int answer05 = 5;
	private int answer06 = -4;
	private int answer07 = 59;
	
	
	@Test
	public void test01() {
		assertEquals(sol.solution(dartResult01), answer01);
	}

	@Test
	public void test02() {
		assertEquals(sol.solution(dartResult02), answer02);
	}
	
	@Test
	public void test03() {
		assertEquals(sol.solution(dartResult03), answer03);
	}
	
	@Test
	public void test04() {
		assertEquals(sol.solution(dartResult04), answer04);
	}
	
	@Test
	public void test05() {
		assertEquals(sol.solution(dartResult05), answer05);
	}
	
	@Test
	public void test06() {
		assertEquals(sol.solution(dartResult06), answer06);
	}
	
	@Test
	public void test07() {
		assertEquals(sol.solution(dartResult07), answer07);
	}
}
