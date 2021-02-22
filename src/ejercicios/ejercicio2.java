package ejercicios;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese n");
        int n = s.nextInt();
        System.out.println("Ingrese m");
        int m = s.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.println(i * m);
        }
    }
}
