import java.util.Scanner;

public class DadosBancarios {
    public static void main(String[] args) {
        Scanner dadosCliente = new Scanner(System.in);
        String nome = "";
        String tipoConta = "";
        double Saldo;
        double novoSaldo = 0;
        int menuOpcoes = 0;
        String banco = "";

        System.out.println("Qual o seu banco?");
        banco = dadosCliente.nextLine();  // Usando nextLine para ler a linha inteira
        System.out.println("Qual o seu nome?");
        nome = dadosCliente.nextLine();  // Usando nextLine para ler o nome completo
        System.out.println("Qual o tipo da conta?");
        tipoConta = dadosCliente.nextLine();  // Usando nextLine para ler o tipo da conta
        System.out.println("Qual o seu saldo?");
        Saldo = dadosCliente.nextDouble();
        System.out.println("***********************************");
        System.out.println("Dados iniciais do cliente");
        System.out.println("Banco: " + banco);
        System.out.println("Nome: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo inicial: " + Saldo);
        System.out.println("***********************************");
        System.out.println("""
                Operações
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair""");

        while (menuOpcoes != 4) {
            System.out.println("Qual opção você deseja?");
            menuOpcoes = dadosCliente.nextInt();

            if (menuOpcoes == 1) {
                System.out.println("Seu saldo abaixo");
                System.out.println(Saldo);
            } else if (menuOpcoes == 2) {
                System.out.println("Valor recebido");
                novoSaldo = dadosCliente.nextDouble();
                Saldo += novoSaldo;
                System.out.println(Saldo);
            } else if (menuOpcoes == 3) {
                System.out.println("Informe o valor a ser transferido");
                novoSaldo = dadosCliente.nextDouble();

                if (novoSaldo > Saldo) {
                    System.out.println("Você não pode realizar a transferência. Saldo insuficiente.");
                } else {
                    Saldo -= novoSaldo;
                    System.out.println("Transferência realizada. Novo saldo: " + Saldo);
                }
            } else {
                System.out.println("Você saiu do sistema");
            }
        }
        System.out.println("***********************************");
        System.out.println("Dados finais do cliente");
        System.out.println("Banco: " + banco);
        System.out.println("Nome: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo final: " + Saldo);
        System.out.println("***********************************");
    }
}
