import java.io.*;

public class bufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a String:");
        String s = br.readLine();
        System.out.println("Enter a Number:");
        int n = Integer.parseInt(br.readLine());
        System.out.println("You Entered: " + s + " and " + n);
    }
}