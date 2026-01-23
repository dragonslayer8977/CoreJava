package polymorphism;

// Method overloading or compile-time polymorphism or static polymorphism

// compile-time polymorphism since the compiler determines which method to call during compilation process.

public class Overload {

    String name = "name";
    int year = 2026;

    // constructor overloading

    Overload(){}

    Overload(String name) {
        this.name = name;
    }

    Overload(int year) {
        this.year = year;
    }

    Overload(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void doSomething(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a+b));
    }

    public void doSomething(String work) {
        System.out.println("Work: " + work);
    }

    public void doSomething() {
        System.out.println("Nothing to do!!");
    }

    static void main() {

        Overload obj01 = new Overload("Techouts", 2030);
        System.out.println(obj01.name + " " + obj01.year);

        Overload obj02 = new Overload();
        System.out.println(obj02.name + " " + obj02.year);

        Overload obj03 = new Overload(2030);
        System.out.println(obj03.name + " " + obj03.year);

        obj01.doSomething();
        obj01.doSomething(5494893, 45454654);
        obj01.doSomething("Learn Java");



    }


}
