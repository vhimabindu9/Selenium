import java.util.Scanner;

public class JavaProg {

    public static void countCurrency(int amount)
    {
        int[] notes = new int[]{ 100, 50, 20, 10, 5, 2, 1 };
        int[] noteCounter = new int[7];

        // count notes using Greedy approach
        for (int i = 0; i < 7; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        }

        // Print notes
        System.out.println("Currency Count ->");
        for (int i = 0; i < 7; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : "
                        + noteCounter[i]);
            }
        }
    }

    // driver function
    public static void main(String argc[]){
        Scanner s = new Scanner (System.in);
        System.out.println("enter a currency number:");
        int amount = s.nextInt();
        countCurrency(amount);
    }
}
