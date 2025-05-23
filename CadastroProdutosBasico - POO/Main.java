import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Produto produto1 = new Produto("Cartão de Visita", 50.0, 100);
        produto1.exibirInfo();

        System.out.println("=== Cadastro de Produto ===");
        System.out.print("Nome do produto: ");
        String nome = input.nextLine();

        System.out.print("Preço: ");
        double preco = input.nextDouble();

        System.out.print("Quantidade: ");
        int quantidade = input.nextInt();

        Produto produto2 = new Produto(nome, preco, quantidade);
        produto2.exibirInfo();

        input.close();
    }
}
