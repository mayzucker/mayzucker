import java.util.*;
public class Dictionnary
{
   String w,m;
   //char s;
   Node n;
   int size = 0;
   static Scanner kb = new Scanner(System.in);
   public static void main(String[]args)
   {
      char data;
      LinkedList list = new LinkedList();
      int choice = 1;
      do{
         System.out.println("=====Dictionnary=====");
         System.out.println("1) Add Word & Mean");
         System.out.println("2) Search");
         System.out.println("3)Show Data");
         System.out.print("Select Choice > ");
         choice = kb.nextInt();
         System.out.println();
         switch(choice)
         {
            case 1: System.out.print("Select Character > ");
               data = kb.next().charAt(0);
               if((data>='A' && data<='Z') || (data>='a' && data<='z'))
               {
                  System.out.print("Add Word > ");
                  System.out.println("Add Mean > \t");
                  list.addFirst(kb.next(),kb.next());
                  
                  
               }
               else
               {
                  System.out.println("Not Found !!! ");
               
                  //return ;
               }
               break;
            case 2 :  System.out.print("Enter Char > "); 
                      //char s = kb.next().charAt(0);
               if(list.equals(kb.next().charAt(0)))
               {
                System.out.println("Yes");
               }
               else
               {
               System.out.println("No");
               }
               break;
            case 3: showList(list);
               
               break;
         }
      }while(choice!=0);
      
    
   }
   private static void showList(LinkedList list) {
      if (list.isEmpty())
         System.out.println("No data in list !!!");
      else
         System.out.println("There are " + list.size() + " items in list -> " + list.toString());
   }
   public int size() 
   {
      return size;
   }


}

