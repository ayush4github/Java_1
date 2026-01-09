public class Data_types {
    //Primitive Data Types:-
    byte myByte = 2; //Small integers, 1 byte = 8 bits
    short myShort = 200; //small integers, 2 bytes = 16 bits
    int myInt = 55; //integers (most common), 4 bytes = 32 bits
    long myLong = 541234L; //long integers, 8 bytes = 64 bits
    float myFloat = 55.78f; //decimals, 4 bytes = 32 bits
    double myDouble = 241.2314; // long decimals, 8 bytes = 64 bits
    char myChar = 'A'; // characters, 2 bytes = 16 bits
    boolean myBool = true; //boolean, 1 bit
    //Non-primitive Data Types:-
    String myString = "John"; //String data type, collection of characters
    int[] age = {10, 20 , 30 , 40}; //collection of strings, int, float, double, etc. (collection of same type of data)
    // class (non-primitive) data type
    class Student{
        int id;
        String name;
    }
    Student s1 = new Student(); // Object data type, an instance of one of the class
    interface Vehicle{
        void run();
    }
    enum Day {MON, TUE, WED} // Used to store fixed set of constants
    // Wrapper classes - Object version of primitive data types
    Integer num = 10;
    Double d = 25.5;
}
