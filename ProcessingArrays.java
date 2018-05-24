public class ProcessingArrays
{
public static void main(String[] args )
 {
   int[] arr = {78, 498, 44, 56, 34, 45, 23};
   
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
    System.out.print("The average of the array is: ");
    System.out.println(average(arr));
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
  for (int i = 1; i < arr.length; i ++)
  {
    if (arr[i] < min )
    {
      min = arr[i];
      index = i;
    }
  }
  return index;
}
static double average (int[] arr)
{
  int sum = 0;
  for (int i = 0; i < arr.length; i++)
    sum += arr[i];
    return (double) sum / arr.length;
}
}

