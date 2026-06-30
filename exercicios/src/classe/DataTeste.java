package classe;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data();
        d1.dia = 30;
        d1.mes = "junho";
        d1.ano = 2026;

        String dataFormatada = d1.obterDataFormatada();

        System.out.println(dataFormatada);
    }
}
