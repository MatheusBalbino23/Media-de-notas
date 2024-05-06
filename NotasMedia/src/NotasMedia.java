import java.util.Scanner;

public class NotasMedia {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantas notas serão adicionadas? ");
		double notas[] = new double[entrada.nextInt()];
		
		double somaNotas = 0;
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Digite uma nota: ");
			notas[i] = entrada.nextDouble();
			somaNotas += notas[i];
		}
		
		double media = somaNotas / notas.length;
	
		System.out.printf("A média das notas é %.2f", media);
		
		entrada.close();
	}
}
