public class Multiplos {

    public static int somaMultiplos3ou5(int n) {
        int soma = 0;

        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                soma += i; 
            }
        }

        return soma;
    }

    public static void main(String[] args) {
       
        System.out.println(somaMultiplos3ou5(10)); 
        System.out.println(somaMultiplos3ou5(20)); 
    }
}