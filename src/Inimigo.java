public abstract class Inimigo extends Criatura {

    int ataque;

    public Inimigo(int vida, String nome, int ataque) {
        super(vida, nome);
        this.ataque = ataque;
    }

    @Override
    public void fraseDeApresentacao() {

    }

    @Override
    public void fraseDeMorte() {

    }

    @Override
    public void fazerAtaque(Criatura criatura) {
        criatura.tomaDano(this.ataque);
    }
}
