package fundamentos.operadores;

public class DesafioLogicos {
    public static void main(String[] args) {

        boolean trabalho1 = false;
        boolean trabalho2 = false;

        boolean comprouTV55 = trabalho1 && trabalho2;
        boolean comprouTV32 = trabalho1 ^ trabalho2;
        boolean tomaramSorvete = trabalho1 || trabalho2;
        boolean ficaramEmCasa =  !tomaramSorvete; //operador unário

        System.out.println("Comprar tv de 55 polegadas: " + (comprouTV55));
        System.out.println("Comprar tv de 32 polegadas: " + (comprouTV32));
        System.out.println("Tomaram sorvete: " + (tomaramSorvete));
        System.out.println("Ficaram em casa: " + ficaramEmCasa);
    }
}
