public abstract class Inimigo extends Criatura {

    int ataque;
    Escudo escudo;
    public Inimigo(int vida, String nome, int ataque, Escudo escudo) {
        super(vida, nome);
        this.ataque = ataque;
        this.escudo = escudo;
    }

    @Override
    public void tomaDano(int dano) {
        int novoDano = escudo.danoReduzido(dano);
        super.tomaDano(novoDano);
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
