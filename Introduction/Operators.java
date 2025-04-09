import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
         * // Arithmetic Operators - Binary Operators
         * int x = 10, y = 20;
         * System.out.println(x + y); // Addition
         * System.out.println(x * y); // Multiplication
         * System.out.println(y / x); // Division
         * int z = (x + y * 10); // Precedence of operators [y*10 is evaluated first]
         * System.out.println(z);
         * // Unary Operators
         * z = x++; // Postfix increment
         * System.out.println("z: " + z + " " + "x: " + x);
         * z = ++x; // Prefix increment
         * System.out.println("z: " + z + " " + "x: " + x);
         * 
         * 
         * // Assignment Operators
         * // == : Simple assignment operator
         * // +=, -=, *=, /=, %= : Compound assignment operators
         * x = 10;
         * y = 5; // Simple assignment
         * z = x + y; // Simple assignment
         * System.out.println("z: " + z);
         * 
         * x += y; // Compound assignment
         * System.out.println("x: " + x); // x = x + y
         * x %= y; // Compound assignment
         * System.out.println("x: " + x); // x = x % y
         * 
         * z = x = y; // Chained assignment - Left to right (x = y) is evaluated first
         * [z = (x + y) ]
         * System.out.println("z: " + z + " " + "x: " + x + " " + "y: " + y);
         * 
         * 
         * // Logical Operators - boolean expressions [ &&, ||, ! ]
         * String user = "admin", pass = "root";
         * String userInput = sc.nextLine();
         * String passInput = sc.nextLine();
         * if (user.equals(userInput) && pass.equals(passInput)) {
         * System.out.println("Login Successful");
         * } else {
         * System.out.println("Login Failed");
         * }
         * 
         * boolean p = true, q = false;
         * System.out.println(p && q); // Logical AND
         * System.out.println(p || q); // Logical OR
         * System.out.println(!p); // Logical NOT
         * 
         * 
         * // Relational Operators - boolean expressions [ <, >, <=, >=, ==, != ]
         * int x = 10, y = 20;
         * System.out.println(x < y); // Less than
         * System.out.println(x > y); // Greater than
         * System.out.println(x <= y); // Less than or equal to
         * System.out.println(x >= y); // Greater than or equal to
         * System.out.println(x == y); // Equal to
         * System.out.println(x != y); // Not equal to
         * 
         * 
         * // Bitwise Operators - Binary Operators
         * int x = 3, y = 6, z = 1;
         * System.out.println(x & y); // Bitwise AND
         * System.out.println(x | y); // Bitwise OR
         * System.out.println(x ^ y); // Bitwise XOR
         * System.out.println(~z); // Bitwise NOT
         * 
         * // Left Shift Operator
         * System.out.println(x << 1); // Left shift by 1 bit
         * System.out.println(x << 2); // Left shift by 2 bits
         * System.out.println(x << 4); // Left shift by 4 bits
         * System.out.println(x << 30); // Left shift by 30 bits
         * 
         * x = -1;
         * System.out.println(x << 1); // Left shift by 1 bit
         * 
         * // Right Shift Operator
         * x = 33;
         * System.out.println(x >> 1); // Right shift by 1 bit
         * System.out.println(x >> 2); // Right shift by 2 bits
         * 
         * x = -2;
         * System.out.println(x >> 1); // Right shift by 1 bit
         * System.out.println(x >> 2); // Right shift by 2 bits
         * 
         * // Unsigned Right Shift Operator
         * System.out.println(x >>> 1); // Unsigned right shift by 1 bit
         * System.out.println(x >>> 2); // Unsigned right shift by 2 bits
         */
        sc.close();
    }
}