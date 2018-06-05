import java.util.Scanner;
public class Recursive
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the number: ");
    int n = scan.nextInt();
    System.out.println("The factorial of " + n + " is: "+factorial(n));
    System.out.println(isPalindrome("noon"));
    exchange(100, 200, 3);
  }
  public static long factorial (int n)
  {
    if (n <= 1)
      return 1;
    return n * factorial(n - 1);
  }
  public static boolean isPalindrome(String s)
{
    if (s.length() <= 1)
      return true;

    if (s.charAt(0) == s.charAt(s.length() - 1))
    {
      String substr = s.substring(1, s.length() - 1);
      return isPalindrome(substr);
    }
    return false;
    }
  public static void exchange (int a, int b, int n)
  {
     System.out.println("before: " + n + " a:" + a + " b:" + b);
    if (n > 1)
    exchange (b, a, n - 1);

    System.out.println("after: " + n + " a:" + a + " b:" + b);
  }
}
