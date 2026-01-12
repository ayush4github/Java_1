public class Floating_point_types {
    public static void main(String [] args){
        float myFloat = 55.23f; // float, 2 bytes = 16 bits, 65536 combinations, -32768 to 32767
        System.out.println(myFloat);
        double myDouble = 2455.4123; // double, 4 bytes = 32 bits, 4,29,49,67,296 combinations, -2,14,74,83,648 to 2,14,74,83,647
        System.out.println(myDouble);
        double d1 = 12E4d; //Scienctific number, e represents the power of 10. here 12E4 means 12 x 10^4 and d represents double
        System.out.println(d1);
    }
}
