package SuperVar;

public class Parent {

    final String name = "Krishna";

    Parent() {
        System.out.println("Parent constructor running!!");
    }

    public void callMe() {
        System.out.println("I am " + name);
    }

}
