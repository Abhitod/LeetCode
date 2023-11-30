public class ArrayDiagonalSum2 {
    public static void main(String[] args) {
        int[][] mat={{0,1,1,1},
              {1,0,1,1},
              {1,1,1,1},
               {1,1,1,10}};
        int n=mat.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+mat[i][i];
        }
        System.out.println(sum);
    }
}
