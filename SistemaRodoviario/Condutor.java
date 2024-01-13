package SistemaRodoviario;

import java.util.Scanner;

public class Condutor {

    public void operacaoMonetaria(String placa, String nome, long renavam, String marca) {
        new Abordagem();
        int opcao;
        int cvc;
        int cvc1;
        double saldoConta = 3500;
        int limiteCartao = 1850;
        int senhaVerificacao;
        int senhaVerificacao1;
        int senhaVerificacao2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("SELECIONE AS OPÇOES: ");
        System.out.println("1 - DÉBITO\n2 - CRÉDITO\n3 - PIX");
        opcao = scanner.nextInt();
        String s1 = "MARCA: " + marca.toUpperCase() + " | NOME: " + nome.toUpperCase() + " | PLACA: " + placa + " | RENAVAM:" + renavam;
        Patio patio = new Patio();
        switch (opcao) {
            case 1:
                final int senha = 1234;
                final int cvcOficial = 304;
                do {
                    System.out.println("DIGITE O CÓDIGO DE SEGURANÇA DO CARTÃO");
                    cvc = scanner.nextInt();
                    System.out.println("DIGITE SUA SENHA PARA CONFIRMAÇÃO: ");
                    senhaVerificacao = scanner.nextInt();
                    if (senhaVerificacao != senha || cvcOficial != cvc) {
                        System.out.println("SENHA OU CVC INCORRETO");
                    }
                } while (senhaVerificacao != senha || cvc != cvcOficial);
                double valorRetirarVeiculo = patio.getValorRetirarVeiculo();
                if (saldoConta >= valorRetirarVeiculo) {
                    System.out.println("O VEÍCULO LIBERADO COM SUCESSO.\n");
                    Patio.veiculosLiberados++;
                    Patio.veiculosApreendidos--;
                    for (int i = 0; i < Situacao.veiculosLiberados.length; i++) {
                        if (Situacao.veiculosLiberados[i] == null) {
                            Situacao.veiculosLiberados[i] = s1;
                            break;
                        }
                    }
                } else {
                    System.out.println("SALDO INSUFICIENTE.");
                    Patio.veiculosLiberados--;
                    Patio.veiculosApreendidos++;
                    for (int i = 0; i < Situacao.veiculosApreendidos.length; i++) {
                        if (Situacao.veiculosApreendidos[i] == null) {
                            Situacao.veiculosApreendidos[i] = s1;
                            break;
                        }
                    }
                }
                break;
            case 2:
                final int senha1 = 2010;
                final int cvcOficial1 = 704;
                do {
                    System.out.println("DIGITE O CÓDIGO DE SEGURANÇA DO CARTÃO");
                    cvc1 = scanner.nextInt();
                    System.out.println("DIGITE SUA SENHA PARA CONFIRMAÇÃO: ");
                    senhaVerificacao1 = scanner.nextInt();
                    if (senhaVerificacao1 != senha1 || cvcOficial1 != cvc1) {
                        System.out.println("SENHA OU CVC INCORRETO");
                    }
                } while (senhaVerificacao1 != senha1 || cvc1 != cvcOficial1);
                valorRetirarVeiculo = patio.getValorRetirarVeiculo();
                if (limiteCartao >= valorRetirarVeiculo) {
                    System.out.println("O VEÍCULO LIBERADO COM SUCESSO.\n");
                    Patio.veiculosLiberados++;
                    Patio.veiculosApreendidos--;
                    for (int i = 0; i < Situacao.veiculosLiberados.length; i++) {
                        if (Situacao.veiculosLiberados[i] == null) {
                            Situacao.veiculosLiberados[i] = s1;
                            break;
                        }
                    }
                } else {
                    System.out.println("LIMITE INSUFICIENTE.");
                    Patio.veiculosLiberados--;
                    Patio.veiculosApreendidos++;
                    for (int i = 0; i < Situacao.veiculosApreendidos.length; i++) {
                        if (Situacao.veiculosApreendidos[i] == null) {
                            Situacao.veiculosApreendidos[i] = s1;
                            break;
                        }
                    }
                }
                break;
            case 3:
                System.out.println("DIGITE A CHAVE PIX: ");
                String chavePix = scanner.next();
                System.out.println("CONFIRME A CHAVE: " + chavePix + " S/N");
                String confChave = scanner.next();
                final int senhaPix = 1234;
                do {
                    System.out.println("DIGITE SUA SENHA PARA CONFIRMAÇÃO: ");
                    senhaVerificacao2 = scanner.nextInt();
                    if (senhaVerificacao2 != senhaPix) {
                        System.out.println("SENHA OU CHAVE PIX INCORRETA");
                    }
                } while (senhaVerificacao2 != senhaPix || !confChave.equalsIgnoreCase("s"));
                valorRetirarVeiculo = patio.getValorRetirarVeiculo();
                if (saldoConta >= valorRetirarVeiculo) {
                    System.out.println("O VEÍCULO LIBERADO COM SUCESSO.\n");
                    Patio.veiculosLiberados++;
                    Patio.veiculosApreendidos--;
                    for (int i = 0; i < Situacao.veiculosLiberados.length; i++) {
                        if (Situacao.veiculosLiberados[i] == null) {
                            Situacao.veiculosLiberados[i] = s1;
                            break;
                        }
                    }
                } else {
                    System.out.println("LIMITE INSUFICIENTE.");
                    Patio.veiculosLiberados--;
                    Patio.veiculosApreendidos++;
                    for (int i = 0; i < Situacao.veiculosApreendidos.length; i++) {
                        if (Situacao.veiculosApreendidos[i] == null) {
                            Situacao.veiculosApreendidos[i] = s1;
                            break;
                        }
                    }
                    break;
                }
        }
    }
}

