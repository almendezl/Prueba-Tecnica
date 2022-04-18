import java.util.ArrayList;

public class PruebaTecnica {
	
	public static void main(String[] args) {
		//algoritmoA();
		//algoritmoC("prueba de lógica es una forma de hacer el algoritmo");
		algoritmoB();
		
		//System.out.println(prueba(13));
		
	}
	
	public static void algoritmoA() {
		/**
		 * Si el número es divisible por 3, se debe imprimir “Bin”
		 * Si el número es divisible por 5, se debe imprimir “Go”
		 * Si se cumplen ambas condiciones (divisible por 3 y por 5), se debe imprimir “Bingo!”
		 */
		for (int i = 1; i <= 100; i++) {
			
			System.out.print(i % 3 == 0 && i % 5 == 0? "Bingo! \n": i % 3 == 0? "Bin ": i % 5 == 0? "Go " : "");
			
		}
	}
	
	public static void algoritmoB() {

		int contador = 1;
		ArrayList<Integer> primos = new ArrayList<Integer>();
		boolean continuar = true;
		
		while(continuar) {
			if (verificarPrimo(contador)) {
				primos.add(contador);
			}
			if (primos.size() >= 50)
				continuar = false;
			contador++;
	
		}
		
		System.out.println(primos.toString());
	
	}
	public static boolean verificarPrimo(int valor) {
		  if (valor == 0 || valor == 1 || valor == 4) {
		    return false;
		  }
		  for (int i = 2; i < valor / 2; i++) {
		    if (valor % i == 0)
		      return false;
		  }
		  return true;
	}
	
	public static void algoritmoC(String input) {
		/**
		 * c.	Dada una cadena de texto compuesta por n palabras separadas por espacio (n > 1), 
		 * escriba un algoritmo para escribir las palabras de la cadena en orden inverso. 
		 * Asuma la cadena como un array de caracteres
		 */
		String output = "";
		String arrayCadena[] = input.split(" ");
		for (int i = arrayCadena.length - 1; i >= 0; i--) {
			output += arrayCadena[i] + " ";
			
		}
		System.out.println(output);
		
	}
	


}
