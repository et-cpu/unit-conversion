import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Select 1 to convert from miles\n" +
                "Select 2 to convert from inches\n" +
                "Select 3 to convert from feet\n" +
                "Select 4 to convert from yards\n" +
                "Select 5 to convert from cubits\n" +
                "Select 6 to convert from steps\n");
        int fromUnit = myObj.nextInt();  // Read user input

        System.out.println("Select 1 to convert to miles\n" +
                "Select 2 to convert to inches\n" +
                "Select 3 to convert to feet\n" +
                "Select 4 to convert to yards\n" +
                "Select 5 to convert to cubits\n" +
                "Select 6 to convert to steps\n");
        int toUnit = myObj.nextInt();  // Read user input

        System.out.print("Enter the value to convert:\n");
        float value = myObj.nextFloat();

        if (fromUnit == 1);
    }//my first Java code
}
