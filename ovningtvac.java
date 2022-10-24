import java.util.Random;

public class ovningtvac {
    public static void main(String[] args) {
Random random = new Random();
        int randomtal1 = random.nextInt(10);
                int randomtal2 = random.nextInt(20);
                System.out.println(randomtal1);
                System.out.println(randomtal2);

                int addition = randomtal1 + randomtal2;
                int substraction = randomtal1 - randomtal2;
                int multi = randomtal1 * randomtal2;

                System.out.println("addition " + addition);
                System.out.println("Substraction " + substraction);
                System.out.println("multi " + multi);


    }
}
