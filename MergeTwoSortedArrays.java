import java.util.Arrays;

public class MergeTwoSortedArrays {
              public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m;
        for(int j=0; j<n;j++){
            nums1[i]=nums2[j];
            i++;
        }
        
        for(int k=0;k<m-1;k++){
            System.out.print(nums1[k]);
        }
        Arrays.sort(nums1);
    }
    public static void main(String[] args) {
        int[] nums1={1,2,4,6,0,0,0,0};
        int[] nums2={1,2,4,6};
        int m=4;
        int n=4;

        MergeTwoSortedArrays ma=new MergeTwoSortedArrays();
        
        ma.merge(nums1, m, nums2, n);
    }
}
