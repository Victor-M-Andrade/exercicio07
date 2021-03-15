package exercicio07;

public class Main {

	public static void main(String[] args) {

		Main app = new Main();
		app.start();

	}

	private void start() {

		calcular(5, 5);
		calcular(10.27, 8.2);
		calcular("44", "um valor qualquer");
	}

	
	/**
	 * Somar dois ints
	 * @param primeiroValor
	 * @param segundoValor
	 */
	private void calcular(int primeiroValor, int segundoValor) {

		int resultado = primeiroValor + segundoValor;
		System.out.println("INT | Resultado da operação: " + resultado);
	}
	
	
	/**
	 * Subtrair dois doubles
	 * @param primeiroValor
	 * @param segundoValor
	 */
	private void calcular(double primeiroValor, double segundoValor) {

		double resultado = primeiroValor - segundoValor;
		System.out.println("DOUBLE | Resultado da operação: " + resultado);
	}
	
	
	/**
	 * Concatenar duas Strings
	 * @param primeiroValor
	 * @param segundoValor
	 */
	private void calcular(String primeiroValor, String segundoValor) {

		String resultado = primeiroValor + segundoValor;
		System.out.println("STRING | Resultado da operação: " + resultado);
	}
}
