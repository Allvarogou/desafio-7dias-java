package codigos;

public class Dia1 {
public static void main(String[] args) {
	
	int mevetor[] = {1,2,3,4}; 
	int soma = 0;
	
	for (int i = 0; i < 4; i++) {
		soma = mevetor[i] + soma;
		}
	System.out.println("o valor da soma é de: "+ soma);	
}
}
