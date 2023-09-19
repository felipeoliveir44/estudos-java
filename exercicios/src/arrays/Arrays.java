package arrays;

public class Arrays {
	public static void main(String[] args) {
		// Declaração de arrays
		
		int[] numeros = {1, 2, 3, 4, 5};
		String[] nomes = {"Luiz", "Felipe", "Matheus"};
		
		for(int i = 0; i < nomes.length; i++) {
			System.out.println("Nome: " + nomes[i] + " - posição " + i);
		}
	}
}
