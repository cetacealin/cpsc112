import java.util.*;

public class Creditcardnumbers {
  public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        long number;
        System.out.print("Enter a credit card number as a long integer: ");

        number = scr.nextLong();


        if (isValid(number)) {
            System.out.println(number + " is valid ");
        }
        else {
            System.out.println(number + " is invalid ");
        }

    }

    public static boolean isValid(long number) {

        int total = evenSum(number) + oddSum(number);


        if ((total % 10 == 0) && (check(changToList(number)) && (size(number)>=13 ) && (size(number)<=16))) { 
            return true;
        }
        else {
            return false;
        }
    }

    public static int getDigit(int number) {

        if (number <= 9) {
            return number;
        } else {
            int firstDigit = number % 10;
            int secondDigit = (int) (number / 10);

            return firstDigit + secondDigit;
        }
    }
    public static int oddSum(long number) {
        int result = 0;

        while (number > 0) {
            result += (int) (number % 10);
            number = number / 100;
        }

        return result;
    }

    public static int evenSum(long number) {

        int result = 0;
        long temp = 0;

        while (number > 0) {
            temp = number % 100;
            result += getDigit((int) (temp / 10) * 2);
            number = number / 100;
        }

        return result;
    }

    public static int size(long d) {

        int count = 0;

        while (d > 0) {
            d = d / 10;

            count++;
        }

        return count;

    } 
    
    public static int[] changToList(long number) {
      int temp;
      int[] arr= {0};
      
      while(number>0) {
        temp =(int)(number % 10);
        arr=addInt(arr, temp);
        number = number / 10;
      }
      return arr;
      }
      
    public static int[] addInt(int [] arr, int newInt){
        int[] newArr = new int[arr.length + 1];
        
        for (int i = 0; i < arr.length; i++){
          newArr[i] = arr[i];
        }
        
        newArr[newArr.length - 1] = newInt;
        return newArr;
      }
      
    public static boolean check(int[] arr) {
      if (arr[arr.length-1]==4 || arr[arr.length-1]==5 || arr[arr.length-1]==6 || (arr[arr.length-1]==3 && arr[arr.length-2]==7)) { 
        return true;
      }
      else {
        return false;
      }
    }
}
