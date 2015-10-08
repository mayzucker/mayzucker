public class Queue
{
   private LinkedList list;
   private int maxSize;
   private static final int DEFAULT_SIZE = 10;
   public Queue(LinkedList l) {
      list = l;
      maxSize=DEFAULT_SIZE;
   }
   public Queue(int s) {
      maxSize=s;
   }
   public boolean isFull(){
      return list.size()==maxSize;
   }
   public String toString() {
	   
      return list.toString(); 
   }
   public boolean enqueue(int d){
	   list.addLast(d);
      return true; 
   }
   public int dequeue(){
      return list.removeFirst();
   }
   public void setMaxSize(int s) {
	   maxSize = s;
	   list.clear();
   }
}
