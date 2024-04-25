package codigos;
import java.util.Scanner;

public class Dia3 {
public static void main(String[] args) {
	Scanner leitura = new Scanner(System.in);
	int var[] = new int[6];
	float soma = 0; 
	
	for (int i = 0; i < 6; i++) {
		System.out.println("Digite o valor do vetor "+i+":");
		var[i] = leitura.nextInt();
		soma = soma + var[i];
	}
	soma = soma/6;
	System.out.println("A média é: "+ soma);
	
	
}
}
