package com.traversal.test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.traversal.TraverseArrayPattern;

public class TestTraverseArrayPattern
{
	private TraverseArrayPattern arrayTraversal;

	@Before
	public void setUp() 
	{
		arrayTraversal = new TraverseArrayPattern();
	}

	@Test
	public void test4By4Matrix() 
	{
		int[] outputMatrix;
		int[] resultMatrix = {1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11,10};
		outputMatrix = arrayTraversal.arrayTraversingAndPrint(4, 4,TestConstants.fourByFourArrayMatrix);
		assertTrue(Arrays.equals(resultMatrix, outputMatrix));
	}

	@Test
	public void test2By2Matrix()
	{
		int[] outputMatrix;
		int[] resultMatrix = {1, 2, 4, 3};
		outputMatrix = arrayTraversal.arrayTraversingAndPrint(2, 2,TestConstants.twoBytwoArrayMatrix);
		assertTrue(Arrays.equals(resultMatrix, outputMatrix));
	}

	@Test
	public void test3By3Matrix()
	{
		int[] outputMatrix;
		int[] resultMatrix = {1, 2, 3, 6, 9, 8, 7, 4, 5};
		outputMatrix = arrayTraversal.arrayTraversingAndPrint(3, 3,TestConstants.threeBythreeArrayMatrix);
		assertTrue(Arrays.equals(resultMatrix, outputMatrix));
	}
	
	@Test(expected = NullPointerException.class)
	public void TestNullCheck()
	{
		arrayTraversal.arrayTraversingAndPrint(3, 3,null);
	}
}
