import java.util.*;
public class MainArr
{
   static ArrayList data = new ArrayList();
   static Scanner kb = new Scanner(System.in);
   public static void main(String[] args) {
      
      char ch;
      do{
         ch = menu();
         System.out.println();
         switch (ch){
            case '1':System.out.print("Input Size ... ");
               int size = kb.nextInt();
               generateData(size);
               System.out.print(generateData(size));
               break;
            case '2':
               //System.out.print(data[]);
               //showList(list);
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
               /*if (list.size() != 0) {
                  list.removeLast();
                  System.out.println("Removed data is " + list.toString());
                  showList(list);
               }
               else
                  System.out.println("Nothing to remove !!!");*/
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
   public static int quickSort(int [] data)
   {
      quickSort(data, 0, data.length-1);
      return 1;
   }
   private static void quickSort(int [] a, int left, int right)
   {
      int CUTOFF = 3;
      if(left + CUTOFF <= right)
      {
         int pivot = median3(a, left, right);
         int i = left, j = right - 1;
         for( ; ; )
         {
            while( a[++i] < pivot ) { }
            while( a[--j] > pivot ) { }
            if( i < j )
               swapReferences(a, i, j);
            else
               break;
         }
         swapReferences(a, i, right - 1);
         quickSort(a, left, i - 1);
         quickSort(a, i + 1, right);
      }
      else
         sort(a, left, right);
   }
   private static void swapReferences(int [] a, int i, int j)
   {
      int tmp = a[i];
      a[i] = a[j];
      a[j] = tmp;
   }
   private static int median3(int [] a, int left, int right)
   {
      int center = (left + right) / 2;
      if( a[center] < a[left] )
         swapReferences(a, left, center);
      if( a[right] < a[left] )
         swapReferences(a, left, right);
      if( a[right] < a[center] )
         swapReferences(a, center, right);
      swapReferences(a, center, right - 1);
      return a[right - 1];
   }
   private static void sort(int [] a, int left, int right)
   {
      for(int p=left+1; p<=right; p++)
      {
         int tmp = a[p];
         int j=p;
         for(; j>left && tmp < a[j-1]; j--)
            a[j] = a[j - 1];
         a[j] = tmp;
      }
   }
   public static int [] generateData(int size)
   {
      int tmp[] = new int[size];
      for(int i=0; i<size; i++)
      {
         tmp[i] = (int)(Math.random()*size);
      }
      return tmp;
   }
   public static int [] clone(int [] d)
   {
      int tmp2[] = new int[d.length];
      for(int i=0; i<tmp2.length; i++)
         tmp2[i] = d[i];
      return tmp2;
   }
   public void Display(){
      System.out.println("=======Data in Stack=======");
      /*for(int i = 0; i < data.length; i++)
      {
         System.out.print(data[i]+" ");
         System.out.println("\t ----- ");
      }
      System.out.println("===========================");*/
   }
   
   
}
