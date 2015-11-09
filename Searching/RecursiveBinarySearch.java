public class RecursiveBinarySearch
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
      if(low > high)
      {
         return -1;
      }     
      int mid = low + (high-low)/2;
      if(searchVal < arr[mid])
      {
         return binarySearch(arr, low, mid-1, searchVal);
      }
      else if (searchVal > arr[mid])
      {
         return binarySearch(arr, mid+1, high, searchVal);
      }
      else
      {
         return mid;
      }
   }

}
