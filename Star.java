public class Star{
    public static void main(String[] args) {
        String name="* A M I T *";
       for(int i=0;i<3;i++){
        for(int j=0;j<6;j++){
            if(i==0||i==2||j==0||j==5){
                System.out.print("* ");
            }
            else
            System.out.print("  ");
            if(i==1&&j!=0||j!=5){
                System.out.println("A M I T");
            }
        }
        System.out.println();
       }
    }
}