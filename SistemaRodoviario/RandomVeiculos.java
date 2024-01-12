package SistemaRodoviario;

import java.util.Random;

public class RandomVeiculos {
   private String [] placas =new String[10];
    public String[] placasVeiculos = {"JH02Z1", "KSA9H2", "QJO1X3", "OIE6P4", "PEO7X5", "KXA0S6", "EES9Q7", "LDS3A8", "OSA4P9", "LSA1I4"};
    private final int[] finalNumeroPlacas = new int[10];
    public void iniciarSistema() {
        chamarPlaca();
    }
    Random rd = new Random();
    public void gerarPlaca(){
        for (int i = 0; i < placas.length; i++) {
            char primeiraLetra = (char) ('A' + rd.nextInt(26));
            char segundaLetra = (char) ('A' + rd.nextInt(26));
            int primeiroNumero =  (1 + rd.nextInt(9));
            int segundoNumero =  (1 + rd.nextInt(9));
            char quartaLetra = (char) ('A' + rd.nextInt(26));
            int terceiroNumero =  (1 + rd.nextInt(9));
            String placaCrida = String.valueOf(primeiraLetra) +
                    String.valueOf(segundaLetra) +
                    String.valueOf(primeiroNumero) +
                    String.valueOf(segundoNumero) +
                    String.valueOf(quartaLetra) +
                    String.valueOf(terceiroNumero);
            placas[i] =placaCrida;
        }
    }
    private void chamarPlaca() {
        for (int i = 0; i < placasVeiculos.length; i++) {
            finalNumeroPlacas[i] = 1 + rd.nextInt(9);
            placasVeiculos[i] += finalNumeroPlacas[i];
        }

        for (String s: placasVeiculos){
            System.out.println("PLACA: "+s);
        }
    }
    public long renavam(){
        long renavam = 9999999999L;
        long randomNumber;
        randomNumber = 1111111111+Math.abs(rd.nextLong()) % renavam;
        return randomNumber;
    }
}
