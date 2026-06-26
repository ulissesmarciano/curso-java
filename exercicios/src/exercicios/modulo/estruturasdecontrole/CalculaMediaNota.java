package exercicios.modulo.estruturasdecontrole;

import java.util.Scanner;

public class CalculaMediaNota {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double nota1 = entrada.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = entrada.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 7 && media <= 10){
            System.out.println("Aprovado");
        } else if (media < 7 && media > 4) {
            System.out.println("Recuperação");
        } else if (media >= 0 && media < 4){
            System.out.println("Reprovado");
        } else {
            System.out.println("Nota inválida");
        }

        entrada.close();
    }
}
