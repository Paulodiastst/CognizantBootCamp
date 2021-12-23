package loops;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

import java.util.Locale;
import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int nota;

        System.out.println("Nota: ");
        nota = sc.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota Iválida! Digite novamente: ");
            nota = sc.nextInt();
        }
    }
}
