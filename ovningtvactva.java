import  java.util.*;
public class ovningtvactva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tal1 = scanner.nextInt();
        int tal2 = scanner.nextInt();

        System.out.println("Tal1 är " + tal1);
        System.out.println(" Tal2 är " + tal2);

        int addidition = tal1 + tal2;
        int substraction = tal1 - tal2;
        int multiplication = tal1 * tal2;

        if (tal2 == 0){
            System.out.println("går ej dela med 0");

        }
            else {
                int division = tal1/tal2;
                System.out.println("resultat av division" + division);
        }
            System.out.println("Resultatet av additionen " + addidition);
        System.out.println("Resultatet av substraction " + substraction);
        System.out.println("Resultatet av multiplication " + multiplication);

    }
}
