package metodgyak;

import java.util.Random;

public class Equalizer {
    public static void main(String[] args) {
        Random rnd = new Random();
        otEq();
    }
    
    private static void otEq(){
        for (int i = 0; i < 5; i++) {
            Eq();
        }
    }
    private static void Eq(){
        int felso, also;
        also = 3;
        felso = 7;
        int db = (int) (Math.random()* also + felso - 1)- also;
        for (int i = 0; i < db; i++) {
            System.out.print("\u001B[45m" + " ");
        }
        System.out.print("\n");
}
}