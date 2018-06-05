import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class WriteFile
{
   public static void main(String[] args) throws FileNotFoundException
   {
     PrintWriter out = new PrintWriter("random.txt");

     //for (int line = 1; line <= 100; line++)
     int line = 1;
     //while (line <= 100)
     do{
       String str = line + ": " + Math.random();
       out.println(str);
       line++;
     } while (line <= 100);
     out.close();
   }
}
