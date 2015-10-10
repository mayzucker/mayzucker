import java.util.Scanner;
public class Main{
   static Scanner kb=new Scanner(System.in);
   public static void main(String[] args) {
      char ch;
      LinkedList list = new LinkedList();
      do{
         ch = menu();
         System.out.println();
         switch (ch){
            case '1':System.out.print("Input an integer ... ");
               list.addFirst(kb.nextInt());
               showList(list);
               break;
            case '2':
               System.out.print("Input an integer ... ");
               list.addLast(kb.nextInt());
               showList(list);
               break;
            case '3':
               list.removeFirst();
               if (list.size() != 0) {
                  System.out.println("Removed data is " + list.toString());
                  showList(list);
               }
               else
                  System.out.println("Nothing to remove !!!");
               break;
            case '4':
               if (list.size() != 0) {
            	  list.removeLast();
                  System.out.println("Removed data is " + list.toString());
                  showList(list);
               }
               else
                  System.out.println("Nothing to remove !!!");
               break;
            case '5':
               list.clear();
               System.out.println("All data had removed.");
               break;
            case '0':
               break;
            default: System.out.println("\nIncorrect choice !!!");
         }
      } while (ch != '0');
   }
   private static void showList(LinkedList list) {
      if (list.isEmpty())
         System.out.println("No data in list !!!");
      else
         System.out.println("There are " + list.size() + " items in list -> " + list.toString());
   }
   private static char menu(){
      System.out.println("\n+-----------------+");
      System.out.println("| Linked List |");
      System.out.println("+-----------------+");
      System.out.println("| 1. Add First |");
      System.out.println("| 2. Add Last |");
      System.out.println("| 3. Remove First |");
      System.out.println("| 4. Remove Last |");
      System.out.println("| 5. Clear |");
      System.out.println("| 0. Exit |");
      System.out.println("+-----------------+");
      System.out.print(" Select your choice ... ");
      return kb.next().charAt(0);
   }
}