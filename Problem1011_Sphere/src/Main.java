import java.io.IOException;
import java.util.Scanner;

public class Main {

    static final double pi = 3.14159;

    public static void main(String[] args) throws IOException {
        Scanner UserImput = new Scanner(System.in);
        double radius = UserImput.nextInt();

        double SphereVolume = (4.0/3.0)*pi*(Math.pow(radius, 3));
        System.out.printf("VOLUME = %.3f\n", SphereVolume);

    }

}