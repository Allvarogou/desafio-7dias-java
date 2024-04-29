package codigos;

import java.util.Iterator;

public class Dia6 {
public static void main(String[] args) {
	String var[] = {"A","B", "C", "B", "D"};
	
	
	for (int i = 0; i < var.length; i++) {
		for (int j = 0; j < var.length; j++) {
			if (var[i] == var[j] &&  i!=j ) {
				
				System.out.println("Numero duplicado " + var[j]);
				
			}
			
			
		}
		
	}
}
}
