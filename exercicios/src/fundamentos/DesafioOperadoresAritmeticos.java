package fundamentos;

public class DesafioOperadoresAritmeticos {
    public static void main(String[] args) {
        double primeiraExpressao = Math.pow((6*(3+2)), 2);
        double divisaoPrimeiraExpressao = primeiraExpressao / (3*2);

        double segundaExpressao = Math.pow((1 - 5) * (2 - 7) /2.0 , 2);

        double potenciaExpressoes = Math.pow((divisaoPrimeiraExpressao - segundaExpressao), 3);
        double divisaoExpressoes = potenciaExpressoes / Math.pow(10, 3);

        System.out.println((int )divisaoExpressoes);
    }
}
