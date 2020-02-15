// Author: Sarin Rahman Zavin

import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner(System.in);
    String line;
    boolean user = true;
    int x= 1;

      do
      
            {
     line = sc.nextLine(); 

     if (line.equals("Hajj"))
     {
       System.out.println("Case " + x + ": " + "Hajj-e-Akbar");
     }
if (line.equals("Umrah"))
     {
       System.out.println("Case " + x + ": " + "Hajj-e-Asghar");
     }
              if(line.equals("*"))
              {
                user = false;
              }
              x++;
              

    }
      
    while (user);

  }
}
