public class Sorting
{
   public static void main(String[] args)
   {
      int[] arr = {3,5,4,2,1};
      //bubble(arr);
      //selection(arr);
      insertion(arr);
      print(arr);
   }
   public static void bubble(int[] arr)
   {
      boolean isSwap = true;
      while(isSwap == true)
      {
         isSwap = false;
         for(int i = 1; i < arr.length; i++)
         {
            if(arr[i] < arr[i-1])
            {
               swap(arr, i, i-1);
               isSwap=true;
            }
         }
      }
   }
   public static void selection(int[] arr)
   {
      for(int i = 0; i < arr.length; i++)
      {
         int min = i;
         for(int j = i + 1; j < arr.length; j++)
         {
            if(arr[min] > arr[j])
            {
               min = j;
            }
         }
         swap(arr, i, min);
      }
   }
   public static void insertion(int[] arr)
   {
      for(int i = 1; i < arr.length; i++)
      {
         for(int j = i; j > 0 && arr[j] < arr[j-1]; j--)
         {
            swap(arr, j, j-1);
         }
      }
   }
   public static void swap(int[] arr, int fromIdx, int toIdx)
   {
      int tmp = arr[fromIdx];
      arr[fromIdx] = arr[toIdx];
      arr[toIdx] = tmp;
   }
   public static void print(int[] arr)
   {
      for(Integer i : arr)
      {
         System.out.println(i);
      }
   }
}
