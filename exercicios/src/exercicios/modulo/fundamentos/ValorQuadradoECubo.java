package exercicios.modulo.fundamentos;

import java.util.Scanner;

public class ValorQuadradoECubo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um valir inteiro:");
        int num1 = entrada.nextInt();

        int quadrado = num1 * num1;
        int cubo = num1 * num1 * num1;

        System.out.printf("O valor ao quadrado de %s é %s", num1, quadrado);
        System.out.printf("\nO valor ao cubo de %s é %s", num1, cubo);

        entrada.close();
    }
}
