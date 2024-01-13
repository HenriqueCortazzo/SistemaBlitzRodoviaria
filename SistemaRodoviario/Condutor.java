package SistemaRodoviario;

import java.util.Scanner;

public class Condutor {

    public void operacaoMonetaria(String placa, String nome, long renavam, String marca) {
        Abordagem abordagem = new Abordagem();
        int opcao;
        String designacao = "";
        String numeroCartao;
        String cvc;
        String dataValidade;
        double saldoConta = 3500;
        int limiteCartao = 1850;
        Scanner scanner = new Scanner(System.in);
        System.out.println("DIGITE O SEU NOME: ");
        String nomeCompleto = scanner.next();
        System.out.println("DIGITE O SEU CPF");
        String cpf = scanner.next();
        System.out.println("SELECIONE AS OPÇOES: ");
        System.out.println("1 - DÉBITO\n2 - CRÉDITO\n3 - PIX");
        opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("QUAL A DESIGNAÇÃO DO CARTÃO: ");
                System.out.println("1 - VISA\n2 - MASTERCARD");
                int op = scanner.nextInt();
                int senha = 1234;
                switch (op) {
                    case 1:
                        System.out.println("DIGITE O NÚMERO DO CARTÃO: ");
                        numeroCartao = scanner.next();
                        System.out.println("DIGITE O CÓDIGO DE SEGURANÇA DO CARTÃO");
                        cvc = scanner.next();
                        System.out.println("DIGITE A DATA DE VALIDADE DO CARTÃO");
                        dataValidade = scanner.next();
                        System.out.println("DIGITE SUA SENHA PARA CONFIRMAÇÃO: ");
                        int senhaVerificacao = scanner.nextInt();
                        if (senhaVerificacao == senha) {
                            Patio patio = new Patio();
                            double valorRetirarVeiculo = patio.getValorRetirarVeiculo();
                            if (saldoConta >= valorRetirarVeiculo) {
                                System.out.println("O VEÍCULO LIBERADO COM SUCESSO.\n");
                                Patio.veiculosLiberados++;
                                Patio.veiculosApreendidos--;
                                for (int i = 0; i < Situacao.veiculosLiberados.length; i++) {
                                    if (Situacao.veiculosLiberados[i] == null) {
                                        Situacao.veiculosLiberados[i] = "MARCA: " + marca.toUpperCase() + " | NOME: " + nome.toUpperCase() + " | PLACA: " + placa + " | RENAVAM:" + renavam;
                                        break;
                                    }
                                }
                            } else {
                                System.out.println("SALDO INSUFICIENTE.");
                                Patio.veiculosLiberados--;
                                Patio.veiculosApreendidos++;
                                for (int i = 0; i < Situacao.veiculosApreendidos.length; i++) {
                                    if (Situacao.veiculosApreendidos[i] == null) {
                                        Situacao.veiculosApreendidos[i] = "MARCA: " + marca.toUpperCase() + " | NOME: " + nome.toUpperCase() + " | PLACA: " + placa + " | RENAVAM:" + renavam;
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        break;
                }
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }


}
