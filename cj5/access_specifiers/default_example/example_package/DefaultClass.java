package access_specifiers.default_example.example_package;

// default classes and methods are accessible inside the same package only

// package-level (package-private)

class DefaultClass {

    void doSomething() {
        System.out.println("doing something inside default class!!");
    }
}
