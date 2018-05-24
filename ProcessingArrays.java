public class ProcessingArrays
{
public static void main(String[] args )
 {
   int[] arr = {78, 498, 44, 56, 34, 45, 23};
   int[] arr1 = {5, 4, 2, 66, 89, 8, 34};
   
   System.out.println("First way of printing an array");
   
   for (int i=0; i < arr.length; i++)
    {  
    System.out.println(arr[i]);
    }
    System.out.println("Second way");
    for (int elem : arr)
    {
      System.out.println(elem);
    }

    System.out.print("The minimum value of the array is: ");
    System.out.println(minValue(arr));
    System.out.print("The index of the minimun value is: ");
    System.out.println(minIndex(arr));
    System.out.print("The maximum values of the array is: ");
    System.out.println(maxValue(arr));
    System.out.print("The average of the array is: ");
    System.out.println(average(arr));
    System.out.print("The concatenate of the two array is:");
    System.out.println(concatenate(arr, arr1));
 }
static int minValue (int[] arr)
{
  int min = arr[0];

  for (int elem : arr)
    if (elem < min)
      min = elem;
  return min;
}
static int minIndex (int[] arr)
{
  int index = 0, min = arr[0];
  for (int i = 1; i < arr.length; i++)
  {
    if (arr[i] < min)
    {
      min = arr[i];
      index = i;
    }
  }
  return index;
}
static int maxValue (int[] arr)
{
  int max = arr[0];

  for (int elem : arr)
  {
    if (elem > max)
      max = elem;
  }
  return max;
}
static double average (int[] arr)
{
  int sum = 0;
  for (int i = 0; i < arr.length; i++)
    sum += arr[i];
    return (double) sum / arr.length;
}
static int[] concatenate (int[] a, int[] b)
{
  int[] newArr = new int[a.length + b.length];
  int i = 0;
  for (int elem : a)
    newArr[i++] = elem;
  
  for (int elem : b)
    newArr[i++] = elem;
  
  return newArr;
}
}

