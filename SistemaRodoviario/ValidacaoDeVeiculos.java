package SistemaRodoviario;

import java.util.Scanner;

public class ValidacaoDeVeiculos {
    private final String[] tipoVeiculos = {"Carro", "Moto", "Quadriciclo", "Microônibus", "Ônibus", "Reboque", "Caminhão", "Caminhonete", "Trator", "Guindaste", "Munck"};

    private final String[] marcaVeiculos = {"Volvo","Agrale","Audi","Iveco", "BMW","Citroen", "Chevrolet", "Dodge", "FIAT", "Ferrari", "Ford", "Honda", "Jeep", "Kia", "Lamborghini", "Land Rover", "Mercedes", "Nissan", "Peugeot", "Porsche", "Renault", "Toyota", "Volkswagen"};

    private String tipoCarroSave = "";
    private String marcaCarroSave = "";

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
                System.out.println("Digite outro tipo: ");
                tipo = scanner.next();
                validarTipoVeiculo(tipo);
            } while (tipoCarroSave.equalsIgnoreCase(""));
        }
    }public void validarMarcaVeiculo(String marca) {
        for (String validarVeiculo : marcaVeiculos) {
            if (validarVeiculo.equalsIgnoreCase(marca)) {
                marcaCarroSave = validarVeiculo;
                veiculoValidado = true;
                break;
            } else veiculoValidado = false;
        }
        if (!veiculoValidado) {
            do {
                System.out.println("Esse tipo de veiculo não é aceitável");
                System.out.println("Digite outro tipo: ");
                marca = scanner.next();
                validarMarcaVeiculo(marca);
            } while (marca.equalsIgnoreCase(""));
        }
    }

    public String getTipoCarroSave() {
        return tipoCarroSave;
    }

    public String getMarcaCarroSave() {
        return marcaCarroSave;
    }
}

