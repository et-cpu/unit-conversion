import java.util.Scanner;
// this program converts between different units of measurement such as inches, feet, cubits, steps, yards, and miles.

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object to detect what number is selected
        System.out.println("Select 1 to convert from miles\n" + //ask user to convert from
                "Select 2 to convert from inches\n" +
                "Select 3 to convert from feet\n" +
                "Select 4 to convert from yards\n" +
                "Select 5 to convert from cubits\n" +
                "Select 6 to convert from steps\n");
        int fromUnit = myObj.nextInt(); //scans number and stores it

        System.out.println("Select 1 to convert to miles\n" + //ask user to convert to
                "Select 2 to convert to inches\n" +
                "Select 3 to convert to feet\n" +
                "Select 4 to convert to yards\n" +
                "Select 5 to convert to cubits\n" +
                "Select 6 to convert to steps\n");
        int toUnit = myObj.nextInt(); //scans number and stores it

        System.out.print("Enter the value to convert: ");
        double value = myObj.nextDouble(); //scans number and stores it

        double convertedValue = convert(value, fromUnit, toUnit);
        System.out.println(value + " " + getUnitName(fromUnit) + " is equivalent to " + convertedValue + " " + getUnitName(toUnit) + "."); // print out final unit values and unit names

        myObj.close();
    }

    private static double convert(double value, int fromUnit, int toUnit) {
        // convert from the fromUnit to inches first
        double valueInInches = convertToInches(value, fromUnit);
        // convert from inches to the toUnit
        return convertFromInches(valueInInches, toUnit);
    }

    private static double convertToInches(double value, int fromUnit) { //math for from units
        switch (fromUnit) {
            case 1: return value; // Inches
            case 2: return value * 12; // Feet to Inches
            case 3: return value * 18; // Cubits to Inches
            case 4: return value * 12; // Steps to Inches (assuming 1 step = 1 foot = 12 inches)
            case 5: return value * 36; // Yards to Inches
            case 6: return value * 63360; // Miles to Inches
            default: throw new IllegalArgumentException();
        }
    }

    private static double convertFromInches(double value, int toUnit) { // math for to units
        switch (toUnit) {
            case 1: return value; // Inches
            case 2: return value / 12; // Inches to Feet
            case 3: return value / 18; // Inches to Cubits
            case 4: return value / 12; // Inches to Steps (assuming 1 step = 1 foot = 12 inches)
            case 5: return value / 36; // Inches to Yards
            case 6: return value / 63360; // Inches to Miles
            default: throw new IllegalArgumentException();
        }
    }

    private static String getUnitName(int unit) { // unit name final
        switch (unit) {
            case 1: return "Inches";
            case 2: return "Feet";
            case 3: return "Cubits";
            case 4: return "Steps";
            case 5: return "Yards";
            case 6: return "Miles";
            default: throw new IllegalArgumentException();
        }
    }
}

