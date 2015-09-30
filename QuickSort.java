public class QuickSort
{
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
   public static int Basic()
   {
      int arr[]= new int[data.length];
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
   }
   public static int Insertion()
   {
      int data[]= new int[data.length];
   
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
   
   }
   public static int ShellSort()
   {
      int data[]= new int[data.length];
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
   }

}