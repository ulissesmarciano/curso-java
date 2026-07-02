package classe;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data();
        var d2 = new Data(30, 6, 2026);



        String dataFormatada = d1.obterDataFormatada();

        System.out.println(dataFormatada);

        String data2Formatada = d2.obterDataFormatada();

        System.out.println(data2Formatada);
    }
}
