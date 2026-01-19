package ejercicio2nivel1;

public class GenericMethods {

    public static <T, U, V> void printElements(T arg1, U arg2, V arg3){
        System.out.println("Elemento 1: " + arg1);
        System.out.println("Elemento 2: " + arg2);
        System.out.println("Elemento 3: " + arg3);
        System.out.println("---------------------------");
    }
}
