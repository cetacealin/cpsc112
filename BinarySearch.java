public class BinarySearch
{
  public static void main(String[] args)
  {
    int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    int f = 0, l = 14, t = 8;
    System.out.println("The target has been found at: " + binarySearchRecursive(arr, f, l, t));
    System.out.println("The target has been found at: " + binarySearch(arr, t));

  }
  public static int binarySearchRecursive (int[] arr, int first, int last,int target)
  {
    if (first > last)
      return -1;

    int mid = (first + last) / 2;

    if (target == arr[mid])
      return mid;
    if (target > arr[mid])
      first = mid + 1;
    else last = mid - 1;
    
    return binarySearchRecursive(arr, first, last, target);
  }
  public static int binarySearch(int[] arr, int target)
  {
    int first = 0, last = arr.length - 1;

    while (first <= last)
    {
      int mid = (first + last) / 2;
      if (target == arr[mid])
        return mid;
      if (target > arr[mid])
        first = mid + 1;
      else
        last = mid -1;
    }
    return -1;
}
}
