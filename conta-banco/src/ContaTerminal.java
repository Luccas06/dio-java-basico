// package br.com.contabanco; // Exemplo de nome de pacote

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in); // Cria objeto Scanner para leitura de dados

        // Declaração de variáveis para armazenar dados da conta
        int numeroAgencia;
        String nomeCliente;
        double saldoConta;

        // Solicitação e leitura dos dados da conta
        System.out.println("Por favor, digite o número da agência: ");
        numeroAgencia = entrada.nextInt();
        entrada.nextLine(); // Consumir quebra de linha

        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = entrada.nextLine();

        System.out.println("Por favor, digite o saldo da conta: ");
        saldoConta = entrada.nextDouble();

        entrada.close();

        // Formatação e exibição da mensagem final
        String mensagemFinal = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!\n" +
                "Sua agência é " + numeroAgencia + " e seu saldo " + saldoConta + " já está disponível para saque.";
        System.out.println(mensagemFinal);
    }

}
