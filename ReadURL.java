import java.util.Scanner;
import java.io.*;
import java.net.URL;
public class ReadURL
{
  public static void main(String[] args) throws IOException
  {
    URL url = new URL("https://www.sfu.ca");
    InputStream in = url.openStream();
    Scanner scan = new Scanner(in);

    int line = 1;
    while (scan.hasNext())
    {
      String str = scan.nextLine();
      System.out.println(line + ": " + str);
      line++;
    }
    scan.close();
  }
}
