package SistemaRodoviario;

import java.util.Scanner;

public class Abordagem {
    private final String[] placasAbordadas = new String[10];

    public void checarPlacas() {
        abordar();
    }

    private void abordar() {
        RandomVeiculos randomVeiculos = new RandomVeiculos();
        randomVeiculos.iniciarSistema();
        String[] placas = randomVeiculos.placasVeiculos;
        Scanner sc = new Scanner(System.in);
        System.out.println("DIGITE O FINAL DA PLACA QUE DESEJA VERIFICAR: ");
        int finalPlaca = sc.nextInt();
        for (int i = 0; i < placas.length; i++) {
            int numero = Character.getNumericValue(placas[i].charAt(6));
            if (finalPlaca == numero) {
                placasAbordadas[i] = placas[i];
            }
        }
        for (String s : placasAbordadas) {
            if (s != null)
                System.out.println(s);
        }
        verificarVeiculos();
        sc.close();
    }

    private void verificarVeiculos() {
        for (int i = 0; i < placasAbordadas.length; i++) {
            boolean veiculoRegular = false;
            Scanner scanner = new Scanner(System.in);
            System.out.println("QUAL O TIPO DO VEÍCULO?");
            String tipoVeiculo = scanner.next();
            String placaVeiculo = placasAbordadas[i];
            System.out.println("DIGITE O VALOR DO IPVA EM ABERTO: ");
            double ipva = scanner.nextDouble();
            System.out.println("DIGITE O VALOR DO LICENCIAMENTO EM ABERTO:");
            double licenciamento = scanner.nextDouble();
            System.out.println("O PORTADOR POSSUI HABILITAÇÃO? S/N");
            String habilitacao = scanner.next();
            System.out.println("O PORTADOR ESTÁ PORTANDO HABILITAÇÃO? S/N");
            String portaHabilitacao = scanner.next();
            System.out.println("O PORTADOR ESTÁ PORTANDO DOCUMENTOS? S/N");
            String portaDocumentos = scanner.next();
            double debitosVeiculo = licenciamento + ipva;
            Situacao situacao = new Situacao();
            situacao.relatorio();
            if (habilitacao.equalsIgnoreCase("s") && portaHabilitacao.equalsIgnoreCase("s") && portaDocumentos.equalsIgnoreCase("s") && debitosVeiculo == 0) {
                veiculoRegular = true;
                System.out.println(veiculoRegular);
                situacao.relatorio();
                //relatorio
            } else if (!habilitacao.equalsIgnoreCase("s") && !portaHabilitacao.equalsIgnoreCase("s") && portaDocumentos.equalsIgnoreCase("s") && debitosVeiculo == 0) {
                veiculoRegular = false;
                System.out.println(veiculoRegular);
                situacao.relatorio();
                //relatorio
                //patio
            } else if (habilitacao.equalsIgnoreCase("s") && !portaHabilitacao.equalsIgnoreCase("s") && portaDocumentos.equalsIgnoreCase("s") && debitosVeiculo == 0) {
                veiculoRegular = false;
                System.out.println(veiculoRegular);
                situacao.relatorio();
                //relatorio
                //multa
            } else if (habilitacao.equalsIgnoreCase("s") && portaHabilitacao.equalsIgnoreCase("s") && !portaDocumentos.equalsIgnoreCase("s") && debitosVeiculo == 0) {
                veiculoRegular = true;
                System.out.println(veiculoRegular);
                situacao.relatorio();
                //relatorio
            } else if (debitosVeiculo != 0) {
                veiculoRegular = false;
                System.out.println(veiculoRegular);
                situacao.relatorio();
                //relatorio
                //patio
            }
        }

    }
}
