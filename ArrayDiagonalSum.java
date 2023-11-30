// 1572. Matrix Diagonal Sum
// Given a square matrix mat, return the sum of the matrix diagonals.

// Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

// Input: mat = [[1,2,3],
//               [4,5,6],
//               [7,8,9]]
// Output: 25
// Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
// Notice that element mat[1][1] = 5 is counted only once.
// Example 2:

// Input: mat = [[1,1,1,1],
//               [1,1,1,1],
//               [1,1,1,1],
//               [1,1,1,1]]
// Output: 8
// Example 3:

// Input: mat = [[5]]
// Output: 5


public class ArrayDiagonalSum {
    public int diagonalSum(int[][] mat) 
    {
        int n=mat.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+mat[i][i];
            // if(i!=n-i-1){
            //     sum=sum+mat[i][n-i-1];
            // }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] mat={{5,1,1,1},
            {1,6,1,1},
            {1,1,1,1},
            {1,1,1,1}};
            System.out.println(mat.length);

            int n=mat.length;
            int sum=0;

            for(int i=0;i<n;i++)
            {
            sum=sum+mat[i][i];
            }  
            System.out.println(sum); 
    }
}
