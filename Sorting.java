import java.util.Arrays;
public class Sorting
{
  public static void main(String[] args)
  {
    int[] arr = {6, 3, 7, 2, 8, 99, 4};
    int[] arr2 = {99, 456, 23, 64, 835, 245};
    System.out.println("The original array is: " + Arrays.toString(arr));
    selectionSort(arr);
    System.out.println("After using selectionSort method: " + Arrays.toString(arr));
    System.out.println("The original array is: " + Arrays.toString(arr2));
    insertionSort(arr2);
    System.out.println("After using insertionSort method: " + Arrays.toString(arr2));



  }
  public static void selectionSort (int[] data)
    //sortingin place (no extra array, use single memory locaion to swap)
  {
    for (int i = 0; i < data.length - 1; i++)
    {
      int minIndex = i;
      for (int j = i + 1; j < data.length; j++)
      {
        if (data[j] < data[minIndex])
          minIndex = j;
      }
      swap(data, i, minIndex);
    }
  }
  public static void swap (int[] data, int i, int j)
  {
    int temp = data[i];
    data[i] = data[j];
    data[j] = temp;
  }
  public static void insertionSort (int[] data)
  {
    for (int i = 0; i < data.length; i++)
    {
      int temp = data[i];
      int j;

      for (j = i; j > 0; j--)
      {
        if (data[j - 1] < temp)
          break;
        data[j] = data[j - 1];
      }
      data[j] = temp;
    }
  }
}


