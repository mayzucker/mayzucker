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
   // Check is queue fulled ?
   // Return : true when queue was fulled
   // Return : false when queue was not fulled
   // Add your code here
      return true; // Replace this line with your code
   }
   public String toString() {
   // Returns : String that representing Integer's data in queue format as below
   // 1. If queue has any data : "Data in queue -> <d0>, <d1>, <d2>"
   // 2. If queue is empty : "No data in queue !!!"
   // Add your code here
      return ""; // Replace this line with your code
   }
   public boolean enqueue(int d){
   // Input new integer data to queue
   // Return : true when input success
   // Return : false when input fail (queue was fulled)
   // Add your code here
      return true; // Replace this line with your code
   }
   public Node dequeue(){
   // Remove node from queue
   // Return : First node in queue
   // Add your code here
   // Replace this line with your code
      return list.last;
   }
   public void setMaxSize(int s) {
   // Set maximum size and clear all data in queue
   // Add your code here
   }
}
