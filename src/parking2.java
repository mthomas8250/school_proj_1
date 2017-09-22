//Parking2.java
//
//
//
//First go back to Parking.java and correct any mistakes that you lost points on. Then copy all code and create a new project. Create a new class called Parking2 and paste your code into the new class (make sure to rename the class Parking2). Your job is to then break up each action into methods. You MUST have the following methods:
//
//public static void printReceiptHeader()
//
//public static double getNumberOfHours()
//
//public static double getBillAmount(double)
//
//public static void printBill(double)
public class parking2 {
    public static void main(String args[]) {
        printReceiptHeader();
        int nhours = getNumberOfHours();
        System.out.println("Number of Hours: " + nhours);

        int min = 2;
        double hours = nhours * .5;
        System.out.println("Number of hours: " + nhours);
        System.out.println("Total Cost: $" + (hours + min) + "0");
        System.out.println("\n\nThank You!");
    }
    public static void printReceiptHeader() {
        System.out.println("\nParking\n\nAddress:\n123 Drive\nCity, State, Zip\n");
    }

    public static int getNumberOfHours() {
        int hours = IO.getInt();
        return hours;

    }

//    public static double getBillAmount(double) {
//
//    }
//
//    public static void printBill(double,double) {
//        System.out.println();
//    }
}
