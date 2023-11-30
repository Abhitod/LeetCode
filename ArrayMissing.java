public class ArrayMissing {
    public static int getMissingNo(int[] nums)
    {
        int n=nums.length;
        int sum = ((n + 1) * (n + 2)) / 2;
        for (int i = 0; i < n; i++)
            sum =sum- nums[i];
        return sum;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,6,5,7};
        ArrayMissing a=new ArrayMissing();
        System.out.println(a.getMissingNo(arr));
    }
}
