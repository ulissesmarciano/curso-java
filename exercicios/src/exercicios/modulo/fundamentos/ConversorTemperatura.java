package exercicios.modulo.fundamentos;

import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {

        System.out.println("Insira os graus farenheit:");

        Scanner entrada = new Scanner(System.in);
        double farenheit = entrada.nextDouble();

        double conversao = (farenheit - 32) * 5/9;

        System.out.printf("%.2f Farenheit equivalem à %.2f Celsius", farenheit, conversao);


        entrada.close();
    }
}
