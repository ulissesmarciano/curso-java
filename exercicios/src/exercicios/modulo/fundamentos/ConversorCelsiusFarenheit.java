package exercicios.modulo.fundamentos;

import java.util.Scanner;

public class ConversorCelsiusFarenheit {
    public static void main(String[] args) {

        System.out.println("Insira os graus celsius:");

        Scanner entrada = new Scanner(System.in);
        double celsius = entrada.nextDouble();

        double conversao = (celsius * 9/5) + 32;

        System.out.printf("%.2f Celsius equivalem à %.2f Farenheit", celsius, conversao);


        entrada.close();
    }
}
