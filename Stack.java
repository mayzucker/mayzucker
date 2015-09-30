import java.util.*;
public class Stack extends LinkedList{
   private LinkedList list;
   public Stack() {
      list = new LinkedList() ;
   }
   public String toString() {
   // Returns : String that representing Integer's data in stack format as below
   // 1. If stack has any data : "Data in stack -> <d0>, <d1>, <d2>"
   // 2. If stack is empty : "No data in stack !!!"
   // Add your code here
   // Replace this line with your code
      return "";
   }
   public void push(int d){
      
      // Push new integer data to stack
      // Add your code here
   }
   public Node pop() 
   {
      /*if (isEmpty())
         throw new EmptyStackException();
      for(int i=1;i<size-1;i++)
      System.out.print("1");*/
         return list.last;
   // Pop data from stack
   // Return : Last node in stack
   // Add your code here
       // Replace this line with your code
   }
}