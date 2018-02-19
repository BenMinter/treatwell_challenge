package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import treatwell.BoxBuilder;

public class BoxBuilderTest {
	
	private String testBox4x4 =	  "┌--┐\n"
								+ "|  |\n" 
								+ "|  |\n" 
								+ "└--┘";
	
	private String testBox3x6 =   "┌-┐\n"
								+ "| |\n" 
								+ "| |\n"
								+ "| |\n"
								+ "| |\n"
								+ "└-┘";
	
	private String testBox2x2 =   "┌┐\n"
								+ "└┘";
	
	private String testBoxNotPossible = "";

	@Test
	public void test4x4Box() {
		//Test 4 x 4 box
		BoxBuilder boxTest = new BoxBuilder(4, 4);
		String testcase = boxTest.toString();
		assertTrue(testcase.equals(testBox4x4));
	}
	
	@Test
	public void test3x6Box(){
		//Test 3 x 6 box
		BoxBuilder boxTest = new BoxBuilder(3,6);
		String testcase = boxTest.toString();
		assertTrue(testcase.equals(testBox3x6));
	}
	
	@Test
	public void test2x2Box(){
		//Test 3 x 6 box
		BoxBuilder boxTest = new BoxBuilder(2,2);
		String testcase = boxTest.toString();
		assertTrue(testcase.equals(testBox2x2));
	}
	
	@Test
	public void test0x0Box(){
		//Test 3 x 6 box
		BoxBuilder boxTest = new BoxBuilder(0,0);
		String testcase = boxTest.toString();
		assertTrue(testcase.equals(testBoxNotPossible));
	}
	
	@Test
	public void test1x1Box(){
		//Test 3 x 6 box
		BoxBuilder boxTest = new BoxBuilder(1,1);
		String testcase = boxTest.toString();
		assertTrue(testcase.equals(testBoxNotPossible));
	}
	
	@Test
	public void testNegativeBox(){
		//Test 3 x 6 box
		BoxBuilder boxTest = new BoxBuilder(-1,-1);
		String testcase = boxTest.toString();
		assertTrue(testcase.equals(testBoxNotPossible));
	}
	
}
