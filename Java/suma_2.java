import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class Main {
    public static void main (String[] args) {
        Scanner input= new Scanner(System.in);
        int sum = 0;
        int num = 1;
        while (num != 0) {
            System.out.println("Introduce un numero: ");
            num = input.nextInt();
            sum = sum + num;
        }
        System.out.println("El resultado es: "+sum);
    }
}