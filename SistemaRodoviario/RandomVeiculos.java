package SistemaRodoviario;

import java.util.Random;

public class RandomVeiculos {
    public String[] placasVeiculos = {"JH02Z1", "KSA9H2", "QJO1X3", "OIE6P4", "PEO7X5", "KXA0S6", "EES9Q7", "LDS3A8", "OSA4P9", "LSA1I4"};
    private final int[] finalNumeroPlacas = new int[10];
    public void iniciarSistema() {
        chamarPlaca();
    }
    Random rd = new Random();
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
        randomNumber = Math.abs(rd.nextLong()) % renavam;
        return randomNumber;
    }
}
