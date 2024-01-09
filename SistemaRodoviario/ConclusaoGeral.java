package SistemaRodoviario;

public class ConclusaoGeral {

    public void conclusao(int veiculosApreendidos, int veiculosLiberados, long renavam, String placa) {
        System.out.println("|------------RELATÓRIO FINAL------------|");
        System.out.printf("FORAM APREENDIDOS: %d VEÍCULOS: \n", Patio.veiculosApreendidos);
        System.out.printf("FORAM LIBERADOS: %d VEÍCULOS: \n", Patio.veiculosLiberados);
        //System.out.printf("PLACA: %s | RENAVAM: %d\n", placa, renavam);
    }
}


