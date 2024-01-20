package SistemaRodoviario;

import java.util.Scanner;

public class ValidacaoDeVeiculos {
    private final String[] tipoVeiculos = {"Carro", "Moto", "Quadriciclo", "Microônibus", "Ônibus", "Reboque", "Caminhão", "Caminhonete", "Trator", "Guindaste", "Munck"};

    private final String[] marcaCarros = {"Audi", "BMW", "Chevrolet", "Dodge", "FIAT", "Ferrari", "Ford", "Honda", "Jeep", "Kia", "Lamborghini", "Land Rover", "Mercedes", "Nissan", "Peugeot", "Porsche", "Renault", "Toyota", "Volkswagen"};

    public void validarVeiculo(String tipo) {
        for (String validarVeiculo : tipoVeiculos) {
            do {
                System.out.println("Esse tipo de veiculo não é aceitável");
                System.out.println("Digite outro tipo: ");
                Scanner scanner = new Scanner(System.in);
                tipo = scanner.next();
            } while (validarVeiculo.equalsIgnoreCase(tipo));
        }
    }

}
