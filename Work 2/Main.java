import java.util.*;
public class Main extends SortEngine
{
   static Scanner kb = new Scanner(System.in);
   public static void main(String[] args) {
      final int arraysize = 10;
      int d[] = new int[arraysize];
      int data;
      char ch;
      do{
         ch = menu();
         System.out.println();
         switch (ch){
            case '1':System.out.print("Input Size ... ");
               int size = kb.nextInt();
               generateData(size);
               d = generateData(size);
               break;
            case '2': showData(d);
            
               break;
            case '3':
               //list.removeFirst();
               //if (list.size() != 0) 
               {
                  System.out.println("Removed data is " );
                  //showList(list);
               }
               //else
               System.out.println("Nothing to remove !!!");
               break;
            case '4':
               //clone(d);
               //basicSort(d);
               break;
            case '5':
               /*list.clear();
               System.out.println("All data had removed.");*/
               break;
            case '0':
               break;
            default: System.out.println("\nIncorrect choice !!!");
         }
      } while (ch != '0');
   }
   private static char menu(){
      System.out.println("\n+-----------------+");
      System.out.println("| Sort |");
      System.out.println("+-----------------+");
      System.out.println("| 1. Generate Data |");
      System.out.println("| 2. Show Data |");
      System.out.println("| 3. Basic Sort |");
      System.out.println("| 4. Insert Sort |");
      System.out.println("| 5. Shell Sort |");
      System.out.println("| 5. Quick Sort |");
      System.out.println("| 0. Exit |");
      System.out.println("+-----------------+");
      System.out.print(" Select your choice ... ");
      return kb.next().charAt(0);
   }
      
   public static int [] generateData(int size)
   {
      int tmp[] = new int[size];
      for(int i=0; i<size; i++)
      {
         tmp[i] = (int)Math.random()*size;
      }
      return tmp;
   }
   public static void showData(int []d)
   {
      System.out.println("=======Data in Array=======");
      for(int i = 0; i < d.length; i++)
      {
         System.out.print(d[i]+" ");
         System.out.println("\t ----- ");
      }
      System.out.println("===========================");
   }
   public static int [] clone(int [] d)
   {
      int tmp[] = new int[d.length];
      for(int i=0; i<tmp.length; i++)
         tmp[i] = d[i];
      return tmp;
   }
}      
   

