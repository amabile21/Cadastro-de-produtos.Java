import java.util.Scanner;// duas escolhas onde 1 e orcamento e 2 e cadastrar produtos

public class Main {
    public static void main(String[] args) {
        Scanner selecionarOpcao = new Scanner(System.in);

        System.out.println("Ola, bem-vindo. Selecione uma opcao: ");

        System.out.println("1 - Cadastro de produtos.");
        System.out.println("2 - Fazer orcamento.");
        int numero = selecionarOpcao.nextInt();

        if(numero == 1){
            Scanner input = new Scanner(System.in);

            System.out.println("=== Cadastro de Produto ===");
            System.out.print("Nome do produto: ");
            String nome = input.nextLine();

            System.out.print("Preço: ");
            double preco = input.nextDouble();

            System.out.print("Quantidade: ");
            int quantidade = input.nextInt();

            Produto produto1 = new Produto(nome, preco, quantidade);
            produto1.exibirInformacoes();

            input.close();
                
        } else if (numero == 2){

            Scanner entradaDados = new Scanner(System.in);

            System.out.println("=== Orcamento ===");
            System.out.print("Nome do produto: ");
            String nome = entradaDados.nextLine();

            System.out.print("Preço: ");
            Double preco = entradaDados.nextDouble();

            System.out.print("Quantidade: ");
            int quantidade = entradaDados.nextInt();

            Produto produto1 = new Produto(nome, preco, quantidade);
            produto1.exibirOrcamento();

            entradaDados.close();

        } else {
            System.out.println("Selecione um numero valido!");
        }

        selecionarOpcao.close();
    }

}
