/*Q.1351. Given a m x n matrix grid which is sorted in non-increasing order 
 * both row-wise and column-wise, return the number of negative numbers in grid.*/

package tutorials;

public class CountNegativeNumbersInGrid {
	
	public int countNegatives(int[][] grid) {
		int count=0;
		
		for(int i=0;i<grid.length;i++) {
			
			for(int j=0;j<grid[i].length;j++) {
				
				if(grid[i][j]<0) {
					count+=(grid[i].length-j);
					break;
				}
			}
		}
		
		return count;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
