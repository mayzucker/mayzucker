import java.util.*;
public class Stack extends LinkedList{
   private LinkedList list;
   public Stack() {
      list = new LinkedList() ;
   }
   public boolean isEmpty()
   {
	   return size==0;
   }
   public String toString() {
		   
      return super.toString();
   }
   public void push(int d){
	   addLast(d);
	   toString();
   }
   public int pop() 
   {  
	  return removeLast();
   }
}