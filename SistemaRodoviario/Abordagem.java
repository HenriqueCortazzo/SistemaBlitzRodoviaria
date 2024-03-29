package SistemaRodoviario;

import java.util.Scanner;

public class Abordagem {
    private final String[] placasAbordadas = new String[10];

    public boolean isVeiculoRegular() {
        return veiculoRegular;
    }

    private boolean veiculoRegular = false;

    public void checarPlacas() {
        abordar();
    }

    private void abordar() {
        RandomVeiculos randomVeiculos = new RandomVeiculos();
        randomVeiculos.iniciarSistema();
        String[] placas = randomVeiculos.getPlacasVeiculos();
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
        ValidacaoDeVeiculos validacaoDeVeiculos = new ValidacaoDeVeiculos();
        RandomVeiculos randomVeiculos = new RandomVeiculos();
        Scanner scanner = new Scanner(System.in);
        for (String placasAbordada : placasAbordadas) {
            if (placasAbordada != null) {
                System.out.println("QUAL O TIPO DO VEÍCULO?");
                String tipoVeiculo = scanner.next();
                validacaoDeVeiculos.validarTipoVeiculo(tipoVeiculo);
                long renavam = randomVeiculos.renavam();
                System.out.println("MARCA DO VEÍCULO: ");
                String marcaVeiculo = scanner.next();
                validacaoDeVeiculos.validarMarcaVeiculo(marcaVeiculo);
                System.out.println("NOME DO VEÍCULO: ");
                String nomeVeiculo = scanner.next();
                System.out.println("ANO DO VEÍCULO: ");
                String anoVeiculo = scanner.next();
                validacaoDeVeiculos.validarAnoVeiculo(anoVeiculo);
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
                double multa = 0;
                double debitosVeiculo = licenciamento + ipva + multa;
                Situacao situacao = new Situacao();
                if (habilitacao.equalsIgnoreCase("s") && portaHabilitacao.equalsIgnoreCase("s") && portaDocumentos.equalsIgnoreCase("s") && debitosVeiculo == 0) {
                    veiculoRegular = true;
                    debitosVeiculo += multa;
                    situacao.relatorio(renavam, true, validacaoDeVeiculos.getTipoCarroSave(), validacaoDeVeiculos.getMarcaCarroSave(), nomeVeiculo, validacaoDeVeiculos.getAnoCarroSave(), placasAbordada, ipva, licenciamento, habilitacao, portaHabilitacao, portaDocumentos, debitosVeiculo);
                } else if (!habilitacao.equalsIgnoreCase("s") && !portaHabilitacao.equalsIgnoreCase("s") && portaDocumentos.equalsIgnoreCase("s") && debitosVeiculo == 0) {
                    multa = 1270;
                    debitosVeiculo += multa;
                    situacao.relatorio(renavam, false, validacaoDeVeiculos.getTipoCarroSave(), placasAbordada,  validacaoDeVeiculos.getMarcaCarroSave(), nomeVeiculo, validacaoDeVeiculos.getAnoCarroSave(), ipva, licenciamento, habilitacao, portaHabilitacao, portaDocumentos, debitosVeiculo);
                } else if (habilitacao.equalsIgnoreCase("s") && !portaHabilitacao.equalsIgnoreCase("s") && portaDocumentos.equalsIgnoreCase("s") && debitosVeiculo == 0) {
                    multa = 450;
                    debitosVeiculo += multa;
                    situacao.relatorio(renavam, false, validacaoDeVeiculos.getTipoCarroSave(),  validacaoDeVeiculos.getMarcaCarroSave(), nomeVeiculo, validacaoDeVeiculos.getAnoCarroSave(), placasAbordada, ipva, licenciamento, habilitacao, portaHabilitacao, portaDocumentos, debitosVeiculo);
                } else if (habilitacao.equalsIgnoreCase("s") && portaHabilitacao.equalsIgnoreCase("s") && !portaDocumentos.equalsIgnoreCase("s") && debitosVeiculo == 0) {
                    debitosVeiculo += multa;
                    situacao.relatorio(renavam, true, validacaoDeVeiculos.getTipoCarroSave(), validacaoDeVeiculos.getMarcaCarroSave(), nomeVeiculo, validacaoDeVeiculos.getAnoCarroSave(), placasAbordada, ipva, licenciamento, habilitacao, portaHabilitacao, portaDocumentos, debitosVeiculo);
                } else if (debitosVeiculo != 0) {
                    multa = 320;
                    debitosVeiculo += multa;
                    situacao.relatorio(renavam, false, validacaoDeVeiculos.getTipoCarroSave(),  validacaoDeVeiculos.getMarcaCarroSave(), nomeVeiculo, validacaoDeVeiculos.getAnoCarroSave(), placasAbordada, ipva, licenciamento, habilitacao, portaHabilitacao, portaDocumentos, debitosVeiculo);
                } else {
                    multa = 815.80;
                    debitosVeiculo += multa;
                    situacao.relatorio(renavam, false, validacaoDeVeiculos.getTipoCarroSave(),  validacaoDeVeiculos.getMarcaCarroSave(), nomeVeiculo, validacaoDeVeiculos.getAnoCarroSave(), placasAbordada, ipva, licenciamento, habilitacao, portaHabilitacao, portaDocumentos, debitosVeiculo);
                }
            }
        }
        boolean semVeiculosEncotrados = false;
        for (String placasAbordada : placasAbordadas) {
            if (placasAbordada != null) {
                ConclusaoGeral conclusaoGeral = new ConclusaoGeral();
                conclusaoGeral.conclusao();
                System.out.println("\n|----------VEÍCULOS LIBERADOS----------|\n");
                for (String s : Situacao.veiculosLiberados) {
                    if (s != null) {
                        System.out.println(s);
                    }
                }
                System.out.println("\n|----------VEÍCULOS APREENDIDOS----------|\n");
                for (String a : Situacao.veiculosApreendidos) {
                    if (a != null) {
                        System.out.println(a);
                    }
                }
                semVeiculosEncotrados = true;
                break;
            }
        }
        if (!semVeiculosEncotrados) {
            System.out.println("NÃO FORAM ENCOTRADOS VEÍCULOS.");
        }
        scanner.close();

    }


}
