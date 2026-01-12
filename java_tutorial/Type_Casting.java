public class Type_Casting {
    public static void main(String [] args){
        // Java Type Casting has two main types:-
        // 1. Widening cassting (automatic) = Converting a smaller type to a larger type size.
        // byte-> short->char->int->long->float->double
        // 2. Narrowing casting (manual) = Converting a larger type to a smaller type size.
        // double->float->long->int->char->short->byte
        
        //Examples of widening casting:
        int myInt = 9;
        float myFloat = myInt;
        double myDouble = myInt;
        System.out.println(myInt);
        System.out.println(myFloat);
        System.out.println(myDouble);
        System.out.println();
        //Examples of narrowing casting:
        double myDouble2 = 9.78d;
        float myFloat2 = (float) myDouble2;
        int myInt2 = (int) myDouble2;
        System.out.println(myFloat2);
        System.out.println(myInt2);
    }
}