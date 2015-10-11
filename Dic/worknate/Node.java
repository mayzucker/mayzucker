class Node {
   public String word,mean;
   public Node next;
   public Node() {
      word = "null" ;
      mean = "null" ;
      next = null ;
   }
   public Node(String w,String m) {
      word = w ;
      mean = m ;
      //this.next = next ;
   }
   public Node(String w,String m, Node n){
      word = w ;
      mean = m ;
      next = n;
   }
}