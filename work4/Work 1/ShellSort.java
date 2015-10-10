class ShellSort
{
   public static void main(String []args)
   {
      int data[]={54,26,93,17,77,31,44,55,20};
      int j, tmp;
      for(int gap=data.length/3; gap>0; gap/=3)
      {
         for(int i=gap; i<data.length; i++)
         {
            tmp = data[i];
            for(j=i; j>=gap ; j-=gap)
            {
               //if(tmp<data[j-gap])
               if(tmp>data[j-gap])   //more
                  data[j] = data[j-gap];
               else
                  break;
            }
            data[j] = tmp;
         }
      }
      for(int k = 0; k < data.length; k++)//end while
         System.out.print(data[k]+" ");
   
   }
}