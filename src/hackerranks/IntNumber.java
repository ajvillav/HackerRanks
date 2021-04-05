package hackerranks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntNumber {
    public void sumaCien() {
        
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingresa los números enteros que desees: ");
        int suma = 0;
        int nuevoNumero = 0;
        List<Integer> numeros = new ArrayList<>();

        int numeroTres = 0;
        int numeroDos = 0;
        int cualquierNumero = 1;
        int penultimo = 0;
        
        for (int i = 1; suma <= 100; i++) {
            nuevoNumero = Integer.parseInt(consola.nextLine());
            suma = nuevoNumero + suma;
            numeros.add(nuevoNumero);
            System.out.println("suma = " + suma);

            if (nuevoNumero == 3) {
                numeroTres++;
            }

            if (numeroTres == 3) {
                break;
            }

            if (nuevoNumero == 2) {
                numeroDos++;
            }

            if (numeroDos == 2) {
                break;
            }
            
            
            if (nuevoNumero == penultimo) {
                cualquierNumero++;  
            } else {
                cualquierNumero = 1;
            }
            
            penultimo = nuevoNumero;
            if (cualquierNumero == 8) {
                break;
            }

        }
        
        System.out.println("numeros = " + numeros);
    }
}
