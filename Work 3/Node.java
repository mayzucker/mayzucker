class Node {
   public int data;
   public Node next;
   public Node() {
      data = 0 ;
      next = null ;
   }
   public Node(int d) {
      data = d ;
      next = null ;
   }
   public Node(int d, Node n){
      data = d;
      next = n;
   }
   public String toString() {
      return data + "";
   }
}