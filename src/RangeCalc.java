import java.util.Scanner;

public class RangeCalc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String initVelocity, angleLaunch;
        System.out.println("Is your projectile projected at ground level (y/n)? ");
        String ground = sc.nextLine();

        if (ground.equals("y")) {
            System.out.println("Enter the initial velocity of the projectile (ms^-1): ");

            initVelocity = sc.nextLine();
            System.out.println("Enter the angle of launch (Degrees): ");

            angleLaunch = sc.nextLine();
            new RangeCalcFromGround(Double.parseDouble(initVelocity), Double.parseDouble(angleLaunch));
        } else if (ground.equals("n")) {
            System.out.println("Enter the initial velocity of the projectile (ms^-1): ");

            initVelocity = sc.nextLine();
            System.out.println("Enter the angle of launch (Deg): ");

            angleLaunch = sc.nextLine();
            System.out.println("Enter the height that the projectile was launched from (m): ");

            String initHeight = sc.nextLine();
            new RangeCalcFromHeight(Double.parseDouble(initVelocity),Double.parseDouble(angleLaunch), Double.parseDouble(initHeight));
        } else {
            System.out.println("Please enter either 'y' or 'n'. ");
        }
    }
}
