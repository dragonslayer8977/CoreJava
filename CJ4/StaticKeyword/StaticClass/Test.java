package StaticKeyword.StaticClass;

public class Test {

    static void main(String[] args) {
        NonStaticOuterClass outerClassObj = new NonStaticOuterClass();
        outerClassObj.printMsg();
        System.out.println();

        NonStaticOuterClass.InnerClass innerClassObj = outerClassObj.new InnerClass();
        innerClassObj.printMsg();
        System.out.println();

        NonStaticOuterClass.InnerClass.printMsgw();
        System.out.println();

        NonStaticOuterClass.StaticInnerClass.printMsg();
        System.out.println();

        NonStaticOuterClass.StaticInnerClass staticInnerClassObj = new NonStaticOuterClass.StaticInnerClass();
        staticInnerClassObj.Printmsg();
    }
}
