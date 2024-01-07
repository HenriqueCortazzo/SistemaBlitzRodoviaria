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
    private void verificarVeiculos(){

    }

}
