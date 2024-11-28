
/**
 * Problem Description
 * Given a matrix of integers A of size N x M and an integer B.
 * In the given matrix every row and column is sorted in non-decreasing order. Find and return the position of B in the matrix in the given form
 * If A[i][j] = B then return (i * 1009 + j)
 * If B is not present return -1.
 *  Note 1: Rows are numbered from top to bottom and columns are numbered from left to right.
 * Note 2: If there are multiple B in A then return the smallest value of i*1009 +j such that A[i][j]=B.
 * Note 3: Expected time complexity is linear
 * Note 4: Use 1-based indexing
 * 
 * 
 * Problem Constraints
 * 1 <= N, M <= 1000
 * -100000 <= A[i] <= 100000
 * -100000 <= B <= 100000
 * A = [[1, 2, 3]
 *     [4, 5, 6]
 *    [7, 8, 9]]
 * B = 2
 * A = [[1, 2]
 *     [3, 3]]
 * B = 3
 * 
 * Output 1:-
 * 1011
 * Output 2:-
 * 2019
 * 
 * Example Explanation

 * Expanation 1:-
* A[1][2] = 2
* 1 * 1009 + 2 = 1011
* Explanation 2:-
* A[2][1] = 3
* 2 * 1009 + 1 = 2019
* A[2][2] = 3
* 2 * 1009 + 2 = 2020
* The minimum value is 2019
 * 
 */

import java.util.List;

public class _001ArraysSearch {

    public int solve(List<List<Integer>> A, int B) {
        int i = 0;
        int j = A.get(0).size() - 1;
        int currElement;
        int minValue = Integer.MAX_VALUE;
        while (i < A.size() && j >= 0) {
            System.out.println("Current i,j :: "+i+","+j);
            currElement = A.get(i).get(j);
            if (B == currElement) {
                System.out.println("Element found at :: "+ i+","+j);
                //return ((i+1)*1009+(j+1));
                minValue = Math.min(minValue, (i + 1) * 1009 + (j + 1));
                j--;
            } else if (B > currElement) {
                i++;
            } else if (B < currElement) {
                j--;
            }

        }
        if (minValue == Integer.MAX_VALUE) {
            return -1;
        } else {
            return minValue;
        }
    }

    public static void main(String[] args) {
        /*List l1 = List.of(1, 2, 3);
        List l2 = List.of(4, 5, 6);
        List l3 = List.of(7, 8, 9);*/
        List l1=List.of(2,8,8,8);
        List l2=List.of(2,8,8,8);
        List l3=List.of(2,8,8,8);
        List finalList = List.of(l1, l2, l3);
        _001ArraysSearch obj = new _001ArraysSearch();
        System.out.println(obj.solve(finalList, 8));
    }
}
