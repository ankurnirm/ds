package com.traversal;
import java.util.Arrays;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class TraverseArrayPattern {
	
	final static Logger logger = Logger.getLogger(TraverseArrayPattern.class);
	
	public int[] arrayTraversingAndPrint(int column, int rows,int[][] arrayMatrix) 
	{
		nullorEmptyArray(arrayMatrix);
		logger.info("Input array is : "+Arrays.deepToString(arrayMatrix));

		int minRow = 0;
		int minCol = 0;
		int maxRow = arrayMatrix.length - 1;
		int maxColumn = arrayMatrix[0].length - 1;
		int totalElementsInArray = rows * column;
		int countVar = 0;
		int[] tempArray = new int[rows * column];

		while (countVar < totalElementsInArray) 
		{
			// Top wall traversing
			for (int i = minCol, j = minRow; j <= maxColumn
					&& countVar < totalElementsInArray; j++)
			{
				tempArray[countVar] = arrayMatrix[i][j];
				countVar++;
			}

			minRow++;

			// Right wall traversing
			for (int i = minRow, j = maxColumn; i <= maxRow
					&& countVar < totalElementsInArray; i++) 
			{
				tempArray[countVar] = arrayMatrix[i][j];
				countVar++;

			}

			maxColumn--;

			// Bottom wall traversing
			for (int i = maxRow, j = maxColumn; j >= minCol
					&& countVar < totalElementsInArray; j--) 
			{
				tempArray[countVar] = arrayMatrix[i][j];
				countVar++;
			}

			maxRow--;

			// Left wall traversing
			for (int i = maxRow, j = minCol; i >= minRow
					&& countVar < totalElementsInArray; i--)
			{
				tempArray[countVar] = arrayMatrix[i][j];
				countVar++;
			}

			minCol++;
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
