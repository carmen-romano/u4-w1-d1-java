public class Es1 {
    public static void main(String[] args) {
        System.out.println("Es1 result: " + sum(15, 20));
        System.out.println("Concatenation: " + conc("Ciao: ", 42));
    }

    public static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static String conc(String firstString, int num) {
        return firstString + num;
    }

}

