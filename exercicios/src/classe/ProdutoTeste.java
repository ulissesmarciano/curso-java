package classe;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 4356.54;
        p1.deconto = 0.25;

        var p2 = new Produto();
        p2.nome = "Caneca Preta";
        p2.preco = 12.56;
        p2.deconto = 0.29;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.preco * (1 - p1.deconto);
        double precoFinal2 = p2.preco * (1 - p2.deconto);
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
    }
}
