package codigos;

public class Dia4 {
public static void main(String[] args) {
	String V[] = new String[] {"1","2","3","4","5","6"};
	
	String VP = "6";
	boolean contemValor = false;
	
	 for (String elem : V) {
         if (elem.equals(VP)) {
             contemValor = true;
             break;
         }
         }
	 
	 System.out.println("A matriz contém o valor " + VP + "? " + contemValor);
}}
