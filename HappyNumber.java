// Write an algorithm to determine if a number n is happy.

// A happy number is a number defined by the following process:

// Starting with any positive integer, replace the number by the sum of the squares of its digits.
// Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
// Those numbers for which this process ends in 1 are happy.
// Return true if n is a happy number, and false if not.

// Input: n = 19
// Output: true
// Explanation:
// 1^2 + 9^2 = 82
// 8^2 + 2^2 = 68
// 6^2 + 8^2 = 100
// 1^2 + 0^2 + 0^2 = 1

// Input: n = 2
// Output: false



import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public boolean isHappy(int n) {
        Set<Integer> hset=new HashSet<>();
        
        while(hset.add(n)){
            int sum=0;

            while(n>0){ 
                sum=sum+(n%10)*(n%10);
                n=n/10;
            }
            if(sum==1){
                return true;
            }
            else{
                 n=sum;
            }
            
        }
        return false;
    }


    public int square(int num) {
        
        int ans = 0;
        
        while(num > 0) {
            int remainder = num % 10;
            ans += remainder * remainder;
            num /= 10;
        }
        
        return ans;
    }

    public boolean isHappy2(int n) {
        int slow=n;
        int fast=n;

        do{
            slow=square(slow);
            fast=square(square(fast));
        }while(slow!=fast);

        return slow==1;
    }
    public static void main(String[] args) {
        HappyNumber h=new HappyNumber();
        System.out.println(h.isHappy(19));
        System.out.println(h.square(19));
        // System.out.println(h.isHappy2(19));
    }
}
