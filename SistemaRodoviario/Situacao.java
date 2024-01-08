package SistemaRodoviario;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Situacao {

    public void relatorio(String tipo, String placa, double ipva, double licenciamento, String habilitacao, String pHabilitacao, String pDocumentos, double debitosTotais) {
        Abordagem abordagem = new Abordagem();
        System.out.println("\nTIPO DO VEÍCULO: " + tipo.toUpperCase());
        System.out.println("PLACA DO VEÍCULO: " + placa.toUpperCase());
        System.out.printf("VALOR IPVA EM ABERTO: R$ %.2f\n",ipva);
        System.out.printf("VALOR LICENCIAMENTO EM ABERTO: R$ %.2f\n", licenciamento);
        if (habilitacao.equalsIgnoreCase("s")) {
            System.out.println("HABILITAÇÃO: OK");
        } else {
            System.out.println("HABILITAÇÃO: NADA CONSTA");
        }
        if (pHabilitacao.equalsIgnoreCase("s")) {
            System.out.println("CIDADÃO PORTA HABILITAÇÃO: OK");
        } else {
            // VOCE ESTA NA BRANCH SITUACAO E NAO FEZ O MERGE AINDA!!!!!!!
            System.out.println("CIDADÃO PORTA HABILITAÇÃO: NADA CONSTA");
        }
        if (pDocumentos.equalsIgnoreCase("s")) {
            System.out.println("CIDADÃO PORTA DOCUMENTOS: OK");
        } else {
            System.out.println("CIDADÃO PORTA DOCUMENTOS: NADA CONSTA");
        }
        System.out.printf("DÉBITOS TOTAIS: R$ %.2f\n", debitosTotais);
    }

}
