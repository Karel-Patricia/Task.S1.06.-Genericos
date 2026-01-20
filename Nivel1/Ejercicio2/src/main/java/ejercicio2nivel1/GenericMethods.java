package ejercicio2nivel1;

public class GenericMethods {

    public static <T, U, V> void printElements(T arg1, U arg2, V arg3){
        System.out.println("Element 1: " + arg1 + "\n"
                + "Element 2: " + arg2 + "\n"
                + "Element 3: " + arg3 + "\n");
    }
}
