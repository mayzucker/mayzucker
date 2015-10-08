public class Stack{
   private LinkedList list;
   public Stack(LinkedList l) {
      list = l  ;
   }
   public boolean isEmpty()
   {
	   return list.size==0;
   }
   public String toString() {
		   
      return list.toString();
   }
   public void push(int d){
	   list.addLast(d);
	   //list.size++;
	   toString();
   }
   public int pop() 
   {  
	  //list.size--;
	  return list.removeLast();
   }
}