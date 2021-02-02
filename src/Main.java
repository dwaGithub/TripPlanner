import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<SkiTrip> skiList = new ArrayList<>();
        ArrayList<BeachTrip> beachList = new ArrayList<>();
        menu(input, skiList, beachList);
    }
    private static void menu(Scanner input, ArrayList<SkiTrip> skiList, ArrayList<BeachTrip> beachList){
        System.out.println("***Welcome to Trip Planner inc.***\nTo choose a trip, press '1' for Ski Trip.\npress '2' for Beach Trip");
        int ans = input.nextInt();
        if(ans == 1){
            createSkiTrip(input,skiList);
        }else if(ans == 2){
            createBeachTrip(input,beachList);
        }
    }
    private static void createSkiTrip(Scanner input, ArrayList<SkiTrip> skiList){
        System.out.println("Choose country: ");
        String country = input.next();
        System.out.println("Choose duration, in days: ");
        int duration = input.nextInt();
        System.out.println("Price:");
        int price = input.nextInt();
        System.out.println("Guide name");
        String guide = input.next();
        System.out.println("Choose equipment: ");
        String equipment = input.next();
        System.out.println("Choose liftcard type");
        String liftCard = input.next();
        SkiTrip t1 = new SkiTrip(country, duration, price, guide, equipment, liftCard);
        skiList.add(t1);
        System.out.println(t1);
    }
    private static void createBeachTrip(Scanner input, ArrayList<BeachTrip> beachList){
        System.out.println("Choose country: ");
        String country = input.next();
        System.out.println("Choose duration, in days: ");
        int duration = input.nextInt();
        System.out.println("Price:");
        int price = input.nextInt();
        System.out.println("Guide name");
        String guide = input.next();
        System.out.println("Enter level of UV Protection: ");
        String uvProtection = input.next();
        System.out.println("Enter beach area: ");
        String area = input.next();
        BeachTrip b1 = new BeachTrip(country, duration, price, guide, uvProtection, area);
        beachList.add(b1);
    }
}
