
public class Main {
    public static void main(String[] args) {

    Criatura jogador = new Jogador("Caio Zancheta",500);
    Criatura inimigo = new EricTavares();

        System.out.println("Bem vindo ao Senac");
        jogador.fraseDeApresentacao();
        inimigo.fraseDeApresentacao();
        while (jogador.estaVivo() && inimigo.estaVivo()){
            jogador.fazerAtaque(inimigo);
            if (inimigo.estaVivo()){
                inimigo.fazerAtaque(jogador);
            }

            jogador.mostraVida();
            inimigo.mostraVida();
            if (!jogador.estaVivo()){
                jogador.fraseDeMorte();
                System.out.println("Inimigo venceu!");
            }
            if (!inimigo.estaVivo()){
                inimigo.fraseDeMorte();
                System.out.println("Jogador venceu!");
            }
        }
    }
}