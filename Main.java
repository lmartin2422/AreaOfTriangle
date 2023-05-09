import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the base and height " +
                "of a triangle separated by a space:\n");
        double base = input.nextDouble();
        double height = input.nextDouble();

        double area = (.5) * (base * height);

        System.out.println("The area of a triangle with a base of " + base +
                " and a height of " + height + " is " + area);
        System.out.println();

        System.out.println("Another way");
        AnotherWay.area_again(10,10);

    }
}