package ejercicio1nivel1;

public class Main {
    public static void main(String[] args) {

        NoGenericMethods example1 = new NoGenericMethods("Text", 42, 3.14);
        NoGenericMethods example2 = new NoGenericMethods(3.14, "Text", 42);

        System.out.println(example1.getElement1());
        System.out.println(example1.getElement2());
        System.out.println(example1.getElement3());
    }
}
