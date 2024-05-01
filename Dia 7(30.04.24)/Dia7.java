package codigos;

public class Dia7 {
    public static void main(String[] args) {
        int var[] = {3, 4, 11, 1, -1};

        int menor = Integer.MAX_VALUE;
        int sMenor = Integer.MAX_VALUE; 

        for (int i = 0; i < var.length; i++) {
            if (var[i] < menor) {
                sMenor = menor; 
                menor = var[i];
            } else if (var[i] < sMenor) {
                sMenor = var[i];
            }
        }

       
        System.out.println(sMenor);
    }
}
