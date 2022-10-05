import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int z, x ,y;
        Scanner bob = new Scanner(System.in);
        System.out.println("Enter val one");
        z = bob.nextInt();
        System.out.println("Enter val two");
        x = bob.nextInt();
        System.out.println("Enter val three");
        y = bob.nextInt();
        if (z <= x) {
            System.out.println("lets learn code");
        }else if(z<=y){
            System.out.println("lets develop code");
        }
        else { System.out.println("lets share code");}
    }
}