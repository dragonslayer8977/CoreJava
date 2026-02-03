package functionalinterface;

@FunctionalInterface
public interface FuntionalInterfaceExample {

    public final int A = 454; // final members are allowed in interface so they are also allowed in funtional interface

    void doSomething(); // only one abstract method should be present

    static void m1(){
        System.out.println ("This is a static method!"); // static methods are not considered abstract and are allowed in functional interface
    }

    default void m2() {
        printSomething ("This is a default method!"); // default methods are allowed
    }

    private void printSomething(String s) {
        System.out.println (s); // private methods are allowed but can only be used inside the interface for utility purpose
    }
}
