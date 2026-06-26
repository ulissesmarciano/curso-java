package exercicios.modulo.estruturasdecontrole;

import java.util.Scanner;

public class AdivinheONumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeroOculto = 45;
        int tentativasRestantes = 0;

        for (tentativasRestantes = 9; tentativasRestantes >= 0; tentativasRestantes--){
            System.out.println("Qual o número acha que é?");
            int tentativa = entrada.nextInt();

            if (tentativa == numeroOculto){
                System.out.println("Acertou!");
                break;
            } else if (tentativa >= 0 && tentativa < numeroOculto) {
                System.out.println("menor");
            } else if (tentativa > numeroOculto && tentativa <= 100) {
                System.out.println("maior");
            } else {
                System.out.println("Número inválido!");
            }
            System.out.println("Tentativas restantes:" + tentativasRestantes);
        }
        entrada.close();
    }
}
