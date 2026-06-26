package exercicios.modulo.estruturasdecontrole;

public class VerificaSeEPar {
    public static void main(String[] args) {

        int num = 1;

        if (num % 2 == 0 && num >= 0 && num <= 10) {
            System.out.println("A entrada " + num + "é um número par e está entre 0 e 10.");

        } else {
            System.out.printf("O número %s inválido!", num);
        }
    }
}
