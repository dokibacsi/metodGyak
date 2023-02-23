package metodgyak;
public class MetodGyak {
    public static void main(String[] args) {
       kiir("Az első 10 szám összege: "+ elso10SzamOsszege());
       kiir("\n");
       int szam1, szam2, osszeg, osszeg2;
       szam1 = 16;
       szam2 = 22;
       int szam3 = 20;
       int szam4 = 18;
       osszeg = osszead(szam1, szam2);
       osszeg2 = osszead(szam3, szam4);
       int negySzamOsszege = osszead(osszeg, osszeg2);
       kiir("%d + %d = %d\n".formatted(szam1, szam2, osszeg));
       kiir("%d + %d + %d + %d = %d\n".formatted(szam1, szam2, szam3, szam4, negySzamOsszege));
       // gyökvonás
       double gyok, gyokosszeg;
       gyok = 0;
       int haromszam = osszead(szam3, osszead(szam1, szam2));
       gyokosszeg = Math.sqrt(haromszam);
       kiir("%d + %d + %d gyöke: %s\n", szam1, szam2, szam3, gyokosszeg);
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
