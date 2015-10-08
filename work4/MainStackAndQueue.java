import java.util.Scanner;
public class MainStackAndQueue{
   static Scanner kb=new Scanner(System.in);
   public static void main(String[] args) {
      char ch;
      LinkedList list = new LinkedList();
      Stack stack = new Stack(list);
      Queue queue = new Queue(list);
      do{
         ch = menu();
         System.out.println();
         switch (ch) {
            case '1':
               System.out.print("Input an integer ... ");
               stack.push(kb.nextInt());
               System.out.println(stack.toString());
               break;
            case '2':
               if (!stack.isEmpty()) 
               {
                  System.out.println("Poped data is " +stack.pop());
                  System.out.println(stack.toString());
               }
               else
                  System.out.println("No data to pop !!!");
               break;
            case '3':
               if (queue.isFull())
                  System.out.println("Queue is fulled !!!");
               else {
                  System.out.print("Input an integer ... ");
                  queue.enqueue(kb.nextInt());
                  System.out.println(queue.toString());
               }
               break;
            case '4':
               if (list.size!=0) {
                  System.out.println("Dequeued data is "+queue.dequeue() );
                  System.out.println(queue.toString());
               }
               else
                  System.out.println("No data to dequeue !!!");
               break;
            case '5':
               System.out.print("Input maximum size of queue ... ");
               int s = kb.nextInt();
               if (s > 0)
                  queue.setMaxSize(s);
               else
                  System.out.println("Invalid size !!!");
               break;
            case '0':
               break;
            default:
               System.out.println("\nIncorrect choice !!!");
         }
      } while (ch != '0');
   }
   private static char menu() {
   // Display main menu and prompt user to select choice
   // Return : User's choice
      System.out.println("\n+-----------------+");
      System.out.println("| Stack & Queue |");
      System.out.println("+-----------------+");
      System.out.println("| 1. Push Stack |");
      System.out.println("| 2. Pop Stack |");
      System.out.println("| 3. Enqueue |");
      System.out.println("| 4. Dequeue |");
      System.out.println("| 5. Reset Queue |");
      System.out.println("| 0. Exit |");
      System.out.println("+-----------------+");
      System.out.print(" Select your choice ... ");
      return kb.next().charAt(0);
   }
}