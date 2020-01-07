package interviewQuestions;

import java.util.Stack;

public class StackDemo
{
    public static void main(String[] args)
    {
        String s1 ="{[()]}";
        String s2 ="{}[]()";
        String s3 = "({[)}]";
        System.out.println(isBalanced(s1));
        System.out.println(isBalanced(s2));
        System.out.println(isBalanced(s3));
    }

    static boolean isBalanced(String s)
    {
         Stack<Character> stack = new Stack();
         for(char c : s.toCharArray())
         {
             if(c == '{' || c == '(' || c == '[')
             {
                 stack.push(c);
             }
             else if(c == '}')
             {
                 if(!(stack.pop() == '{'))
                 {
                     return false;
                 }
             }
             else if(c == ']')
             {
                 if(!(stack.pop() == '['))
                 {
                     return false;
                 }
             }
             else if(c == ')')
             {
                 if(!(stack.pop() == '('))
                 {
                     return false;
                 }
             }
         }

         if(!(stack.empty()))
         {
             return false;
         }

        return true;
    }
}
