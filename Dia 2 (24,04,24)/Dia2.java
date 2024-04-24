package codigos;

import java.util.Scanner;

public class Dia2 {
public static void main(String[] args) {
	int max = 0;
	int min = 1;
	
	Scanner leitura = new Scanner(System.in);
	System.out.println("Qual o valor do vetor: ");
	int val = leitura.nextInt();
	
	int vetor[] = new int[val];
	
	
	 
	
	for (int i = 0; i < val ; i++) {
		System.out.println("Qual o  valor numero "+i+":");
		vetor[i] = leitura.nextInt();
		
		if (vetor[i] < min ) {
			min = vetor[i];
		} else if (vetor[i]> max) {
			max = vetor[i];
			
		}
	}
	
	System.out.println("O valor min é: "+min);
	System.out.println("O max é: "+max);
	}
}
