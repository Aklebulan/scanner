import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int z, x;
        Scanner bob = new Scanner(System.in);
        System.out.println("Enter val one");
        z = bob.nextInt();
        System.out.println("Enter val two");
        x = bob.nextInt();
        if (z <= x) {
            System.out.println("lets develop code");
        }else {
            System.out.println("lets share code");
        }
    }
}