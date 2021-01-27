import java.util.*;

class code1{
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        
        System.out.println("Sum is :"+ (a+b));
        System.out.println("Difference is :"+ (a - b));
        System.out.println("Product is :"+ (a * b));
        System.out.println("Quotient is :"+ (a / b));
        System.out.println("Remainder is :"+ (a % b));
    }
}