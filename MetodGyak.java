package metodgyak;
public class MetodGyak {
    public static void main(String[] args) {
       feladatok();
    }
    
    public static void feladatok() {
        tizSzamOsszege();
        ketSzamOsszege();
        negySzamOsszege();
        haromszamGyokVonasa();
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
    
    private static void tizSzamOsszege(){
        kiir("Az első 10 szám összege: "+ elso10SzamOsszege());
    }
    
    private static void ketSzamOsszege(){
       int szam1, szam2, osszeg;
       szam1 = 16;
       szam2 = 22;
       osszeg = osszead(szam1, szam2);
       kiir("%d + %d = %d\n".formatted(szam1, szam2, osszeg));
    }
    
    private static void negySzamOsszege(){
       int szam1, szam2, osszeg, osszeg2;
       szam1 = 16;
       szam2 = 22;
       int szam3 = 20;
       int szam4 = 18;
       osszeg = osszead(szam1, szam2);
       osszeg2 = osszead(szam3, szam4);
       int negySzamOsszege = osszead(osszeg, osszeg2);
       kiir("%d + %d + %d + %d = %d\n".formatted(szam1, szam2, szam3, szam4, negySzamOsszege));
    }
    
    private static void haromszamGyokVonasa(){
       int szam1, szam2, osszeg, osszeg2;
       szam1 = 16;
       szam2 = 22;
       int szam3 = 20;
       int szam4 = 18;
       double gyokosszeg;
       int haromszam = osszead(szam3, osszead(szam1, szam2));
       gyokosszeg = Math.sqrt(haromszam);
       kiir("%d + %d + %d gyöke: ", szam1, szam2, szam3);
       String kimenet = String.format("%s %4.f\n", gyokosszeg);
       kiir(kimenet);
    }
}
