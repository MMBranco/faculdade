import java.util.Scanner;

public class Plim {


    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int inicio = lerNum("Digite o número inicial: ");
        int fim = lerNum("Digite o número final: ");
        int numero = lerNum("Digite o número Plim: ");
        
        executar(inicio, fim, numero);
        
        scanner.close();
    }


    public static int lerNum(String msg) {
        System.out.print(msg);
        return scanner.nextInt();
    }


    public static void executar(int inicio, int fim, int divisor) {
        System.out.println("\nResultado:");
        for (int i = inicio; i <= fim; i++) {
            if (i % divisor == 0) {
                System.out.println("Plim!");
            } else {
                System.out.println(i);
            }
        }
    }
}