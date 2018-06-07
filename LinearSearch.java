public class  LinearSearch
{
  public static void main(String[] args)
  {
    int [] arr = {1, 5, 6, 7, 11, 4, 2};
    int test = 11;
    System.out.println(linearSearch(arr, test));
  }
  public static int linearSearch(int[] arr, int target)
  {
    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i] == target)
        return i;
    }
    return -1;
  }
}
