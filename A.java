import java.util.Scanner;
public class Main
{
  
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int diff;
        
        if (n1>n2){
          
          diff = n1-n2;
        }
        
        else {
          diff = n2+n1;
        }        
        System.out.println(diff);
  }
}
