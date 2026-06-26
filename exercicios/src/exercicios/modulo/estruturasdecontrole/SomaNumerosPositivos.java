package exercicios.modulo.estruturasdecontrole;

import java.util.Scanner;

public class SomaNumerosPositivos {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        int total = 0;

        System.out.print("Informe o número: ");
        numero = entrada.nextInt();

        while (numero >= 0) {
            total += numero;
            System.out.println("Total parcial: " + total);

            System.out.print("Informe o número: ");
            numero = entrada.nextInt();
        }
        System.out.println("Total final: " + total);

        entrada.close();
    }
}
