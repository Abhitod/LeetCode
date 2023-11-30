// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
// An input string is valid if:
// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.

// Input: s = "()"
// Output: true

// Input: s = "()[]{}"
// Output: true

// Input: s = "(]"
// Output: false


import java.util.Stack;

public class BalanceParanthese {
        public boolean isValid(String s) {
       Stack<Character> stack=new Stack<Character>();
       char[] str=s.toCharArray();
       for(char c:str){
           if(c=='('||c=='['||c=='{'){
               stack.push(c);
           }
           else{
               if(stack.isEmpty()){
                   return false;
               }
               char top=stack.peek();
               if((c==')'&&top=='(')||(c==']' && top =='[') || (c=='}' && top=='{')){
                   stack.pop();
               }
               else{
                   return false;
               }
           }
       }
       return stack.isEmpty(); 
    }
    public static void main(String[] args) {
        BalanceParanthese b=new BalanceParanthese();
        System.out.println(b.isValid("(){(())}"));
    }
}
