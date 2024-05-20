import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci una stringa 1/3");
        String frase1 = scan.nextLine();
        System.out.println("Inserisci una stringa 2/3");
        String frase2 = scan.nextLine();
        System.out.println("Inserisci una stringa 3/3");
        String frase3 = scan.nextLine();
        String concatenata = frase1.concat(" ").concat(frase2).concat(" ").concat(frase3);
        System.out.println("Stringhe concatenate: " + concatenata);
        String reverse = frase3.concat(" ").concat(frase2).concat(" ").concat(frase1);
        System.out.println("Stringhe al contrario: " + reverse);
    scan.close();
    }
}
