package hackerranks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

    public void calcularFibonacci() {
        Scanner consola = new Scanner(System.in);

        System.out.println("Ingresa el número de la serie Fibonacci que deseas: ");
        int numero = Integer.parseInt(consola.nextLine());
        int ultimo = 1;
        int penultimo = 0;
        int resultado = 1;

        List<Integer> fibonacci = new ArrayList<>();

        for (int n = 1; numero >= n; n++) {
            resultado = ultimo + penultimo;
            penultimo = ultimo;
            ultimo = resultado;
            fibonacci.add(ultimo);
        }

        System.out.println("resultado = " + resultado);
        System.out.println("fibonacci = " + fibonacci);
    }
}
