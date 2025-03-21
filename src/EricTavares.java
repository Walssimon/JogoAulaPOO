public class EricTavares extends Inimigo{

    public EricTavares() {

        super( 500 ,"Eric Tavares", 50, new Bloqueio(30));
    }

    @Override
    public void fraseDeApresentacao() {
        System.out.println("Eu sou o recebinha, e vo te mata!!!");
    }

    @Override
    public void fraseDeMorte() {
        System.out.println("Ah nao, voce disse que eu estou errado! O meu ponto fraco");
    }

    @Override
    public void fazerAtaque(Criatura criatura) {
        super.fazerAtaque(criatura);
    }
}
