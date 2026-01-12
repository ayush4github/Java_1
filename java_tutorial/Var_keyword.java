public class Var_keyword {
    public static void main(String [] args){
        var x = 5;
        var myDouble = 55.47;
        var myNum = 22;
        var myChar1 = 'E';
        var myChar2 = '$'; // myChar2 will be of char data type as $ is a char data type
        var myBoolean = true;
        var myString = "Hello";
        var y; // This will give an error as var keyword only works when you assign a value to it.
        var k = 5; // var keyword assigns k as a int data type
        k = 22; // No-error as 22 is an integer and k is of int data type
        k = 9.99; // Error as 9.99 is a double and k can hold only int data type
    }
}
