package ConversorMoedas;
import java.util.Locale;
import java.util.Scanner;

public class ConversorMoedas {

	
	public static void main(String[] args) {
		Conversor conversor = new Conversor();
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite para qual moeda voce quer converter");
	    String moedaConverter = scanner.next().toLowerCase();
	    
	    System.out.println("Digite a quantidade de dinheiro que deseja converter");
	    double quantidadeDinheiro = scanner.nextDouble();	
	    
	    
	    
	    System.out.println(quantidadeDinheiro);
	    System.out.println(moedaConverter);
	    
	    switch(moedaConverter) {
	    case "dolar": {
	    	conversor.ConverterDolar(quantidadeDinheiro);
	    	break;
	    }
	    
	    case "real": {
	    	conversor.ConverterReal(quantidadeDinheiro);
	    	break;
	    }
	   }
	}
	
}
