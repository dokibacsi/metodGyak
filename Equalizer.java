package metodgyak;

import java.util.Random;

public class Equalizer {
    public static void main(String[] args) {
        Random rnd = new Random();
        otEq();
    }
    
    private static void otEq(){
        for (int i = 0; i < 5; i++) {
            Eq(3);
        }
    }
    private static void Eq(){
        int db = rnd.nextInt(3,8);
        Eq(db);
}
    private static void Eq(int hossz){
        int db = hossz;
        for (int i = 0; i < db; i++) {
            System.out.print("\u001B[45m" + " ");
        }
    }
}