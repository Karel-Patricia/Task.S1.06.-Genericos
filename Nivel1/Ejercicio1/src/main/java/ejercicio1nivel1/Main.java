package ejercicio1nivel1;

public class Main {
    public static void main(String[] args) {

        NoGenericMethods obj1 = new NoGenericMethods("Primero", "Segundo", "Tercero");
        System.out.println("Obj 1:");
        obj1.mostrarValores();

        NoGenericMethods obj2 = new NoGenericMethods("Tercero", "Primero", "Segundo");
        System.out.println("Obj 2:");
        obj2.mostrarValores();

    }
}
