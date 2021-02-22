package ejercicios;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean esPrimo = esPrimo(n);
        if(esPrimo){
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        }
    }

    public static boolean esPrimo(int numero){
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=numero)){
            if (numero % contador == 0)
                primo = false;
            contador++;
        }
        return primo;
    }
}
