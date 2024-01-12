package SistemaRodoviario;

import java.util.Scanner;

public class Condutor {
    private String nomeCompleto;
    private String cpf;
    private double saldoConta;

    private final int senha = 1234;

    public Condutor() {

    }

    private void operacaoMonetaria() {
        int opcao;
        String designacao ="";
        String numeroCartao="";
        String cvc="";
        String dataValidade="";
        String dadosCartaoCompleto="";
        saldoConta =3500;
        int limiteCartao = 1850;
        Scanner scanner = new Scanner(System.in);
        System.out.println("DIGITE O SEU NOME: ");
        nomeCompleto = scanner.next();
        System.out.println("DIGITE O SEU CPF");
        cpf = scanner.next();
        System.out.println("SELECIONE AS OPÇOES: ");
        System.out.println("1 - DÉBITO\n2 - CRÉDITO\n3 - PIX");
        opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("QUAL A DESIGNAÇÃO DO CARTÃO: ");
                System.out.println("1 - VISA\n2 - MASTERCARD");
                int op = scanner.nextInt();
                switch (op){
                    case 1:
                        System.out.println("DIGITE O NÚMERO DO CARTÃO: ");
                        numeroCartao = scanner.next();
                        System.out.println("DIGITE O CÓDIGO DE SEGURANÇA DO CARTÃO");
                        cvc = scanner.next();
                        System.out.println("DIGITE A DATA DE VALIDADE DO CARTÃO");
                        dataValidade = scanner.next();
                        dadosCartaoCompleto = String.format("DESIGNAÇÃO: %s\nNÚMERO: %s\nCVC: %s\nDATA DE VALIDADE: %s\n",designacao,numeroCartao,cvc,dataValidade);
                        System.out.println("DIGITE SUA SENHA PARA CONFIRMAÇÃO: ");
                        int senhaVerificacao = scanner.nextInt();
                        if (senhaVerificacao == senha){
                            Patio patio = new Patio();
                            double valorRetirarVeiculo = patio.getValorRetirarVeiculo();
                            if (saldoConta>=valorRetirarVeiculo){
                                System.out.println("O VEÍCULO LIBERADO COM SUCESSO.");
                            } else {
                                System.out.println("SALDO INSUFICIENTE.");
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
