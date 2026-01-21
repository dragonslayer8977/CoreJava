package SingleInheritance;

public class Test {

    static void main(String[] args) {

        Animals tiger = new Animals();
        Humans jake = new Humans();

//        output:
//                Hey we are animals!!
//                Hey we are animals!!
//                Hey we are humans!!

        // Animals <- Humans

        jake.canSpeak();
        jake.canEat();

        tiger.canSpeak();
        tiger.canEat();
    }
}
