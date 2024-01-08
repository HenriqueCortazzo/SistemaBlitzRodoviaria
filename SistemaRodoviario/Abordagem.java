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
        RandomVeiculos randomVeiculos = new RandomVeiculos();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < placasAbordadas.length; i++) {
            if (placasAbordadas[i] != null) {
                boolean veiculoRegular = false;
                System.out.println("QUAL O TIPO DO VEÍCULO?");
                String tipoVeiculo = scanner.next();
                String placaVeiculo = placasAbordadas[i];
                long renavam = randomVeiculos.renavam();
                System.out.println("MARCA DO VEÍCULO: ");
                String marcaVeiculo = scanner.next();
                System.out.println("NOME DO VEÍCULO: ");
                String nomeVeiculo = scanner.next();
                System.out.println("ANO DO VEÍCULO: ");
                String anoVeiculo = scanner.next();

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
                // situacao.relatorio();
                if (habilitacao.equalsIgnoreCase("s") && portaHabilitacao.equalsIgnoreCase("s") && portaDocumentos.equalsIgnoreCase("s") && debitosVeiculo == 0) {
                    veiculoRegular = true;
                    situacao.relatorio(renavam, veiculoRegular, tipoVeiculo, marcaVeiculo, nomeVeiculo, anoVeiculo, placaVeiculo, ipva, licenciamento, habilitacao, portaHabilitacao, portaDocumentos, debitosVeiculo);

                } else if (!habilitacao.equalsIgnoreCase("s") && !portaHabilitacao.equalsIgnoreCase("s") && portaDocumentos.equalsIgnoreCase("s") && debitosVeiculo == 0) {
                    situacao.relatorio(renavam, veiculoRegular, tipoVeiculo, placaVeiculo, marcaVeiculo, nomeVeiculo, anoVeiculo, ipva, licenciamento, habilitacao, portaHabilitacao, portaDocumentos, debitosVeiculo);
                } else if (habilitacao.equalsIgnoreCase("s") && !portaHabilitacao.equalsIgnoreCase("s") && portaDocumentos.equalsIgnoreCase("s") && debitosVeiculo == 0) {
                    situacao.relatorio(renavam, veiculoRegular, tipoVeiculo, marcaVeiculo, nomeVeiculo, anoVeiculo, placaVeiculo, ipva, licenciamento, habilitacao, portaHabilitacao, portaDocumentos, debitosVeiculo);
                    //multa
                } else if (habilitacao.equalsIgnoreCase("s") && portaHabilitacao.equalsIgnoreCase("s") && !portaDocumentos.equalsIgnoreCase("s") && debitosVeiculo == 0) {
                    veiculoRegular = true;
                    situacao.relatorio(renavam, veiculoRegular, tipoVeiculo, marcaVeiculo, nomeVeiculo, anoVeiculo, placaVeiculo, ipva, licenciamento, habilitacao, portaHabilitacao, portaDocumentos, debitosVeiculo);
                } else if (debitosVeiculo != 0) {
                    situacao.relatorio(renavam, veiculoRegular, tipoVeiculo, marcaVeiculo, nomeVeiculo, anoVeiculo, placaVeiculo, ipva, licenciamento, habilitacao, portaHabilitacao, portaDocumentos, debitosVeiculo);
                    //patio
                }
            }
        }
        scanner.close();

    }
}
