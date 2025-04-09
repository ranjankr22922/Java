/*
 * //Find the nth term of an arithmetic progression. [ n = a + (n - 1) d ]
 * import java.util.Scanner;
 * 
 * public class practice {
 * 
 * public static int nthTerm(int a, int d, int n) {
 * int ans = a + (n - 1) * d;
 * return ans;
 * }
 * 
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter the first term (a): ");
 * int a = sc.nextInt();
 * System.out.println("Enter the common difference (d): ");
 * int d = sc.nextInt();
 * System.out.println("Enter the term number (n): ");
 * int n = sc.nextInt();
 * int result = nthTerm(a, d, n);
 * System.out.println("The " + n + "th term of the arithmetic progression is: "
 * + result);
 * 
 * sc.close();
 * }
 * }
 */

/*
 * // Find the nth term of a geometric progression. [ n = a * r^(n - 1) ]
 * import java.util.Scanner;
 * 
 * public class practice {
 * public static int nthTerm(int a, int r, int n) {
 * int ans = a * (int) Math.pow(r, n - 1);
 * return ans;
 * }
 * 
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter the first term (a): ");
 * int a = sc.nextInt();
 * System.out.println("Enter the common ratio (r): ");
 * int r = sc.nextInt();
 * System.out.println("Enter the term number (n): ");
 * int n = sc.nextInt();
 * int result = nthTerm(a, r, n);
 * System.out.println("The " + n + "th term of the geometric progression is: " +
 * result);
 * 
 * sc.close();
 * }
 * }
 */

/*
 * //Find the sum of n natural numbers. - Brute Force/ Naive Approach
 * import java.util.Scanner;
 * 
 * public class practice {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter the value of n: ");
 * int n = sc.nextInt();
 * int res = 0;
 * for (int i = 1; i <= n; i++) {
 * res = res + i;
 * }
 * System.out.println("The sum of first " + n + " natural numbers is: " + res);
 * sc.close();
 * }
 * }
 */

/*
 * // Find the sum of n even numbers. - Efficient Approach
 * import java.util.Scanner;
 * 
 * public class practice {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter the value of n: ");
 * int n = sc.nextInt();
 * int res = n * (n + 1) / 2;
 * System.out.println("The sum of first " + n + " even numbers is: " + res);
 * sc.close();
 * }
 * }
 */

/*
 * //Find the last digit of a number.
 * import java.util.Scanner;
 * import java.lang.Math;
 * 
 * public class practice {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * System.out.println("Enter the number: ");
 * int n = sc.nextInt();
 * int x = Math.abs(n); // To handle negative numbers we use Math.abs() -
 * Absolute Value
 * int lastDigit = x % 10;
 * System.out.println("The last digit of " + n + " is: " + lastDigit);
 * sc.close();
 * }
 * }
 */
