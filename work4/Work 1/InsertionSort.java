class InsertionSort
{
   public static void main(String []args)
   {
      int data[]={54,26,93,17,77,31,44,55,20};
   
      for (int i=1; i<data.length; i++)
      {
         int temp = data[i];
         int j;
         for (j=i; j>0; j--)
         {
            //if (temp>=data[j-1])
            if (temp<=data[j-1]) //more
               break;
            data[j] = data[j-1];
         }
         data[j] = temp;
      }
      for(int j = 0; j < data.length; j++)//end while
         System.out.print(data[j]+" ");
   
   }   
}