Problem statement:
                   Given a 2D array
					{{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12},
					{13,14,15,16}}
					Traverse the array in the pattern below and print the numbers along the path.
	


Output: 1,2,3,4, 8,12,16, 15,14,13, 9,5, 6,7, 11,10


Approach : The given 2d matrix has to be divide into 4 section and need to traverse in the top row then right side of the column 
then bottom row and the left row considering that the element already visited should not be repeated again 
and in the spiral way whole matrix should be traversed or visited

The problem statement is tried to simplify and broken down till some extent in problem_breakup_unederstanding.jpg:
https://github.com/ankurnirm/ds/blob/main/TraverseArrayPattern/problem_breakup_unederstanding.jpg


Logs: logs can be checked in the project directory TraverseArrayPattern/logs which can show the input array and the traversed output 

Driver code: The driver code can be executed from the class TraverseArrayPattern.java with the help of main method and which will ask for inputs like coloums, rows and the elements at runtime 

below is the example:

********************************************************************************************************************************************************

Please enter the number of column in matrix: 4
Please enter the number of rows in matrix: 4

Please enter the element (0,0)
1
Please enter the element (0,1)
2
Please enter the element (0,2)
3
Please enter the element (0,3)
4
Please enter the element (1,0)
5
Please enter the element (1,1)
6
Please enter the element (1,2)
7
Please enter the element (1,3)
8
Please enter the element (2,0)
9
Please enter the element (2,1)
10
Please enter the element (2,2)
11
Please enter the element (2,3)
12
Please enter the element (3,0)
13
Please enter the element (3,1)
14
Please enter the element (3,2)
15
Please enter the element (3,3)
16
2022-09-21 01:34:40 INFO  TraverseArrayPattern:15 - Input array is : [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]
2022-09-21 01:34:40 INFO  TraverseArrayPattern:73 - The output traversed array is: [1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10]

*************************************************************************EOF*******************************************************************************
