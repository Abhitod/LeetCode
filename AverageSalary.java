// you are given an array of unique integers salary where salary[i] is the salary of the ith employee.

// Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.

// Input: salary = [4000,3000,1000,2000]
// Output: 2500.00000
// Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
// Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500

// Input: salary = [1000,2000,3000]
// Output: 2000.00000
// Explanation: Minimum salary and maximum salary are 1000 and 3000 respectively.
// Average salary excluding minimum and maximum salary is (2000) / 1 = 2000


import java.util.Arrays;

public class AverageSalary {
     public double average(int[] salary) {
        Arrays.sort(salary);
        int sum=0;
        int num=salary.length-2;
        for(int i=1;i<salary.length-1;i++){
            sum=sum+salary[i];
           
        }
        return sum/num;
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        AverageSalary a=new AverageSalary(); 
        System.out.println( a.average(arr));
    }
}
