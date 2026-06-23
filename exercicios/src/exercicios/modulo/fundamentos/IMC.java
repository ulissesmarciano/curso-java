package exercicios.modulo.fundamentos;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu peso em kg:");
        double peso = entrada.nextDouble();

        System.out.println("Digite sua altura em m:");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é %.2f ", imc);

        entrada.close();
    }
}
