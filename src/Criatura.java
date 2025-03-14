public abstract class Criatura  {
    private String nome;
    private int vida;

    public Criatura(int vida, String nome) {
        this.vida = vida;
        this.nome = nome;
    }

    public abstract void fraseDeApresentacao();

    public abstract void fraseDeMorte();

    public abstract void fazerAtaque( Criatura criatura);

    public boolean estaVivo(){
        return vida > 0 ;
    }

    public void tomaDano(int dano){
        if (dano > this.vida) {
            this.vida = 0;
        }else{
        this.vida -= dano;
        System.out.println(this.nome + " toma " + dano + "de dano.");
        }
    }

    public void mostraVida(){
        System.out.println(this.nome + " tem " + this.vida + " de vida.");
    }


}
