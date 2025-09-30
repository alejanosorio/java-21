
import java.util.Random;
import java.util.Scanner;

public class numbers {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scn = new Scanner(System.in);
        int rx = random.nextInt(35) + 1;
        int userNum = 0;
        System.out.println("Adivina el número entre 1 y 100.");
        while (userNum != rx) {
            System.out.print("Introduce un número: ");
            userNum = scn.nextInt();
            if (userNum > rx) {
                System.out.println("Muy alto, intenta otra vez.");
            } else if (userNum < rx) {
                System.out.println("Muy bajo, intenta otra vez.");
            } else {
                System.out.println("¡Correcto! Adivinaste el número.");
            }
        }

        scn.close();
    }


}
