import java.util.Scanner;

public class contasPalavras {

    public static int contarPalavras(String frase) {
        if (frase == null || frase.trim().isEmpty()) {
            return 0;
        }
        String[] palavras = frase.trim().split("\\s+");
        
        return palavras.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String frase = sc.nextLine();

        System.out.println(contarPalavras(frase));
        
        sc.close();
    }
}