package static_keyword;

public class StaticBlock {

    // if there is no static keyword even then the code executes correctly but this block will called as "initializer block"(executes for every object created)

    static {    // This block will only execute once when the class is being loaded into the memory
        System.out.println("Hey look I don't need main method anymore!"); // this statement was true before JDK -v 1.6
        System.out.println("Just Kidding bruh!");
    }

    StaticBlock() {
        System.out.println("I am inside the constructor or maybe my class has a new instance!");
    }

    public void printSmtg() {
        System.out.println("Printing something..");
    }

    static void main(String[] args) {
        StaticBlock obj01 = new StaticBlock();
        obj01.printSmtg();
        StaticBlock obj02 = new StaticBlock();
        obj02.printSmtg();
    }

}
