// Author: Sarin Rahman Zavin

import java.util.Scanner;
import java.text.DecimalFormat;
public class Main
{
  private static DecimalFormat df = new DecimalFormat("0.00");
  public static void main (String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int T;
    double r;
    double pi = (Math.acos(0.0)*2);
    
    T = sc.nextInt();
    if(T<=1000)
    {
for (int x = 1; x <= T ; x++)
{
  
  r = sc.nextDouble();
  double d=r+r;
  double l = (d*d)-(pi*r*r);
  System.out.println("Case " + x + ": " + df.format(l));

}       
    }
  }
}
