package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        String entrada1 = entrada.nextLine().replace(",", ".");

        System.out.println("Digite a segunda nota:");
        String entrada2 = entrada.nextLine().replace(",", ".");

        System.out.println("Digite a terceira nota:");
        String entrada3 = entrada.nextLine().replace(",", ".");

        double nota1 = Double.parseDouble(entrada1);
        double nota2 = Double.parseDouble(entrada2);
        double nota3 = Double.parseDouble(entrada3);

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média é: " + media);
        entrada.close();
    }
}
