public class maiorNum {

    private int[] numeros;


    public maiorNum(int[] entrada) {
        this.numeros = entrada;
    }


    public int encontrarMaior() {
        int maior = numeros[0];
        for (int n : numeros) {
            if (n > maior) {
                maior = n;
            } 
        }
        return maior;
    }

    public static void main(String[] args) {  
        int[] meuVetor = {2, 5, 1, 9, 3};
        

        maiorNum analise = new maiorNum(meuVetor);
        System.out.println("O maior número é: " + analise.encontrarMaior());
    }
}