package exercicios.modulo.classesemetodos;

public class Pessoa {
    double pesoPessoa;
    String nomePessoa;

    Pessoa(double pesoPessoa, String nomePessoa) {
        this.pesoPessoa = pesoPessoa;
        this.nomePessoa = nomePessoa;
    }

    void comerComida(Comida comida){
        this.pesoPessoa += comida.pesoComida;
    }

    String apresentar() {
        return String.format("Olá meu nome é %s e tenho %.2fKg", nomePessoa, pesoPessoa);
    }

}
