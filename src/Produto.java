import java.util.Scanner;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void exibirInformacoes() {
        System.out.println();
        System.out.println("Cadastro realizado!");
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println();
        System.out.println("-------------------------------");

    }

    public void exibirOrcamento() {
        Double novoPreco = quantidade * preco;
        System.out.printf("O orçamento total do produto %s, sera de: %.2f \n", nome, novoPreco);

    }
}
