/* Program to calculate the range of a projectile launched from the ground, neglecting air resistance. */

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class RangeCalcFromGround {

    RangeCalcFromGround(double speed, double angleInDegrees) {
        double g, angleInRads, range;                   //declaring variables.
        g = 9.8;                                        //gravity.
        angleInRads = angleInDegrees * Math.PI / 180;   //convert degrees to rads.
        range = 2 * speed * speed * Math.sin(angleInRads) * Math.cos(angleInRads) / g; //formula for distance of projectile when launched from the ground.

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
        System.out.println("Enter the angle of launch (Degrees): ");

        String angleLaunch = sc.nextLine();

        new RangeCalcFromGround(Integer.parseInt(initVelocity),Integer.parseInt(angleLaunch));
    }
}
