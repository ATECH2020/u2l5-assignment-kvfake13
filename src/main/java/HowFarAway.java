import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        // your code here.
        double latitude1;
        double longitude1;
        double latitude2;
        double longitude2;

        Scanner get = new Scanner(System.in);
        
        System.out.print("Enter the latitude of the starting location: " );
        latitude1 = get.nextDouble();
        System.out.print("Enter the longitude of the starting location: " );
        longitude1 = get.nextDouble();
        
        System.out.print("Enter the latitude of the ending location: " );
        latitude2 = get.nextDouble();
        System.out.print("Enter the longitude of the ending location: " );
        longitude2 = get.nextDouble();

        GeoLocation Start = new GeoLocation(latitude1, longitude1);
        GeoLocation End = new GeoLocation(latitude2, longitude2);
        double temp = Start.distanceFrom(End);
        
        System.out.print("The distance is " + temp + " miles.");

    }
}