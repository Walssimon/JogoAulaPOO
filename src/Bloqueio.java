public class Bloqueio extends Escudo {
    private int reducao;

    public Bloqueio(int reducao){
        this.reducao = reducao;
    }

    @Override
    public int danoReduzido(int dano) {
        if(reducao > dano){
            return 0;
        }else{
            return dano - this.reducao;
        }
    }
}
