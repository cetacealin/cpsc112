import java.util.Arrays;
public class Sorting
{
  public static void main(String[] args)
  {
    int[] arr = {6, 3, 7, 2, 8, 99, 4};
    int[] arr2 = {99, 456, 23, 64, 835, 245};
    int[] arr3 = {5, 3, 42, 12, 63, 3422, 899};
    int[] arr4 = {24, 61, 6456, 33332, 43, 3, 2};
    int[] arr5 = {45, 32, 7, 4, 9, 11, 645, 979};
    System.out.println("The original array is: " + Arrays.toString(arr));
    selectionSort(arr);
    System.out.println("After using selectionSort method: " + Arrays.toString(arr));
    System.out.println();
    System.out.println("The original array is: " + Arrays.toString(arr2));
    insertionSort(arr2);
    System.out.println("After using insertionSort method: " + Arrays.toString(arr2));
    System.out.println();
    System.out.println("The original array is: " + Arrays.toString(arr3));
    bubbleSort(arr3);
    System.out.println("After using bubbleSort method: " + Arrays.toString(arr3));
    System.out.println();
    System.out.println("The array before mergeSort: " + Arrays.toString(arr4));
    mergeSort(arr4, 0, arr4.length - 1);
    System.out.println("After mergeSort method: " + Arrays.toString(arr4));
    System.out.println();
    System.out.println("The array before quickSort: " + Arrays.toString(arr5));
    quickSort(arr5, 0, arr5.length - 1);
    System.out.println("After quickSort method: " + Arrays.toString(arr5));
    System.out.println();
  }
  public static void selectionSort (int[] data)
    //sorting in (same) place (no extra array, use single memory locaion to swap)
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
    System.out.println(Arrays.toString(data));

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
  public static void bubbleSort (int[] data)
  {
    for ( int i = data.length - 1; i > 0; i--)
    {
 
      for (int j = 0; j <= i - 1; j++)
      {
        if (data[j] > data[j + 1])
          swap(data, j, j + 1);
      }
    }
  }
  public static void mergeSort (int[] data, int first, int last)
  {
    if (first >= last)
      return;
    int mid =  (first + last) / 2;
    mergeSort(data, first, mid);
    mergeSort(data, mid + 1, last);

    merge (data, first, last);
  }
  public static void merge(int[] data, int first, int last)
  {
    int[] temp = new int[last - first + 1];
      int mid = (first + last) / 2;
    int i = first, j = mid + 1, k = 0;

    while (i <= mid && j <= last)
    {
      if (data[i] < data[j])
        temp[k++] = data[i++];
      else
        temp[k++] = data[j++];
    }
    while (i <= mid)
      temp[k++] = data[i++];
    while (j <= last)
      temp[k++] = data[j++];
    for (i = first; i <= last; i++)
      data[i] = temp[i - first];
  }
  public static void quickSort (int[] data, int first, int last)
  {
    if (first >= last)
      return;
    int pivot = partition (data, first, last);

    quickSort(data, first, pivot - 1); //left
    quickSort(data, pivot + 1, last); //right
  }
  public static int partition (int [] data, int first, int last)
  {
    int [] temp = new int[last - first + 1];
    int pivot = data[first];
    int i = 0, j = last - first, k;

    for (k = first + 1; k <= last; k++)
    {
      if (data[k] <= pivot) 
        temp[i++] = data[k];
      else 
        temp[j--] = data[k];
    }
    temp[i] = pivot;

    for (k = first; k <= last; k++)
      data[k] = temp[k - first];
    return first + i;
  }
}


