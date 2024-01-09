package SistemaRodoviario;

import java.util.Scanner;

public class Patio {
    private double valorDiaria = 350;
    private int diasNoPatio = 0;

    public static int veiculosApreendidos = 0;
    public static int veiculosLiberados = 0;

    public void retirarVeiculo(double debitos, String placa, long renavam) {
        ConclusaoGeral conclusaoGeral = new ConclusaoGeral();
        Scanner scanner = new Scanner(System.in);
        System.out.println("QUANTOS DIAS O VEÍCULO PASSOU NO PÁTIO?");
        diasNoPatio = scanner.nextInt();
        System.out.println("ESTAMOS CALCULANDO, AGUARDE...");
        System.out.println("\n\n");
        double valorRetirarVeiculo = 0;
        if (diasNoPatio > 0) {
            if (diasNoPatio <= 3) {
                valorRetirarVeiculo = diasNoPatio * valorDiaria + debitos;
            } else if (diasNoPatio > 3 && diasNoPatio <= 7) {
                valorRetirarVeiculo = diasNoPatio * (valorDiaria * 1.85) + debitos;
            } else if (diasNoPatio > 7 && diasNoPatio <= 12) {
                valorRetirarVeiculo = diasNoPatio * (valorDiaria * 2.75) + debitos;
            } else if (diasNoPatio > 12 && diasNoPatio <= 20) {
                valorRetirarVeiculo = diasNoPatio * (valorDiaria * 3.95) + debitos;
            } else if (diasNoPatio > 20 && diasNoPatio <= 30) {
                valorRetirarVeiculo = diasNoPatio * (valorDiaria * 5.15) + debitos;
            } else {
                valorRetirarVeiculo = diasNoPatio * (valorDiaria * 7.25) + debitos;
            }
        }
        System.out.println("VALOR PARA RETIRADA DO VEÍCULO: " + valorRetirarVeiculo);
        System.out.println("\nDESEJA PROSSEGUIR PARA O PAGAMENTO? S/N ");
        String prosseguir = scanner.next();
        if (prosseguir.equalsIgnoreCase("s")) {
            System.out.println("PROCESSO DE PAGAMENTO EM DESENVOLVIMENTO.\n");
            //conclusaoGeral.conclusao(veiculosApreendidos, veiculosLiberados, renavam, placa);
        } else {
            System.out.println("O VEÍCULO PERMANECERÁ NO PÁTIO.\n");
        }
    }
}
