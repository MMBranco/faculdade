import java.util.Scanner;

public class maiorNum{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int maior = 0;
        int menor = 0;
        int soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "º número:");
            int num = teclado.nextInt();

            if (i == 0) {
                maior = menor = num;
            } else {
                if (num > maior) maior = num;
                if (num < menor) menor = num;
            }

            soma += num;
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Média: " + (double) soma / 5);

        teclado.close();
    }
}