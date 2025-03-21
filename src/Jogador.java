import java.util.Scanner;
public class Jogador extends Criatura {

    private int ataqueForte = 120;
    private int ataqueFraco = 40;
    private int risco = 50;
    private Arma[] armas = new Arma[]{new Faca(),new ArcoEFlecha(), new Pistola(), new Espada()};

    public Jogador( String nome) {
        super(700, nome);
    }

    public Jogador(String nome, int vida){
        super(vida,nome);
    }

    @Override
    public void fraseDeApresentacao() {
        System.out.println("Tenho uma duvida?!");
    }

    @Override
    public void fraseDeMorte() {
        System.out.println("Ah cara, eu nao acho!");
    }

    @Override
    public void fazerAtaque(Criatura criatura) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha sua arma");
        int i =0;
        for(Arma arma : this.armas){
            i++;
            System.out.println(i + ") " + arma.mensagem());}

        int escolha = scan.nextInt();
        int danoAtual = this.armas[escolha -1].getDano();
        criatura.tomaDano(danoAtual);
    }
}
