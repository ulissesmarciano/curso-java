package classe;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data();
        d1.dia = 30;
        d1.mes = "junho";
        d1.ano = 2026;

        String dataFormatada = "Hoje é dia " + d1.dia + " de " + d1.mes + " de " + d1.ano + ".";

        System.out.println(dataFormatada);
    }
}
