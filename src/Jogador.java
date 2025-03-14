import java.util.Scanner;
import java.util.Random;
public class Jogador extends Criatura {

    private int ataqueForte = 120;
    private int ataqueFraco = 40;
    private int risco = 50;

    public Jogador( String nome) {
        super(700, nome);
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
        System.out.println("1) Faca: Dano= " + ataqueFraco + "Risco = 0%");
        System.out.println("2) Arco e flecha: Dano= " + ataqueForte + "Risco = 50%");
        int escolha = scan.nextInt();
        if(escolha == 1){
            criatura.tomaDano(this.ataqueFraco);
        }else if(escolha == 2){
            Random rd = new Random();
            int sorteio = rd.nextInt(0,100);
            if (sorteio < risco) {
                System.out.println("Ataque falhou");
            }else{
                System.out.println("Hit");
                criatura.tomaDano(this.ataqueForte);
            }
        }else{
            criatura.tomaDano(0);
        }
    }
}
