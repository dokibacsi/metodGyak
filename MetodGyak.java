package metodgyak;
public class MetodGyak {
    public static void main(String[] args) {
       
    }
    
    private static void elso10SzamOsszege() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += i;
        }
        //kiir
        kiir("Az első 10 szám összege: " + osszeg);
    }
    
    private static String osszead(int a, int b){
        String osszeadSzoveg = "%d + %d = %d\n", a, b, a+b;
        return osszeadSzoveg;
    }
    
    
    private static void kiir(String szoveg){
        System.out.println(szoveg);
    }
    
}
