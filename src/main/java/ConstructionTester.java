import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        // Start here!
        double taxRate;
        int numBoards;
        int numWindows;

        Scanner get = new Scanner(System.in);
        System.out.println("Enter the sales tax rate: ");
        taxRate = get.nextDouble();
        System.out.println("How many boards do you need? ");
        numBoards = get.nextInt();
        System.out.println("How many windows do you need? ");
        numWindows = get.nextInt();

        Construction myConstruction = new Construction(8.0,11.0,taxRate);

        double temp = myConstruction.lumberCost(numBoards);
        double temp2 = myConstruction.windowCost(numWindows);
        double total = temp + temp2;
        System.out.println("Total: " + total);

        double grandTotal = myConstruction.grandTotal(total); 
        
        
        System.out.println("Grand Total: " + grandTotal);
    }
}
