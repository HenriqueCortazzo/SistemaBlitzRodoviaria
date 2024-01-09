package SistemaRodoviario;

public class ConclusaoGeral {

    public void conclusao() {
        System.out.println("|------------RELATÓRIO FINAL------------|");
        System.out.printf("FORAM APREENDIDOS: %d VEÍCULOS: \n", Patio.veiculosApreendidos);
        System.out.printf("FORAM LIBERADOS: %d VEÍCULOS: \n", Patio.veiculosLiberados);

    }
}


