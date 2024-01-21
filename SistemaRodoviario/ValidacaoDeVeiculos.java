package SistemaRodoviario;

import java.util.Scanner;

public class ValidacaoDeVeiculos {
    private final String[] tipoVeiculos = {"Carro", "Moto", "Quadriciclo", "Microônibus", "Ônibus", "Reboque", "Caminhão", "Caminhonete", "Trator", "Guindaste", "Munck"};

    private final String[] marcaVeiculos = {"Volvo", "Agrale", "Audi", "Iveco", "BMW", "Citroen", "Chevrolet", "Dodge", "FIAT", "Ferrari", "Ford", "Honda", "Jeep", "Kia", "Lamborghini", "Land Rover", "Mercedes", "Nissan", "Peugeot", "Porsche", "Renault", "Toyota", "Volkswagen"};
    private String tipoCarroSave = "";
    private String marcaCarroSave = "";
    private String anoCarroSave = "";

    private boolean veiculoValidado = false;
    Scanner scanner = new Scanner(System.in);

    public void validarTipoVeiculo(String tipo) {
        for (String validarVeiculo : tipoVeiculos) {
            if (validarVeiculo.equalsIgnoreCase(tipo)) {
                tipoCarroSave = validarVeiculo;
                veiculoValidado = true;
                break;
            } else veiculoValidado = false;
        }
        if (!veiculoValidado) {
            do {
                System.out.println("Esse tipo de veiculo não é aceitável");
                System.out.println("Digite um tipo válido: ");
                tipo = scanner.next();
                validarTipoVeiculo(tipo);
            } while (tipoCarroSave.equalsIgnoreCase(""));
        }
    }

    public void validarMarcaVeiculo(String marca) {
        for (String validarVeiculo : marcaVeiculos) {
            if (validarVeiculo.equalsIgnoreCase(marca)) {
                marcaCarroSave = validarVeiculo;
                veiculoValidado = true;
                break;
            } else veiculoValidado = false;
        }
        if (!veiculoValidado) {
            do {
                System.out.println("Essa marca de veiculo não é aceitável");
                System.out.println("Digite uma marca válida: ");
                marca = scanner.next();
                validarMarcaVeiculo(marca);
            } while (marca.equalsIgnoreCase(""));
        }
    }

    public void validarAnoVeiculo(String ano) {
        int anoVeiculo = Integer.parseInt(ano);

        if (anoVeiculo <= 2024 && anoVeiculo > 1985) {
            anoCarroSave = String.valueOf(anoVeiculo);
            veiculoValidado = true;
        } else veiculoValidado = false;
        if (!veiculoValidado) {
            do {
                System.out.println("Esse ano do veiculo não é aceitável");
                System.out.println("Digite um ano válido: ");
                ano = scanner.next();
                validarAnoVeiculo(ano);
            } while (ano.equalsIgnoreCase(""));
        }
    }

    public String getTipoCarroSave() {
        return tipoCarroSave;
    }

    public String getMarcaCarroSave() {
        return marcaCarroSave;
    }

    public String getAnoCarroSave() {
        return anoCarroSave;
    }
}

