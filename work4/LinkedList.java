public class LinkedList{
   private Node first,last,before;
   int size = 0;
   public LinkedList() {
      // Constructor
   // Add your code here
      first = null;
   }
   public boolean isEmpty(){
   // Return : true (if list is empty)
   // : false (if list has any data)
   // Add your code here
      return(first == null);
   }
   public int size() 
   {
   // Return : Number of data in list
      return size;
   }
   public String toString() {
	   String s = "";
	  if(size!=0)
	  {
      Node current = first;
      s+= current.data;
	      if (current.next != null)
	    	  s+=", ";
		      while (current.next != null){
		         current = current.next;
		         s += current.data;
		         if (current.next != null)
		            s += ", ";
		      }
	      }
		   else
		   {
			   s= "Already empty";
		   }
      return s;
   }
   public void addLast(int d)
   {
	   if(size==0)
	   {
	      Node newNode = new Node(d);
	      first = newNode;
	      last = first;
	      size++;
	   }
	   else
	   {
		   Node newNode = new Node(d);
		   last.next = newNode;
		   before = last;
		   last = newNode;
		   /*for(int i=0;i<size-1;i++)
			   before = before.next;
		   before.next = newNode;*/
		   size++;
	   }
   }
   public void addFirst(int d){
      Node newNode = new Node(d);
      newNode.next = first;
      first = newNode;
      size++;
   
   // Add new data at the begining of list
   // Add your code here
   // Set next of header to new Node with next = header.next
   }
   public void clear(){
	   /*Node before = first;
	   while(size==0)
	   {
		   for(int i=0;i<size-1;i++)
		   {
			   before = before.next;
		   }
		   before.next=null;
		   size--;
	   }
	   System.out.println(size);*/
	   size =0;
	   first = null;
   }
   public int removeFirst() {
      Node ref = first;
      if(!isEmpty())
      {
         first = first.next;
         size--;
      }
      else
      {
    	  System.out.println("Empty LinkedList");
      }
      
      return ref.data ;
      // Return : First node in list
      // Add your code here
      //return NodeReference;// 1. If has any Node in list
      // 1.1. Set variable first as next of header
      // 1.2. Set next of header to next of first
      // 1.3. return first
      // 2. If list is empty, return null
      // Replace this line with your code
   }
   public int removeLast()
   {
	   if(last==null)
		   return 0;
	   else{
    	 Node tmp = new Node(last.data);
    	 before.next = null;
    	 last = before;
    	 size--;
    	 return tmp.data;
	   }
   }
          // Remove the last data in list
      // Return : Last node in list
      // 1. Loop to find node before last node of list
      // 2. Set variable last as next of before last node
      // 3. Set next of before last node as null
      // 4. Return last
      //return NodeReference ;
   
}