package ejercicios;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de primeros números primos que desea ver:");

        int n = scanner.nextInt();

        getNPrimes(n);

        scanner.close();
    }

    public static void getNPrimes(int n)
    {
        int cont = 0;
        int aux = 0;

        while(cont<n){
            if(isPrime(aux)){
                cont++;
                System.out.println(aux);
            }
            aux++;
        }
    }

    public static boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
