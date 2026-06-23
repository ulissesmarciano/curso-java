package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    // Ler num1
    // Ler num2
    // + - * / %

    public static void main(String[] args) {
        System.out.println("Programa de divisão:");
        System.out.println("Digite o primeiro número:");

        Scanner entrada = new Scanner(System.in);
        double num1 = entrada.nextDouble();

        System.out.println("Digite o segundo número");
        double num2 = entrada.nextDouble();

        System.out.println("Informe a operação: ");
        String operacao = entrada.next();

        double resultado = "+".equals(operacao) ? num1 + num2 : 0;
        resultado = "-".equals(operacao) ? num1 - num2 : resultado;
        resultado = "*".equals(operacao) ? num1 * num2 : resultado;
        resultado = "/".equals(operacao) ? num1 / num2 : resultado;
        resultado = "%".equals(operacao) ? num1 % num2 : resultado;



        System.out.printf("%.2f %s %.2f = %.2f?", num1, operacao, num2, resultado);

        entrada.close();
    }
}
