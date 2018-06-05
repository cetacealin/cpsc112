import java.util.Scanner;
import java.io.*;
public class ReadFile
{
  public static void main(String[] args) throws FileNotFoundException
  {
    File file = new File("random.txt");
    Scanner scan = new Scanner(file);
    while(scan.hasNext())
    {
      String str =  scan.nextLine();
      System.out.println(str);
    }
    scan.close();
  }
}


