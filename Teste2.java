import javax.swing.JOptionPane;

class Pessoa {
    String nome;
    int idade;

    public void adicionaInfo(String n, int id){
        this.nome = n;
        this.idade = id;
    }

    public void mostreInfo() {
        System.out.println("Nome: "+ this.nome + "; Idade: " + this.idade + "; Ano nascimento: " + (2026 - this.idade));
    }
}

public class Teste2 {
    public static void main(String[] args){
        // Pessoa = new Pessoa();
        // p1.adicionaInfo("João", 22);

        // Pessoa p2 = new Pessoa();
        // p2.adicionaInfo("José", 33);
		
        // Pessoa p3 = new Pessoa();
        // p3.adicionaInfo("Marcelo", 35);
		
		Pessoa tmp;
		
		tmp = new Pessoa();
        tmp.adicionaInfo("João", 22);
		tmp.mostreInfo();

        tmp = new Pessoa();
        tmp.adicionaInfo("José", 33);
		tmp.mostreInfo();
		
        tmp = new Pessoa();
        tmp.adicionaInfo("Marcelo", 35);
		tmp.mostreInfo();
		

        // p1.mostreInfo();
        // p2.mostreInfo();
		// p3.mostreInfo();
    }   
}