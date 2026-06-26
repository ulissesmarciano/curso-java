package exercicios.modulo.estruturasdecontrole;

public class NumeroPrimo {
    public static void main(String[] args) {

        int num = 16;
        boolean primo = true;

        if (num <= 1) {
            primo = false;
        } else {
            for (int i = 2; i < num; i++) {

                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.printf("O número %d é primo.%n", num);
        } else {
            System.out.printf("O número %d não é primo.%n", num);
        }
    }
}
