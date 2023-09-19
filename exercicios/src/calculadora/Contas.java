package calculadora;
import java.util.Locale;
import java.util.Scanner;

public class Contas {
	private int numero1;
    private int numero2;
	int resultado;
	
	
	public Contas(int numero1, int numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	public void soma() {
		try {
			resultado = numero1 + numero2;
			System.out.println("O resultado da soma é: " + resultado);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public void subtracao() {
		
		try {
			resultado = numero1 - numero2;
			System.out.println("O resultado da subtracao é: " + resultado);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public void multiplicacao() {
		try {
			resultado = numero1 * numero2;
			System.out.println("O resultado da multiplicacao é: " + resultado);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public void divisao() {
		try {
			resultado = numero1 / numero2;
			System.out.println("O resultado da divisão é: " + resultado);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	} 
}
