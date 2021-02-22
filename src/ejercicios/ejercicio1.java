package ejercicios;

public class ejercicio1 {

    public static void main(String[] args){
        public static void main(String[] args){
        Scanner in= new Scanner( System.in);
        System.out.println("Ingrese un numero");
        int numbre=in.nextInt();
        for(int i=1; i<= numbre ;i++){
            if (esPar(i)){
                System.out.println(i);

            }

        }

    }
    static boolean esPar(int n){
        return n%2==0;
    }

    }
}