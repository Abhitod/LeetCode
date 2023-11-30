// 832. Flipping an Image

// Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

// To flip an image horizontally means that each row of the image is reversed.

// For example, flipping [1,1,0] horizontally results in [0,1,1].
// To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

// For example, inverting [0,1,1] results in [1,0,0].

// Input: image = [[1,1,0],[1,0,1],[0,0,0]]
// Output: [[1,0,0],[0,1,0],[1,1,1]]
// Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
// Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]

// Input: image = [[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
// Output: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
// Explanation: First reverse each row: [[0,0,1,1],[1,0,0,1],[1,1,1,0],[0,1,0,1]].
// Then invert the image: [[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]



public class ArrayFlipImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        int n2=image[0].length;
        int ans[][]=new int[n][n2];
        for(int i=0;i<n;i++)
            ans[i]=reverse(image[i]);
            return ans;
    }
    public int[] reverse(int a[]){
        int ans[]=new int[a.length];
        int n=a.length;
        for(int i=0;i<n;i++)
            ans[i]=a[n-1-i]==0?1:0;
            return ans; 
        
    }
}
