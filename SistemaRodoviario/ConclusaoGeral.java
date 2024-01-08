package SistemaRodoviario;

public class ConclusaoGeral {

    public void conclusao(int veiculosApreendidos, int veiculosLiberados,long renavam,String placa){
        if (veiculosApreendidos==0){
            System.out.printf("FORAM LIBERADOS: %d VEÍCULOS, SENDO ELES: ",veiculosLiberados);
            System.out.printf("PLACA: %s | RENAVAM: %d\n",placa,renavam);
        }
        if (veiculosLiberados==0) {
            System.out.printf("FORAM APREENDIDOS: %d VEÍCULOS, SENDO ELES: ", veiculosApreendidos);
            System.out.printf("PLACA: %s | RENAVAM: %d\n",placa,renavam);
        }
        /*
        System.out.printf("FORAM APREENDIDOS: %d VEÍCULOS, SENDO ELES: ", veiculosApreendidos);
        System.out.printf("PLACA: %s | RENAVAM: %d\n",placa,renavam);
        System.out.printf("FORAM LIBERADOS: %d VEÍCULOS, SENDO ELES: ",veiculosLiberados);
        System.out.printf("PLACA: %s | RENAVAM: %d\n",placa,renavam);

         */
    }

}
