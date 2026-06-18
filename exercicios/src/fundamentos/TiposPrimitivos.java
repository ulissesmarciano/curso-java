package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {

        // Informações do funcionario

        //Tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 567;
        int id = 56789;
        long pontosAcumulados = 3_234_845_223L; //preciso utilizar um L ou l no final para dizer que ele é um long.

        // Tipos numéricos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        // Tipo booleano
        boolean estaDeFerias = false;

        // Tipo caractere
        char status = 'A'; // aceita somente um caractere

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        // Número de viagens
        System.out.println(numeroDeVoos / 2);

        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " + status);
    }
}
