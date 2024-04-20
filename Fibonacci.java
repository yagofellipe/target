public class Fibonacci {
    public static void main(String[] args) {
        int number = 21; 
        int firstNumber = 0;
        int secondNumber = 1;
        boolean found = false;

        System.out.print("Fibonacci sequence up to " + number + ": ");
        while (firstNumber <= number) {
            System.out.print(firstNumber + " ");
            if (firstNumber == number) {
                found = true;
            }
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
        if (found) {
            System.out.println("\n" + number + " is in the sequence.");
        } else {
            System.out.println("\n" + number + " is not in the sequence.");
        }
    }
}