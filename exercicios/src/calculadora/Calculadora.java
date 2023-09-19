package calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		int numero1;
		int numero2;
		String operacaoMatematica;
		
		System.out.println("Qual operacao deseja realizar? (Soma, subtração, multiplicação ou divisão) ");
		
        operacaoMatematica = scanner.next();
		 
        try {
        	System.out.println("Primeiro número: ");
            numero1 = scanner.nextInt();
            
            System.out.println("Segundo número: ");
            numero2 = scanner.nextInt();
        }
        catch (Exception e) {
        	System.out.println("Erro ao ler os números. Tente novamente.");
            return; // Encerra o programa em caso de erro.
		}
        
        Contas conta = new Contas(numero1, numero2);

	        switch(operacaoMatematica) {
	        case "soma": {
	        	conta.soma();
	        	break;
	        	}
	        
	        case "subtracao": {
	        	conta.subtracao();
	        	break;
	        	}
	        
	        case "multiplicacao": {
	        	conta.multiplicacao();
	        	break;
	        	}
	        
	        case "divisao": {
	        	conta.divisao();
	        	break;
	        	}
	        
	        default:
	            System.out.println("Operação matemática inválida.");
	        }
	
		} 
	}
