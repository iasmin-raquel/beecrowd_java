import java.util.Locale;
import java.util.Scanner;

public class beecrowd_1008 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int num = sc.nextInt();
		int horas = sc.nextInt();
		double valor = sc.nextDouble();
		double salario = horas * valor;
		
		System.out.printf("NUMBER = %d%n", num);
		System.out.printf("SALARY = %.2f%n", salario);
		
		sc.close();
	}
}
