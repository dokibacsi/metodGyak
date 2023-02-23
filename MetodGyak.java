package metodgyak;
public class MetodGyak {
    public static void main(String[] args) {
       kiir("Az első 10 szám összege: "+ elso10SzamOsszege());
       kiir("\n");
       int szam1, szam2, osszeg, osszeg2;
       szam1 = 4;
       szam2 = 8;
       int szam3 = 28;
       int szam4 = 2;
       osszeg = osszead(szam1, szam2);
       osszeg2 = osszead(szam3, szam4);
       int 4szamOsszeg = osszeg + osszeg2;
       kiir("%d + %d = %d\n".formatted(szam1, szam2, osszeg));
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
