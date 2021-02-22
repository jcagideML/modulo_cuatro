package ejercicios;

public class ejercicio1 {

<<<<<<< HEAD
    public static void main(String[] args) {
=======
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
>>>>>>> 5f192c2a120ff32578742eea90e21da8a6ba94ba

    }
}