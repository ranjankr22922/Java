
//Java
import java.util.Scanner;

class Point {
    int x, y;
    float z;
    boolean flag;
}

class test {
    /*
     * Multi Line
     * Comment
     */
    public static void main(String[] args) {

        /*
         * System.out.println("Hello World");
         * int age = 22;
         * String name = "Ranjan";
         * float weight = 65.5f; // f is used to specify float value
         * System.out.println("Name: " + name + " \nAge: " + age + " \nWeight: " +
         * weight);
         */

        /*
         * boolean isValid = true;
         * byte marks = 69;
         * double pi = 3.14d; // d is used to specify double value
         * float div = 10f / 3f;
         * long views = 10000000000l; // l is used to specify long value
         * char gender = 'M';
         * System.out.println(String.format(isValid + "\nMarks: " + marks + "\nPi: " +
         * pi + "\nDiv: " + div + "\nViews: "
         * + views + "\nGender: " + gender));
         */

        // Swap 2 numbers
        /*
         * int a = 10;
         * int b = 20;
         * int temp = 0;
         * System.out.println("Before Swapping: a = " + a + " b = " + b);
         * temp = a;
         * a = b;
         * b = temp;
         * System.out.println("After Swapping: a = " + a + " b = " + b);
         */

        /*
         * Point p = new Point();
         * p.x = 10;
         * p.y = 20;
         * System.out.println("X: " + p.x + "\nY: " + p.y);
         */

        /*
         * Point p1 = new Point();
         * p1.x = 10;
         * p1.y = 20;
         * Point p2 = p1;
         * p2.x = 30;
         * System.out.println("X of P1: " + p1.x + "\nX of P2: " + p2.x);
         */

        /*
         * int x1 = 10;
         * int x2 = x1;
         * x2 = 20;
         * System.out.println("X1: " + x1 + "\nX2: " + x2);
         */

        /*
         * Point p1 = new Point();
         * System.out.println(p1.x);
         * System.out.println(p1.z);
         * System.out.println(p1.flag);
         */

        /*
         * int x = 10;
         * Integer y = x; // Autoboxing
         * Integer y1 = y;
         * int z = y; // Unboxing
         * System.out.println("X: " + x + "\nY: " + y + "\nY1: " + y1 + "\nZ: " + z);
         */

        /*
         * int x = 55, y = 55; // Equal
         * if (x == y) {
         * System.out.println("Equal");
         * } else {
         * System.out.println("Not Equal");
         * }
         * 
         * Integer x1 = 400;
         * Integer y1 = 400;
         * if (x == y) { // Not Equal, Sometimes gives accidently equal due to cache
         * literals
         * System.out.println("Equal");
         * } else {
         * System.out.println("Not Equal");
         * }
         */

        /*
         * int x = 100;
         * long y = x; // Implicit Casting/Conversion
         * float z = y;
         * System.out.println("X: " + x + "\nY: " + y + "\nZ: " + z);
         * 
         * double d = 65.4;
         * int i = (int) d; // Explicit Casting/Conversion
         * char c = (char) i;
         * System.out.println("D: " + d + "\nI: " + i + "\nC: " + c);
         */

        Scanner sc = new Scanner(System.in);

        /*
         * System.out.println("Enter a String:");
         * String s = sc.nextLine();
         * System.out.println("Enter a Number:");
         * int n = sc.nextInt();
         * System.out.println("You Entered: " + s);
         * System.out.println("You Entered: " + n);
         */

        /*
         * int x = 10, y = 20;
         * char z = 'G';
         * String str = "FG";
         * 
         * System.out.println(x);
         * System.out.println(x + y);
         * System.out.println(x + " " + y);
         * System.out.print(z);
         * System.out.print(str + " ");
         * System.out.print("Courses");
         */

        /*
         * int x = 100, y = 200;
         * System.out.format("Value of x is %d and y is %d", x, y);
         * System.out.printf("\nValue of x is %d and y is %d\n", x, y);
         * 
         * float z = (float) Math.PI;
         * System.out.println(z);
         * System.out.format("Value of PI is %.2f", z); // %.2f means 2 decimal places
         * System.out.printf("\nValue of PI is %5.2f\n", z); // 5 spaces before 2
         * decimal places
         * System.out.printf("Value of PI is %05.2f\n", z); // 5 spaces before 2 decimal
         * places with 0 padding
         */

        sc.close();
    }
}