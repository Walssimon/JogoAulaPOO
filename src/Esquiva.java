import java.util.Random;

public class Esquiva extends Escudo {
    private int chance;

    Esquiva(int chance){
        this.chance = chance;
    }

    @Override
    public int danoReduzido(int dano) {
        Random rd = new Random();

        int sorte = rd.nextInt(100);

        if( sorte < this.chance){
            System.out.println("Dano falhou!");
            return 0;
        }else{
            return dano;
        }

    }
}
