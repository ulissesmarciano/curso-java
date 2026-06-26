package exercicios.modulo.estruturasdecontrole;

public class AnoBissexto {
    public static void main(String[] args) {
        int year = 2023;

        if (year % 4==0 && (year % 100 !=0 || year% 400==0)){
            System.out.printf("O ano %d é bissexto", year);
        } else {
            System.out.printf("O ano %d não é bissexto.", year);
        }
    }
}
