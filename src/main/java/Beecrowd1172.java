
import java.util.Scanner;

public class Beecrowd1172 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        //declarar variável
        int X[] = new int[10];

        //ler valor, verificar condição e imprimir resultado
        for (int i = 0; i < 10; i++) {
            X[i] = scanner.nextInt();
            if (X[i] <= 0) {
                X[i] = 1;
            }
            System.out.printf("X[%d] = %d%n", i, X[i]);
        }
    }
}
