package jardinClase;

public class Puerta extends Thread{
    private Jardin jardin;
    public Puerta(Jardin j){
        jardin = j;
    }
    @Override
    public void run() {
        for (int i =0; i<1000; i++){
            jardin.incrementar();

        }
    }
}
