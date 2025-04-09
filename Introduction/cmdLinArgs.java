public class cmdLinArgs {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.print("Command Line Arguments are : ");
            for (String x : args) { // for each loop
                System.out.print(x + " ");
            }
        }

        else {
            System.out.println("No Command Line Arguments");
        }

        /*
         * Escape Sequences
         * System.out.println("Welcome \"Ranjan\"");
         * System.out.println("C:\\xyz\\abc.txt"); // C:\xyz\abc.txt
         */
    }

}
