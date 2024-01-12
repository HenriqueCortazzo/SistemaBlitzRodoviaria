package SistemaRodoviario;

import java.util.Random;

public class RandomVeiculos {
    public String[] getPlacasVeiculos() {
        return placasVeiculos;
    }

    private final String[] placasVeiculos = new String[10];

    public void iniciarSistema() {
        gerarPlaca();
    }

    Random rd = new Random();

    private void gerarPlaca() {
        for (int i = 0; i < placasVeiculos.length; i++) {
            char primeiraLetra = (char) ('A' + rd.nextInt(26));
            char segundaLetra = (char) ('A' + rd.nextInt(26));
            char terceiraLetra = (char) ('A' + rd.nextInt(26));
            int primeiroNumero = (1 + rd.nextInt(9));
            int segundoNumero = (1 + rd.nextInt(9));
            char quartaLetra = (char) ('A' + rd.nextInt(26));
            int quintoNumero = (1 + rd.nextInt(9));
            String placaCrida = primeiraLetra +
                    String.valueOf(segundaLetra) +
                    terceiraLetra +
                    primeiroNumero +
                    segundoNumero +
                    quartaLetra +
                    quintoNumero;
            placasVeiculos[i] = placaCrida;
        }
        for (String s : placasVeiculos) {
            System.out.println("PLACA: " + s);
        }
    }

    public long renavam() {
        long renavam = 9999999999L;
        long randomNumber;
        randomNumber = 1111111111 + Math.abs(rd.nextLong()) % renavam;
        return randomNumber;
    }
}
