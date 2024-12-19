import java.util.Scanner;

public class DadosBancarios {
    public static void main(String[] args) {
        Scanner dadosCliente = new Scanner(System.in);
        String nome = "";
        String tipoConta = "";
        String banco = "";
        double Saldo;
        double novoSaldo = 0;
        int menuOpcoes = 0;
        int numeroAgencia = 0;
        int numeroConta = 0;

        System.out.println("Qual o seu nome?");
        nome = dadosCliente.nextLine();

        System.out.println("Qual é o seu banco?");
        banco = dadosCliente.nextLine();

        System.out.println("Qual é o tipo da conta?");
        tipoConta = dadosCliente.nextLine();

        System.out.println("Qual é o número da agência?");
        numeroAgencia = dadosCliente.nextInt();

        System.out.println("Qual é o número da conta?");
        numeroConta = dadosCliente.nextInt();

        System.out.println("Qual é o seu saldo?");
        Saldo = dadosCliente.nextDouble();

        //Fazer verificação de dados no banco, se não for encontrado voltar para o sistema inicial de preenchimento de dados

        System.out.println("***********************************");
        System.out.println("Dados iniciais do cliente");
        System.out.println("Nome: " + nome);
        System.out.println("Banco: " + banco);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Agencia: " + numeroAgencia);
        System.out.println("Conta: " + numeroConta);
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
                //realizar recebimento com pessoas cadastradas no banco de dados, pedir senha de acesso ao usuario para realizar transferencia
            } else if (menuOpcoes == 3) {
                System.out.println("Informe o valor a ser transferido");
                novoSaldo = dadosCliente.nextDouble();
                //realizar transferencia com pessoas cadastradas no banco de dados
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
        //mostrar as pessoas que realizaram a transferencia e colocar no console
    }
}
