import java.util.Locale;
import java.util.Scanner;

public class beecrowd_1005 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double  media = (a*3.5)+ (b*7.5);
		
		System.out.printf("PROD = %.5f%n", media/11);
		
		sc.close();
	}
}
