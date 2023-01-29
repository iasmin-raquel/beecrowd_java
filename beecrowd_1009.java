import java.util.Locale;
import java.util.Scanner;

public class beecrowd_1009 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		
		String nome = sc.nextLine();
		double salario = sc.nextDouble();
		double vendas = sc.nextDouble();
		
		double comissao = salario + (vendas * 0.15);
		
		System.out.printf("TOTAL = %.2f%n", comissao);
		
		sc.close();
	}
}
