package codigos;

public class Dia5 {
public static void main(String[] args) {
	int[][] M = new int [10][10];
	
	for (int i = 0; i < 10; i++) {
		for (int j = 0; j < 10; j++) {
			 M[i][j] = i + j;
	}	
	}
for (int i = 0; i < 10; i++) {
	for (int j = 0; j < 10; j++) {
		System.out.println(M[i][j]+" ");

	}
	System.out.println();
}
	
}

}
