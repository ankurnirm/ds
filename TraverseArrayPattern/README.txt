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
