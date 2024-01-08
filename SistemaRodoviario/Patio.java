package SistemaRodoviario;

public class Patio {
    double valorDiaria = 350;
    int diasNoPatio = 0;

    private void retirarVeiculo(double debitos) {
        if (diasNoPatio > 0) {
            if (diasNoPatio <= 3) {
                double valorRetirarVeiculo = diasNoPatio * valorDiaria + debitos;
            } else if (diasNoPatio > 3 && diasNoPatio <= 7) {
                double valorRetirarVeiculo = diasNoPatio * (valorDiaria * 1.85) + debitos;
            } else if (diasNoPatio > 7 && diasNoPatio <= 12) {
                double valorRetirarVeiculo = diasNoPatio * (valorDiaria * 2.75) + debitos;
            } else if (diasNoPatio > 12 && diasNoPatio <= 20) {
                double valorRetirarVeiculo = diasNoPatio * (valorDiaria * 3.95) + debitos;
            } else if (diasNoPatio > 20 && diasNoPatio <= 30) {
                double valorRetirarVeiculo = diasNoPatio * (valorDiaria * 5.15) + debitos;
            } else {
                double valorRetirarVeiculo = diasNoPatio * (valorDiaria * 7.25) + debitos;
            }
        }
    }
}
