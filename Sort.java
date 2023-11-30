public class Sort {
    public void insertion(int[] arr){
        int n=arr.length;
        
        for(int i=1;i<n;i++){
            
           int  key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }

    public void selection(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }

    public void bubble(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Sort s=new Sort();
        int[] arr={4,3,7,1,9,2,7,3,5,1};
        System.out.println("Original Array");
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }

        // s.insertion(arr);
        // s.selection(arr);
        s.bubble(arr);

        System.out.println("\nSorted array");
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }



    }
}
