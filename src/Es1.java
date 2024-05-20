import java.lang.reflect.Array;

public class Es1 {
    public static void main(String[] args) {
        System.out.println("Es1 result: " + sum(15, 20));
        System.out.println("Concatenation: " + conc("Ciao: ", 42));

        String[] myArray = {"uno", "due", "tre", "quattro", "cinque"};
        String myString = "Sesto elemento";
        String[] risultato = stringArr(myArray, myString);

        System.out.print("Array result: ");
        for (int i = 0; i < risultato.length; i++) {
            System.out.print(risultato[i] + " ");
        }

    }

    public static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static String conc(String firstString, int num) {
        return firstString + num;
    }

    public static String[] stringArr(String[] myArray, String myString) {
        String[] nuovoArray = new String[6];

        System.arraycopy(myArray, 0, nuovoArray, 0, 2);

        nuovoArray[2] = myString;

        System.arraycopy(myArray, 2, nuovoArray, 3, myArray.length - 2);

        return nuovoArray;
    }
}

