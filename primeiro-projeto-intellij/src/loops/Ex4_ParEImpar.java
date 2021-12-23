package loops;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

import java.util.Locale;
import java.util.Scanner;

public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de Números: ");
        quantNumeros = sc.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = sc.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            count++;
        }while(count < quantNumeros);
        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Ímpar: " + quantImpares);


        sc.close();
    }
}
