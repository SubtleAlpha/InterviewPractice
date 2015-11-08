public class Sorting
{
   public static void main(String[] args)
   {
      int[] arr = {3,5,4,2,1};
      print(arr);
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
