package exercicios.modulo.fundamentos;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira a altura do triângulo: ");
        double altura = entrada.nextDouble();

        System.out.println("Insira a altura do triângulo: ");
        double base = entrada.nextDouble();

        double area = (altura * base) / 2;

        System.out.println("A área do triângulo é " + area + "cm2");
        entrada.close();
    }
}
