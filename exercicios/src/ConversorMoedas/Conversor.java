package ConversorMoedas;

public class Conversor {
	
	public void ConverterDolar(double valorReal) {
		double valorDolar = 0.20;
		
		double resultado = valorReal * valorDolar;
		System.out.println(valorReal + " reais " + " equivale á " + resultado + " doláres");
			 
	}
	
	public void ConverterReal(double valorDolar) {
		double valorReal = 4.87;
		
		double resultado = valorDolar * valorReal;
		System.out.println(valorDolar + " doláres " + " equivale á " + resultado + " reais");
			 
	}
}
