public class IterativeBinarySearch
{
   public static void main(String[] arg)
   {
      int[] arr = {1,3,5,7,9};
      System.out.println(binarySearch(arr, 3));
      System.out.println(binarySearch(arr, 2));
   }

   public static int binarySearch(int[] arr, int searchVal)
   {
      return binarySearch(arr, 0, arr.length-1, searchVal);
   }

   private static int binarySearch(int[] arr, int low, int high, int searchVal)
   {
      while(low <= high)
      {
         int mid = low + (high-low)/2;
         if(searchVal < arr[mid])
         {
            high = mid-1;
         }
         else if(searchVal > arr[mid])
         {
            low = mid+1;
         }
         else
         {
            return mid;
         }
      }
      return -1;
   }
}
