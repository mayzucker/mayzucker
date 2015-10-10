class bubblesort1
{
   public static void main(String []args)
   {
      int arr[]={54,26,93,17,77,31,44,55,20};
      boolean swapped=true;
      int j=0;
      int tmp;
      while (swapped)
      {
         swapped = false;
         j++;
         for(int i = 0; i < arr.length - j; i++)
         {
            //if (arr[i] > arr[i + 1]) //less
            if (arr[i] < arr[i + 1])   //more
            {
               tmp = arr[i];
               arr[i] = arr[i + 1];
               arr[i + 1] = tmp;
               swapped = true;
            }//end if
         }
         //end for
      }
      for(int i = 0; i < arr.length; i++)//end while
         System.out.print(arr[i]+" ");
         
   }//end method main
}//end class