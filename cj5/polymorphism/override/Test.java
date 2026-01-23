package polymorphism.override;

// Method overriding or run-time polymorphism or dynamic polymorphism

// runtime polymorphism since the method call is resolved during the runtime by the JVM by the actual object type

public class Test {

    static void main() {

        Parent a;  // reference type of "a" is Parent

        a = new FirstChild(); // the object type of "a" i.e., FirstClass override the doSomething method in Parent class
        a.doSomething();

        a = new SecondChild(); // the object type of "a" i.e., SecondClass override the doSomething method in Parent class
        a.doSomething();
    }
}
