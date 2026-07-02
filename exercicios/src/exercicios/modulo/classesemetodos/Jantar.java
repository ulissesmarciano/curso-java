package exercicios.modulo.classesemetodos;

public class Jantar {
    public static void main(String[] args) {
        Comida c1 = new Comida(0.255, "Feijão");
        Comida c2 = new Comida(1.355, "Arroz");

        Pessoa pessoa1 = new Pessoa(80.00, "Ulisses");

        System.out.println(pessoa1.apresentar());
        pessoa1.comerComida(c1);
        System.out.println(pessoa1.apresentar());
        pessoa1.comerComida(c2);
        System.out.println(pessoa1.apresentar());
    }
}
