import java.util.*;
public class Main extends SortEngine
{
   static Scanner kb = new Scanner(System.in);
   public static void main(String[] args) {
      final int limit = 10;
      int []d = new int[limit];
      int []tmp2 = new int[limit];      
      int data[] = new int[limit];
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
            case '2':
               showData(d);
               break;
            case '3': 
               tmp2 = clone(d);
               data = tmp2;
<<<<<<< HEAD
               long startTime = System.currentTimeMillis();
=======
               long start = System.currentTimeMillis();
>>>>>>> origin/master
               basicSort(data);
               long stop = System.currentTimeMillis();
               for(int i = 0; i < data.length; i++)
<<<<<<< HEAD
               {System.out.print(data[i]+" ");}
               long timeTeken = System.currentTimeMillis() - startTime;
               System.out.println();
               System.out.println(timeTeken);
=======
            	   System.out.print(data[i]+" ");
               System.out.println("");
               System.out.println("Taketime : "+ (stop-start)+" ms");
               //System.out.println("Taketime : "+ stop);
>>>>>>> origin/master
               break;
            case '4': 
               tmp2 = clone(d);
               data = tmp2;
               long startTime2 = System.currentTimeMillis();
               insertionSort(data);
               for(int j = 0; j < data.length; j++)
               System.out.print(data[j]+" "+"\t");
               long timeTeken2 = System.currentTimeMillis() - startTime2;
               System.out.println();
               System.out.println(timeTeken2);
               break;
            case '5':
               tmp2 = clone(d);
               data = tmp2;
               long startTime3 = System.currentTimeMillis();
               shellSort(data);
               for(int k = 0; k < data.length; k++)
               System.out.print(data[k]+" ");
               long timeTeken3 = System.currentTimeMillis() - startTime3;
               System.out.println();
               System.out.println(timeTeken3);
               break;
           case '6':
               tmp2 = clone(d);
               data = tmp2;
               long startTime4 = System.currentTimeMillis();
               quickSort(data);
               for(int l = 0; l < data.length; l++)
               System.out.print(data[l]+" ");
               long timeTeken4 = System.currentTimeMillis() - startTime4;
               System.out.println();
               System.out.println(timeTeken4);
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
      System.out.println("| 6. Quick Sort |");
      System.out.println("| 0. Exit |");
      System.out.println("+-----------------+");
      System.out.print(" Select your choice ... ");
      return kb.next().charAt(0);
   }
      
   public static int[] generateData(int size)
   {
      int tmp[] = new int[size];
      for(int i=0; i<size; i++)
      {
         tmp[i] = (int)(Math.random()*size);
         //System.out.println(tmp[i]);// DEBUG_SHOW_RANDOM
      }
      return tmp;
   }
   public static void showData(int []d)
   {
      System.out.println("=======Data in Array=======");
      for(int i = 0; i < d.length; i++)
      {
         System.out.print(d[i]+"  ");
         System.out.println("\t===================");
      }
      System.out.println();
      System.out.println("===========================");
   }
   public static int[] clone(int [] d)
   {
      int tmp2[] = new int[d.length];
      for(int i=0; i<tmp2.length; i++)
         tmp2[i] = d[i];
      return tmp2;
   }
}      
   

