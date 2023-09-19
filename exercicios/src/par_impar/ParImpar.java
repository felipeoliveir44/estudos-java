package par_impar;
import java.util.Locale;
import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		
		
		System.out.println("Digite o número");
		int numero = scanner.nextInt();
		
		if (numero % 2 == 0  ) {
			System.out.println("O número " + numero + " é par");
		}
		else {
			System.out.println("O número " + numero + " é ímpar");
		}
		
		
	}
	
}
