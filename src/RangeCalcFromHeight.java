/* Program to calculate the range of a projectile launched from a specific height, neglecting air resistance. */

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class RangeCalcFromHeight {

    RangeCalcFromHeight(double speed, double angleInDegrees, double height) {
        double g, angleInRads, range;                   //declaring variables.
        g = 9.8;                                        //gravity.
        angleInRads = angleInDegrees * Math.PI / 180;   //convert degrees to rads.
        range = speed * Math.cos(angleInRads) * (((speed * Math.sin(angleInRads)) + Math.sqrt(((speed * Math.sin(angleInRads)) * (speed * Math.sin(angleInRads))) + (2 * g * height))) / g);

        /* Rounding */

        BigDecimal brange = new BigDecimal(range);
        brange = brange.round(new MathContext(3));
        double rrange = brange.doubleValue();

        System.out.println("Range = " + rrange + " metres. (3 s.f.)");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial velocity of the projectile (ms^-1): ");

        String initVelocity = sc.nextLine();
        System.out.println("Enter the angle of launch (Deg): ");

        String angleLaunch = sc.nextLine();
        System.out.println("Enter the height that the projectile was launched from (m): ");

        String initHeight = sc.nextLine();

        new RangeCalcFromHeight(Integer.parseInt(initVelocity),Integer.parseInt(angleLaunch), Integer.parseInt(initHeight));
    }
}
