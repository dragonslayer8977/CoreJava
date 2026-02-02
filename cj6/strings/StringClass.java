package strings;

public class StringClass {

    // Strings are immutable in Java so any modification will only results in the creation of new string
    // strings are used to store passwords, URLs so for security purpose they are made immutable
    // making string immutable makes them thread-safe
    // saves memory in the string pool

    public static void main(String[] args) {

        String str01 = new String ("mahesh"); // different address in the memory new object in the heap
        String str02 = "mahesh"; // refers to same object in the memory
        String str03  = new String ("mahesh"); // different address in the memory
        String str04 = "mahesh"; // refers to the same object in the memory



        System.out.println (str01 == str02); // false
        System.out.println (str01 == str03); // false
        System.out.println (str02 == str04); // true // this is true since both the strings have same references in the string pool, == operator checks the reference not the value itself

        System.out.println (str01.equals (str02)); // true  // all these are true since the equals() checks the content of the string not the reference
        System.out.println (str01.equals (str03)); // true
        System.out.println (str02.equals (str04)); // true
    }
}
