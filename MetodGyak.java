package metodgyak;
public class MetodGyak {
    public static void main(String[] args) {
       kiir("Az első 10 szám összege: "+ elso10SzamOsszege());
       kiir("\n");
       kiir("%d + %d = %d", 2, 3, osszead(2+3));
    }
    
    private static int elso10SzamOsszege() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
        }
        return osszeg;
    }
    
    private static int osszead(int szam1, int szam2){
       return szam1+szam2;
    }
    
    
    private static void kiir(String szoveg){
        System.out.print(szoveg);
    }
    
}
