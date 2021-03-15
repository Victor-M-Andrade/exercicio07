package exercicio07;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main app = new Main();
		app.start();

	}

	private void start() {
		// TODO Auto-generated method stub
		
		int[] inteiros = new int[2];
		inteiros[0] = 5;
		inteiros[1] = 5;
		
		
		double[] doubles = new double[2];
		doubles[0] = 10.27;
		doubles[1] = 10.42;
		
		
		String[] strings = new String[2];
		strings[0] = "44";
		strings[1] = "um texto qualquer";
		
		
		metodo(inteiros);
		metodo(doubles);
		metodo(strings);
		
		
	}
	
	public void metodo(int[] doisVals) {
		
		int resultado = 0;
		resultado = doisVals[0] + doisVals[1];
		System.out.println("Resultado da operação: " + resultado);
	}
	
	
	public void metodo(double[] doisVals) {
		double resultado = 0;
		resultado = doisVals[0] + doisVals[1];
		System.out.println("Resultado da operação: " + resultado);
	}
	
	
	public void metodo(String[] doisVals) {
		double resultado = 0;
		System.out.println(doisVals[0] + " " + doisVals[1]);
	}
}
