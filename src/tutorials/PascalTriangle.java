package tutorials;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numRows = 5;
        List<List<Integer>> result = generatePascalsTriangle(numRows);

        // Print the result
        for (List<Integer> row : result) {
            System.out.println(row);
        }

	}
        

            public static List<List<Integer>> generatePascalsTriangle(int numRows) {
                List<List<Integer>> triangle = new ArrayList<>();

                if (numRows <= 0) {
                    return triangle;
                }

                for (int i = 0; i < numRows; i++) {
                    List<Integer> row = new ArrayList<>();

                    for (int j = 0; j <=i; j++) {
                        if (j == 0 || j == i) {
                            row.add(1);
                        } else {
                            row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                        }
                    }

                    triangle.add(row);
                }

                return triangle;
            }

}
