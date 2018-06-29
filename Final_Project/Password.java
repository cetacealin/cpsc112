/**
* The Password program gets input from the user, and displays "Valid password" if it
* has at least eight characters, consists of only letters and digits, and contains
* at least two digits.
*
* @author  Kuan, Lin and Ricky Lin
* @version 1.0
* @since   June 17th, 2018
*/
import java.util.Scanner;
public class Password
{
  public static void main(String[] args)
  {
    String password;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string for password: ");
    password = input.nextLine();

    String result = (isValid(password) ? "Valid password" : "Invalid password");
    System.out.println(result);
  }
  public static boolean isValid(String password) {
    int charCount = 0, numCount = 0;
    if (password.length() < 8) {
      return false;
    }
   
    for (int i = 0; i < password.length(); i++)
    {
      char c = password.charAt(i);

      if (is_Numeric(c)) numCount++;
      else if(is_Letter(c)) charCount++;
      else return false;
    }
    
    return (charCount >= 2 && numCount >=2);
  }
  public static boolean is_Letter(char c)
  {
    c = Character.toUpperCase(c);
    return ( c >= 'A' && c <='Z');
  }
  public static boolean is_Numeric(char c)
  {
    return (c >= '0' && c <= '9');
  }
}

