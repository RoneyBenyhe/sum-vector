package application;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        int[] vector = new int[n];

        for(int i = 0; i < vector.length; i++){
            System.out.print("Digite um número: ");
            vector[i] = sc.nextInt();
        }

        int soma = 0;
        for(int i = 0; i < vector.length; i++){
            System.out.print("VALORES = " + vector[i] + " ");
            soma += vector[i];
        }

        System.out.print("\nVALORES = " + soma);
        System.out.print("\nMEDIA = " + (soma/vector.length));


        sc.close();
    }
}
