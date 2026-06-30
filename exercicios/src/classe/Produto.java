package classe;

public class Produto {
    String nome;
    double preco;
    double desconto;

    Produto(){}

    Produto (String nomeInicial, double precoInicial, double descontoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    }

    double precoComDesconto(double descontoAdicional){
        return preco * (1 - desconto + descontoAdicional);
    }

    double precoComDesconto(){
        return preco * (1 - desconto);
    }
}
