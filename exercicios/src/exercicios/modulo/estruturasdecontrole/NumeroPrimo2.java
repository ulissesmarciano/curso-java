package exercicios.modulo.estruturasdecontrole;

public class NumeroPrimo2 {
    public static void main(String[] args) {

        int num = 17;
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

        int resultado;

        if (primo) {
            resultado = 1;
        } else {
            resultado = 0;
        }

        switch (resultado) {
            case 1:
                System.out.println("O número é primo.");
                break;

            case 0:
                System.out.println("O número não é primo.");
                break;

            default:
                System.out.println("Valor inválido.");
        }
    }
}
