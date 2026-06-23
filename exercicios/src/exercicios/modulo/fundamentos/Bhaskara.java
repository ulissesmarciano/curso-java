package exercicios.modulo.fundamentos;

public class Bhaskara {
    public static void main(String[] args) {

        double a = 1;
        double b = 12;
        double c = -13;

        double delta = b * b - 4 * a * c;
        System.out.println("\nO delta é: " + delta);

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        System.out.printf("O x1 da equação é: %.2f", x1);

        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.printf("\nO x2 da equação é: %.2f" ,x2);

    }
}
