public class Queue extends LinkedList
{
   private LinkedList list;
   private int maxSize;
   private static final int DEFAULT_SIZE = 10;
   public Queue() {
      list = new LinkedList();
      maxSize=DEFAULT_SIZE;
   }
   public Queue(int s) {
      maxSize=s;
   }
   public boolean isFull(){
      return size()==maxSize;
   }
   public String toString() {
	   
      return super.toString(); 
   }
   public boolean enqueue(int d){
	   addLast(d);
      return true; 
   }
   public int dequeue(){
      return removeFirst();
   }
   public void setMaxSize(int s) {
	   maxSize = s;
	   clear();
   }
}
