class Node {
   public String w,m;
   public Node next;
   public Node() {
      w = "null" ;
      m = "null" ;
      next = null ;
   }
   public Node(String w,String m) {
      w = w ;
      m = m ;
      next = next ;
   }
   public Node(String w,String m, Node n){
      w = w ;
      m = m ;
      next = n;
   }
}