package sealed_class;

// Sealed class can only have the specified subclass (subclasses are specified using permits)
// only those subclass can inherit the sealed class
// the subclass of a sealed class should be either another sealed class, final class or non-sealed class

sealed public class SealedClass permits Test, Test01, Test02{


    public void doSomething() {
        System.out.println("doing something inside the sealed class...");
    }

}


// non-sealed indicates that this class(in this case "Test") can be subclassed(have subclasses) freely
non-sealed class Test extends SealedClass {

}

// other class cannot extend final class, so the logic is sealed again
final class Test01 extends SealedClass {

}

// sealed class can have subclass that are sealed as well, but these class should also specify the allowed subclass list
sealed class Test02 extends SealedClass permits AnotherTest{

}

non-sealed class AnotherTest extends Test02 {

}

