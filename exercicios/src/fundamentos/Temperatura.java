package fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        // (oF -32 ) x 5/9 = oC
        int farenheight = 86;
        final int diferenca =  32;
        final double fator = 5.0/9;

        double celsius = (farenheight - diferenca) * fator;

        System.out.println(farenheight + "F" + " equivale a " + celsius + "C");
    }
}
