import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		int res = x%5 == 0 ? x/5 : x/5 + 1;
		System.out.println(res);
	}
}
