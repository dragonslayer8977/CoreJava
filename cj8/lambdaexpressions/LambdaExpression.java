package lambdaexpressions;

public class LambdaExpression{


    // lambda expressions are only valid for functional interfaces
    // (parameters) -> single statement that is automatically returned OR (parameters) -> { statements }

    public static void main(String[] args) {

        ExampleInterface ei = new ExampleInterface () { // this is not creating an object for the interface
            // it is creating an anonymous class that implements the ExampleInterface and instantiating it at the same time
            @Override
            public void doSomething() {
                System.out.println ("do something...."); // implementing the abstract method
            }
        };
        ei.doSomething ();

        new ExampleInterface () {
            @Override
            public void doSomething() {
                System.out.println ("do something....");
            }
        }.doSomething ();    // this also do the same thing but I am not storing any reference of the anonymous class instance

        ExampleInterface exampleInterface = () -> System.out.println ("do something....");
        exampleInterface.doSomething ();
        // this only works if the interface has only one abstract method(essentially a functional interface)
        // "ExampleInterface exampleInterface" this defines the type of the lambda expression
        // since there is only one abstract method involved Java compiler maps the statements inside the lambda expression as the method definition
        // "exampleInterface.doSomething ()" this is standard method calling
        // here "exampleInterface" is just a reference to the lightweight functional object created by JVM of type "ExampleInterface"


    }

}
