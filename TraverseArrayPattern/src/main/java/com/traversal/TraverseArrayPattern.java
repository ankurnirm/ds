package com.traversal;
import java.util.Arrays;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class TraverseArrayPattern {
	
	final static Logger logger = Logger.getLogger(TraverseArrayPattern.class);
	
	public int[] arrayTraversingAndPrint(int column, int rows,int[][] arrayMatrix) 
	{
		//Checking for Null or Empty array
		nullorEmptyArray(arrayMatrix);
		logger.info("Input array is : "+Arrays.deepToString(arrayMatrix));

		int minRow = 0;
		int minColumn = 0;
		int maxRow = arrayMatrix.length - 1;
		int maxColumn = arrayMatrix[0].length - 1;
		int totalElementsInArray = rows * column;
		int countVar = 0;
		int[] tempArray = new int[rows * column];

		//loop for visiting total or all the elements in the array
		while (countVar < totalElementsInArray) 
		{
			/*
			 * Matrix top wall traversing with the boundary condition so that
			 * element visited s should not visit again in the matrix.
			*/
			for (int i = minColumn, j = minRow; j <= maxColumn
					&& countVar < totalElementsInArray; j++)
			{
				tempArray[countVar] = arrayMatrix[i][j];
				countVar++;
			}

			minRow++;

			// Array Matrix right wall traversing
			for (int i = minRow, j = maxColumn; i <= maxRow
					&& countVar < totalElementsInArray; i++) 
			{
				tempArray[countVar] = arrayMatrix[i][j];
				countVar++;

			}

			maxColumn--;

			// Array matrix bottom wall traversing
			for (int i = maxRow, j = maxColumn; j >= minColumn
					&& countVar < totalElementsInArray; j--) 
			{
				tempArray[countVar] = arrayMatrix[i][j];
				countVar++;
			}

			maxRow--;

			//Array matrix left wall traversing
			for (int i = maxRow, j = minColumn; i >= minRow
					&& countVar < totalElementsInArray; i--)
			{
				tempArray[countVar] = arrayMatrix[i][j];
				countVar++;
			}

			minColumn++;
		}

		logger.info("The output traversed array is: "+Arrays.toString(tempArray));

		return tempArray;
	}

	@SuppressWarnings("null")
	public void nullorEmptyArray(int[][] arrayMatrix)
	{
		if(null==arrayMatrix && arrayMatrix.length==0)
		{
			System.out.println("opps! Array looks Null or empty,Please enter a valid non empty array");
		}
	}
	
	//Driver method to visit the elements of array
	public static void main(String[] args) 
	{
		TraverseArrayPattern at = new TraverseArrayPattern();

		try (Scanner sc = new Scanner(System.in)) 
		{
			int column;
			int rows;
			int[][] arrayMatrix;

			System.out.println("Please enter the number of column in matrix: ");
			column = sc.nextInt();

			System.out.println("Please enter the number of rows in matrix: ");
			rows = sc.nextInt();

			arrayMatrix = new int[rows][column];

			for (int i = 0; i < arrayMatrix.length; i++) {
				for (int j = 0; j < arrayMatrix[0].length; j++) {
					System.out.println("Please enter the element (" + i + "," + j + ")");
					arrayMatrix[i][j] = sc.nextInt();
				}
			}
			at.arrayTraversingAndPrint(column, rows, arrayMatrix);
		}
	}
}
