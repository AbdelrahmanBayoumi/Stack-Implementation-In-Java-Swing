package ProjectStackFrame;

import java.util.Scanner;

public class Project {
    public static void main(String[] args)  {
        System.out.println("---------------------------------------------------");
        System.out.println("\t\tStack Class Testing");
        System.out.println("---------------------------------------------------");        
        Stack<Integer> st = new Stack<>();
        st.push(100);
        st.push(50);
        
        st.push(90);
        st.push(70);
        st.push(10);
        st.push(350);
        System.out.println("The Stack is : "+st.toString());
        System.out.println("Stack Size is = "+st.getsize());
        System.out.println("Is the stack empty : "+st.isEmpty());
        System.out.println("peek on last element : "+st.peek());
        System.out.println("Ascending Order : "+st.sortAscending(st));
        System.out.println("pop the last element : "+st.pop());
        System.out.println("The New Size = "+st.getsize());
        System.out.println();
   
        
        System.out.println("---------------------------------------------------");        
        System.out.println("\t      Load Stack Class Testing ");
        System.out.println("---------------------------------------------------");
        try{
            String path = "D:\\test.txt";
            System.out.println("Load file :"+LoadeStack.load(path));
            System.out.println("Stack Size is = "+LoadeStack.load(path).getsize());
            System.out.println("Is the stack empty : "+LoadeStack.load(path).isEmpty());
            System.out.println("peek on last element : "+LoadeStack.load(path).peek());
            
        }catch(Exception e){
            System.out.println("Try Again");
        }
    }
    
}
