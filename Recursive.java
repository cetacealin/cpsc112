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
}
