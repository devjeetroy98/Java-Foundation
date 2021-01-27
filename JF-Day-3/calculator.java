import java.util.Scanner;

class calculator{

    public static void add(){
        // Initializing the scanner object to take input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        // Used to take integer input using scanner object
        int n1 = sc.nextInt();
        System.out.println("Enter second number: ");
        // Used to take integer input using scanner object
        int n2 = sc.nextInt();
        System.out.println("The sum is:"+ (n1+n2));
    }

    public static void subtract(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int n2 = sc.nextInt();
        System.out.println("The difference is:"+ (n1-n2));
    }

    public static void multiply(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int n2 = sc.nextInt();
        System.out.println("The product is:"+ (n1*n2));
    }

    public static void divide(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int n2 = sc.nextInt();
        System.out.println("The quotient is:"+ (n1/n2));
        System.out.println("The remainder is:"+ (n1%n2));
    }

    public static void main(String[] args) {
        int ch;
        // Initializing the scanner object to take input
        Scanner sc = new Scanner(System.in);
        while (true){       
            System.out.println("1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            // Switch case in Java
            switch(ch){
                case 1: add();
                        break;
                case 2: subtract();
                        break;
                case 3: multiply();
                        break;
                case 4: divide();
                        break;
                case 5: System.exit(0); // Break out of the infinite loop
                // in case of unwanted input, this is printed.
                default : System.out.println("Enter correct choice!\n");

            }   
        }
    }   
}