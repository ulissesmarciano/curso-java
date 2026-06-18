package fundamentos;

public class Inferencia {
    public static void main(String[] args) {
        double a = 4.5;
        System.out.println(a);
        var b = 4.5;
        System.out.println(b);

        var c = "Texto";
        System.out.println(c);

        c = "Outro Texto";
        System.out.println(c);

        // c = 4.5; //na inferencia aqui dá erro pois eu estou chamando uma variavel por um tipo no inicio e tentando mudar para outro.

        double d; //variável declarada
        d = 14.5; // atribuo valor à variável
        System.out.println(d); //imprimo a variável
    }
}
