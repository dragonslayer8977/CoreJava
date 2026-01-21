package StaticKeyword.StaticClass;


public class NonStaticOuterClass {


    public void printMsg() {
        System.out.println("non-static method of the Outer class i.e., \"NonStaticOuterClass\"");
        System.out.println("to access this I created an object for \"NonStaticOuterClass\"");
    }

    class InnerClass {

        public void printMsg() {
            System.out.println("non-static method of the non-static Inner class i.e., \"InnerClass\"");
            System.out.println("to access this I created an object for \"NonStaticOuterClass\" and \"InnerClass\"");
        }

        public static void printMsgw() {
            System.out.println("Static method inside non-static Inner class i.e., \"InnerClass\"");
            System.out.println("to access this I created an object for \"InnerClass\"");
        }
    }

    static class StaticInnerClass {

        public static void printMsg() {
            System.out.println("static method inside static Inner class i.e., \"StaticInnerClass\"");
            System.out.println("to access this I haven't created any object");
        }

        public void Printmsg() {

            System.out.println("non-static method inside static Inner class i.e., \"StaticInnerClass\"");
            System.out.println("to access this I created an object for  \"StaticInnerClass\"");
        }
    }
}

