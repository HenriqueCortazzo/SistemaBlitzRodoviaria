package SistemaRodoviario;

import java.util.Scanner;

public class ValidacaoDeVeiculos {
    private final String[] tipoVeiculos = {"Carro", "Moto", "Quadriciclo", "Microônibus", "Ônibus", "Reboque", "Caminhão", "Caminhonete", "Trator", "Guindaste", "Munck"};

    private final String[] marcaCarros = {"Audi", "BMW", "Chevrolet", "Dodge", "FIAT", "Ferrari", "Ford", "Honda", "Jeep", "Kia", "Lamborghini", "Land Rover", "Mercedes", "Nissan", "Peugeot", "Porsche", "Renault", "Toyota", "Volkswagen"};

    private String tipoCarroSave = "";

    private boolean veiculoValidado = false;
    Scanner scanner = new Scanner(System.in);

    public void validarVeiculo(String tipo) {
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
                validarVeiculo(tipo);
            } while (tipoCarroSave.equalsIgnoreCase(""));
        }
    }

    public String getTipoCarroSave() {
        return tipoCarroSave;
    }
}

