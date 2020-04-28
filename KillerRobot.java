package killer.robot;
import java.util.Scanner;
import java.util.Random;

public class KillerRobot {
    public static void main (String[] args) {
       navigation();
       detectMouse();
       randomFatalHit();
    // batteryCheck();
       batteryCharge();

    }
    public static void navigation () {
        System.out.println("What is the obstacle in front? (none-0, wall-1, chair-2)");

        Scanner inputScanner = new Scanner(System.in);
        int obstacle = inputScanner.nextInt();

        while (!(obstacle == 0 || obstacle == 1 || obstacle == 2)) {
            System.out.println("Invalid obstacle. Try again.");
            obstacle = inputScanner.nextInt();
        }
        if (obstacle == 1) {
            System.out.println("Go sideways.");
        } else if (obstacle == 2) {
            System.out.println("Jump.");
        } else if (obstacle == 0) {
            System.out.println("Go forward.");
        }
    }
    public static void detectMouse () {
        System.out.println("Input number of pixels:");
        Scanner inputScanner = new Scanner (System.in);
        int pixels = inputScanner.nextInt();
        System.out.println("Pixels: " + pixels);

        while (!(pixels % 2 ==0)) {
            System.out.println("Keep searching for the mouse.");
            pixels = inputScanner.nextInt();
            System.out.println("Pixels: " + pixels);
        }   System.out.println("Mouse detected!");

        }
    public static void batteryCheck () {
        int robotBattery = 4;
        if(robotBattery <= 4) {
            System.out.println("Robot is ready to find and hit another target.");
        } else {
            System.out.println("Robot's battery needs charging.");
        }
        }
    public static void randomFatalHit () {
        Random rand = new Random();
        int randHitForce = rand.nextInt(10)+1;
        System.out.println("Hit force: " + randHitForce);

        while (randHitForce == 5) {
            System.out.println("Do not hit!");
            randHitForce = rand.nextInt(10)+1;
            System.out.println("Hit force: " + randHitForce);
        } System.out.println("Hitting!");

        }
    public static void batteryCharge () {
        System.out.println("The robot found a power socket.");
        Random rand = new Random();
        int randNumOne = rand.nextInt(1000)+1;
        int randNumTwo = rand.nextInt(1000)+1;
        System.out.println(randNumOne + " - " + randNumTwo);
        while (randNumOne <= randNumTwo) {
            System.out.println("There's no electrical power.");
            randNumOne = rand.nextInt(1000)+1;
            randNumTwo = rand.nextInt(1000)+1;
            System.out.println(randNumOne + " - " + randNumTwo);
        } System.out.println("There is electrical power. The robot is charging.");
    }
}



