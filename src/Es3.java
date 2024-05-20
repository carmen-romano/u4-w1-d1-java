public class Es3 {
    public static void main(String[] args) {

        double lunghezza = 5.5;
        double larghezza = 3.3;
        double perimetro = perimetroRettangolo(lunghezza, larghezza);
        System.out.println("Il perimetro del rettangolo è: " + perimetro);
        System.out.println("Pari o dispari: " + pariOdispari(4));
        System.out.println("Perimetro triangolo: " + perimetroTriangolo(10.5,11,35));
    }

    public static double perimetroRettangolo(double lato1, double lato2) {
        return lato1 * 2 + lato2 * 2;

    }
    public static int pariOdispari(int num) {
        if (num % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }
    public static double perimetroTriangolo(double lato1, double lato2, double lato3) {
        double perimetro = (lato1 + lato2 + lato3) / 2;
        double areaQuadrato = perimetro * (perimetro - lato1) * (perimetro - lato2) * (perimetro - lato3);
        return   areaQuadrato * areaQuadrato;
    }

}

