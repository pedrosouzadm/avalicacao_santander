package Exercicio_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        scanner.close();

        int triangulo = (numero % 2 == 0) ? numero / 2 : (numero / 2) + 1;
        for (int i = 0; i < triangulo; i++) {
            for (int j = triangulo - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = triangulo - 1; i >= 0; i--) {
            for (int j = 0; j < triangulo - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}